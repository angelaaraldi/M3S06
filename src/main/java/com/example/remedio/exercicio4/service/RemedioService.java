package com.example.remedio.exercicio4.service;

import com.example.remedio.exercicio4.AdicionarEstoqueUseCase;
import com.example.remedio.exercicio4.SalvarRemedioUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RemedioService {
    private final SalvarRemedioUseCase salvarRemedioUseCase;
    private final AdicionarEstoqueUseCase adicionarEstoqueUseCase;
    @Autowired
    public RemedioService(SalvarRemedioUseCase salvarRemedioUseCase, AdicionarEstoqueUseCase adicionarEstoqueUseCase) {
        this.salvarRemedioUseCase = salvarRemedioUseCase;
        this.adicionarEstoqueUseCase = adicionarEstoqueUseCase;
    }
    public void salvarRemedio(String nome, Integer dosagemEmMg) {
        salvarRemedioUseCase.salvarRemedio(nome, dosagemEmMg);
    }
    public void adicionarNoEstoque(Integer idRemedio, Integer quantidade, String nomeRemedio, Integer dosagemMgRemedio) {
        adicionarEstoqueUseCase.adicionarNoEstoque(idRemedio, quantidade, nomeRemedio, dosagemMgRemedio);
    }
}
