package com.example.remedio.exercicio4;

import com.example.remedio.exercicio4.model.Remedio;

public interface SalvarRemedioUseCase {
    Remedio salvarRemedio(String nome, Integer dosagemEmMg);
}
