package com.example.remedio.exercicio4;

import com.example.remedio.exercicio4.exception.ParametroInvalidoException;
import com.example.remedio.exercicio4.model.Estoque;
import com.example.remedio.exercicio4.model.Remedio;
import com.example.remedio.exercicio4.repository.EstoqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AdicionarEstoqueUseCaseImpl implements AdicionarEstoqueUseCase {
    private final EstoqueRepository estoqueRepository;
    private final GaranteExistenciaRemedioUseCase garanteExistenciaRemedioUseCase;
    @Autowired
    public AdicionarEstoqueUseCaseImpl(EstoqueRepository estoqueRepository, GaranteExistenciaRemedioUseCase garanteExistenciaRemedioUseCase) {
        this.estoqueRepository = estoqueRepository;
        this.garanteExistenciaRemedioUseCase = garanteExistenciaRemedioUseCase;
    }
    @Override
    public void adicionarNoEstoque(Integer idRemedio, Integer quantidade, String nomeRemedio, Integer dosagemMgRemedio) {
        validaQuantidadePositiva(quantidade);
        Remedio remedio = garanteExistenciaRemedioUseCase.encontraRemedio(idRemedio, nomeRemedio, dosagemMgRemedio);
        Estoque estoque = encontraEstoque(remedio.getId());
        estoque.setQuantidade(estoque.getQuantidade() + quantidade);
        estoqueRepository.save(estoque);
    }
    private void validaQuantidadePositiva(Integer quantidade) {
        if (quantidade < 0) {
            throw new ParametroInvalidoException("quantidade", "Quantidade adicionada no estoque não pode ser negativa");
        }
    }
    private Estoque encontraEstoque(Integer idRemedio) {
        Estoque estoqueAtual = estoqueRepository.getEstoqueAtual(idRemedio);
        if (estoqueAtual == null) {
            Estoque estoque = new Estoque();
            estoque.setQuantidade(0);
            estoque.setIdRemedio(idRemedio);
            return estoque;
        }
        return estoqueAtual;
    }
}
