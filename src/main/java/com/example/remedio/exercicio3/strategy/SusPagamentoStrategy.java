package com.example.remedio.exercicio3.strategy;

import com.example.remedio.exercicio3.exception.RegraDeNegocioException;
import com.example.remedio.exercicio3.model.FormaPagamento;
import com.example.remedio.exercicio3.model.InformacoesPagamento;
import com.example.remedio.exercicio3.model.PessoaPaciente;
import com.example.remedio.exercicio3.service.SusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SusPagamentoStrategy implements PagamentoStrategy {
    @Autowired
    private SusService susService;
    @Override
    public FormaPagamento getFormaPagamentoEsperada() {
        return FormaPagamento.SUS;
    }

    @Override
    public void processaPagamento(PessoaPaciente paciente, InformacoesPagamento informacoesPagamento, Float valor) {
        if(paciente.getCpf() == null || paciente.getNumeroPis() == null) {
            throw new RegraDeNegocioException("Informações obrigatórias não preenchidas. Preencha número do PIS e CPF.");
        }

        susService.solicitaProcessoPagamento(paciente.getCpf(), paciente.getNumeroPis(), valor);
    }
}
