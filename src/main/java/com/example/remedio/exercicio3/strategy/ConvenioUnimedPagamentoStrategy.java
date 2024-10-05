package com.example.remedio.exercicio3.strategy;

import com.example.remedio.exercicio3.exception.RegraDeNegocioException;
import com.example.remedio.exercicio3.model.FormaPagamento;
import com.example.remedio.exercicio3.model.InformacoesPagamento;
import com.example.remedio.exercicio3.model.PessoaPaciente;
import com.example.remedio.exercicio3.service.UnimedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConvenioUnimedPagamentoStrategy implements PagamentoStrategy {
    @Autowired
    private UnimedService unimedService;
    @Override
    public FormaPagamento getFormaPagamentoEsperada() {
        return FormaPagamento.CONVENIO_UNIMED;
    }

    @Override
    public void processaPagamento(PessoaPaciente paciente, InformacoesPagamento informacoesPagamento, Float valor) {
        if(paciente.getNumeroConvenio() == null || paciente.getCpf() == null) {
            throw new RegraDeNegocioException("Informações obrigatórias não preenchidas. Preencha número de convênio e CPF.");
        }
        unimedService.processaPagamento(paciente.getCpf(), paciente.getNumeroConvenio(), informacoesPagamento.getCpfMedico());
    }
}
