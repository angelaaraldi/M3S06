package com.example.remedio.exercicio3.service;

import com.example.remedio.exercicio3.factory.PagamentoStrategyFactory;
import com.example.remedio.exercicio3.model.FormaPagamento;
import com.example.remedio.exercicio3.model.InformacoesPagamento;
import com.example.remedio.exercicio3.model.PessoaPaciente;
import com.example.remedio.exercicio3.strategy.PagamentoStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PagamentoService {

    @Autowired
    private PagamentoStrategyFactory pagamentoStrategyFactory;

    public void processaPagamento(PessoaPaciente paciente,
                                  FormaPagamento formaPagamento,
                                  InformacoesPagamento informacoesPagamento,
                                  Float valor) {
        PagamentoStrategy strategy = pagamentoStrategyFactory.getStrategy(formaPagamento);
        strategy.processaPagamento(paciente, informacoesPagamento, valor);
    }
}
