package com.example.remedio.exercicio4;

import com.example.remedio.exercicio4.model.Remedio;
import com.example.remedio.exercicio4.repository.RemedioRepository;
import org.springframework.stereotype.Component;

@Component
public class GaranteExistenciaRemedioUseCaseImpl implements GaranteExistenciaRemedioUseCase {
    private final RemedioRepository remedioRepository;
    private final SalvarRemedioUseCase salvarRemedioUseCase;
    public GaranteExistenciaRemedioUseCaseImpl(RemedioRepository remedioRepository, SalvarRemedioUseCase salvarRemedioUseCase) {
        this.remedioRepository = remedioRepository;
        this.salvarRemedioUseCase = salvarRemedioUseCase;
    }
    @Override
    public Remedio encontraRemedio(Integer idRemedio, String nomeRemedio, Integer dosagemMgRemedio) {
        if (remedioRepository.getRemedioPorId(idRemedio) != null) {
            return remedioRepository.getRemedioPorId(idRemedio);
        }
        if (remedioRepository.getRemedioPorNome(nomeRemedio) != null) {
            return remedioRepository.getRemedioPorNome(nomeRemedio);
        }
        return salvarRemedioUseCase.salvarRemedio(nomeRemedio, dosagemMgRemedio);
    }
}
