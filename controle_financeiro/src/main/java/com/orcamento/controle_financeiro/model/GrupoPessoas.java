package com.orcamento.controle_financeiro.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class GrupoPessoas {

    @Id
    public Integer id;

    @Column(nullable = false)
    public String nome;

    @Column
    public String orcamentoMensal;

    @Column
    public String orcamentoSemanal;

    @Column
    public String orcamentoDiario;

    @Column
    public String orcamentoEspecial;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
