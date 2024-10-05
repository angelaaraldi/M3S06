package com.example.remedio.exercicio2.model;

public class MedicamentoBuilder {
    private String nome;
    private Integer dosagem;
    private String unidadeDosagem;
    private String nomeLaboratorio;
    private String bula;
    public static MedicamentoBuilder umMedicamento() {
        return new MedicamentoBuilder();
    }
    private MedicamentoBuilder() {
    }
    public MedicamentoBuilder comNome(String nome) {
        this.nome = nome;
        return this;
    }
    public MedicamentoBuilder comDosagem(Integer dosagem) {
        this.dosagem = dosagem;
        return this;
    }
    public MedicamentoBuilder comUnidadeDosagem(String unidadeDosagem) {
        this.unidadeDosagem = unidadeDosagem;
        return this;
    }
    public MedicamentoBuilder comNomeLaboratorio(String nomeLaboratorio) {
        this.nomeLaboratorio = nomeLaboratorio;
        return this;
    }
    public MedicamentoBuilder comBula(String bula) {
        this.bula = bula;
        return this;
    }
    public Medicamento build() {
        Medicamento medicamento = new Medicamento();
        medicamento.setNome(nome);
        medicamento.setDosagem(dosagem);
        medicamento.setUnidadeDosagem(unidadeDosagem);
        medicamento.setNomeLaboratorio(nomeLaboratorio);
        medicamento.setBula(bula);
        return medicamento;
    }
}
