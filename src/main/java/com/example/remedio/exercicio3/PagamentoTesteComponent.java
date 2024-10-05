package com.example.remedio.exercicio3;

import com.example.remedio.exercicio3.model.FormaPagamento;
import com.example.remedio.exercicio3.model.InformacoesPagamento;
import com.example.remedio.exercicio3.model.PessoaPaciente;
import com.example.remedio.exercicio3.service.PagamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PagamentoTesteComponent {
    @Autowired
    public PagamentoTesteComponent(PagamentoService pagamentoService) {
        PessoaPaciente paciente = new PessoaPaciente();
        paciente.setNumeroConvenio("123");
        paciente.setCpf("000.000.000-00");
        InformacoesPagamento informacoesPagamento = new InformacoesPagamento();
        informacoesPagamento.setCpfMedico("111.111.111-11");
        pagamentoService.processaPagamento(paciente, FormaPagamento.CONVENIO_UNIMED, informacoesPagamento, 100f);
    }
}
