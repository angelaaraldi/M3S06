package com.example.remedio.exercicio2.model;

public class Medicamento {
    private String nome;
    private Integer dosagem;
    private String unidadeDosagem;
    private String nomeLaboratorio;
    private String bula;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDosagem(Integer dosagem) {
        this.dosagem = dosagem;
    }

    public void setUnidadeDosagem(String unidadeDosagem) {
        this.unidadeDosagem = unidadeDosagem;
    }

    public void setNomeLaboratorio(String nomeLaboratorio) {
        this.nomeLaboratorio = nomeLaboratorio;
    }

    public void setBula(String bula) {
        this.bula = bula;
    }

    @Override
    public String toString() {
        return "Medicamento{" +
                "nome='" + nome + '\'' +
                ", dosagem=" + dosagem +
                ", unidadeDosagem='" + unidadeDosagem + '\'' +
                ", nomeLaboratorio='" + nomeLaboratorio + '\'' +
                ", bula='" + bula + '\'' +
                '}';
    }
}
