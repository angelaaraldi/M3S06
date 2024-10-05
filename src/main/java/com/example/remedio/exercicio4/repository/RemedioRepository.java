package com.example.remedio.exercicio4.repository;

import com.example.remedio.exercicio4.model.Remedio;
import org.springframework.stereotype.Component;

@Component
public class RemedioRepository {
    public void save(Remedio remedio) {

    }

    public boolean existe(Integer idR) {
        return false;
    }

    public Remedio getRemedioPorId(Integer idR) {
        return null;
    }

    public boolean existePorNome(String nomeR) {
        return false;
    }

    public Remedio getRemedioPorNome(String nomeR) {
        return null;
    }
}
