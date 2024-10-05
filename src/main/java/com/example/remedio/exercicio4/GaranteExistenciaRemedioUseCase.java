package com.example.remedio.exercicio4;

import com.example.remedio.exercicio4.model.Remedio;

public interface GaranteExistenciaRemedioUseCase {
    Remedio encontraRemedio(Integer idRemedio, String nomeRemedio, Integer dosagemMgRemedio);
}
