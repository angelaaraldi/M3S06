package com.example.remedio.exercicio3.strategy;

import com.example.remedio.exercicio3.exception.RegraDeNegocioException;
import com.example.remedio.exercicio3.model.FormaPagamento;
import com.example.remedio.exercicio3.model.InformacoesPagamento;
import com.example.remedio.exercicio3.model.PessoaPaciente;
import com.example.remedio.exercicio3.service.BradescoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConvenioBradescoPagamentoStrategy implements PagamentoStrategy {
    @Autowired
    private BradescoService bradescoService;
    @Override
    public FormaPagamento getFormaPagamentoEsperada() {
        return FormaPagamento.CONVENIO_BRADESCO;
    }

    @Override
    public void processaPagamento(PessoaPaciente paciente, InformacoesPagamento informacoesPagamento, Float valor) {
        if(paciente.getCpf() == null) {
            throw new RegraDeNegocioException("Informações obrigatórias não preenchidas. Preencha o CPF.");
        }
        bradescoService.processaPagamento(paciente.getCpf(), informacoesPagamento.getCpfMedico(), valor);
    }
}
