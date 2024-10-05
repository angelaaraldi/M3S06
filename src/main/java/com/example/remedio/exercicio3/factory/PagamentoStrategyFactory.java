package com.example.remedio.exercicio3.factory;

import com.example.remedio.exercicio3.exception.RegraDeNegocioException;
import com.example.remedio.exercicio3.model.FormaPagamento;
import com.example.remedio.exercicio3.strategy.PagamentoStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PagamentoStrategyFactory {
    @Autowired
    private List<PagamentoStrategy> strategies;
    public PagamentoStrategy getStrategy(FormaPagamento formaPagamento) {
        for (PagamentoStrategy strategy : strategies) {
            if (strategy.getFormaPagamentoEsperada().equals(formaPagamento)) {
                return strategy;
            }
        }
        throw new RegraDeNegocioException("Não foi possível encontrar uma estratégia para essa forma de pagamento");
    }
}
