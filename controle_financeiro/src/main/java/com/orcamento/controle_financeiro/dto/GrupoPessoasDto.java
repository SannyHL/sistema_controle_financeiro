package com.orcamento.controle_financeiro.dto;

import javax.validation.constraints.NotBlank;

public class GrupoPessoasDto {

   
    public String id;
    @NotBlank
    public String nome;

    public String orcamentoMensal;

    public String orcamentoSemanal;

    public String orcamentoDiario;

    public String orcamentoEspecial;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getOrcamentoMensal() {
        return orcamentoMensal;
    }

    public void setOrcamentoMensal(String orcamentoMensal) {
        this.orcamentoMensal = orcamentoMensal;
    }

    public String getOrcamentoSemanal() {
        return orcamentoSemanal;
    }

    public void setOrcamentoSemanal(String orcamentoSemanal) {
        this.orcamentoSemanal = orcamentoSemanal;
    }

    public String getOrcamentoDiario() {
        return orcamentoDiario;
    }

    public void setOrcamentoDiario(String orcamentoDiario) {
        this.orcamentoDiario = orcamentoDiario;
    }

    public String getOrcamentoEspecial() {
        return orcamentoEspecial;
    }

    public void setOrcamentoEspecial(String orcamentoEspecial) {
        this.orcamentoEspecial = orcamentoEspecial;
    }
}
