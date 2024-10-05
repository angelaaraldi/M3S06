package com.example.remedio.exercicio3.strategy;

import com.example.remedio.exercicio3.model.FormaPagamento;
import com.example.remedio.exercicio3.model.InformacoesPagamento;
import com.example.remedio.exercicio3.model.PessoaPaciente;

public interface PagamentoStrategy {
    FormaPagamento getFormaPagamentoEsperada();
    void processaPagamento(PessoaPaciente paciente, InformacoesPagamento informacoesPagamento, Float valor);
}
