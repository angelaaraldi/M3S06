package com.example.remedio.exercicio2;

import com.example.remedio.exercicio2.model.Medicamento;
import com.example.remedio.exercicio2.model.MedicamentoBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MedicamentoTeste {
    @Autowired
    public MedicamentoTeste() {
        System.out.println(getDipirona().toString());
    }
    public Medicamento getDipirona() {
        return MedicamentoBuilder
                .umMedicamento()
                .comNome("Dipirona Sódica 500mg")
                .comDosagem(500)
                .comUnidadeDosagem("mg")
                .comNomeLaboratorio("EMS")
                .comBula("""
                        Para que serve Dipirona Sódica?
                        Como a Dipirona Sódica tem ação analgésica e antipirética, ela serve para aliviar dores e também reduzir a febre no paciente. Além disso, é importante ressaltar que o remédio é bastante indicado para dor com intensidade leve e moderada.
                        Esse remédio também serve para tratar dores de dentes, além de cólicas menstruais e outras condições. Por ser acessível, ele pode ser encontrado nas mais diferentes redes de farmácias.
                        """)
                .build();
    }
}
