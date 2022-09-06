package com.orcamento.controle_financeiro.dto;

import com.orcamento.controle_financeiro.model.GrupoPessoas;

import javax.validation.constraints.NotBlank;

public class ControleFinanceiroDto {

    
    public String dataGasto;
    @NotBlank
    public String tipoDeGasto;
    @NotBlank
    public String localGasto;
    @NotBlank
    public String descricao;
    @NotBlank
    public String tipoPagamento;
    @NotBlank
    public String valorPago;

    private GrupoPessoas id;

    public GrupoPessoas getId() {
        return id;
    }

    public void setId(GrupoPessoas id) {
        this.id = id;
    }

    public String getDataGasto() {
        return dataGasto;
    }

    public void setDataGasto(String dataGasto) {
        this.dataGasto = dataGasto;
    }

    public String getTipoDeGasto() {
        return tipoDeGasto;
    }

    public void setTipoDeGasto(String tipoDeGasto) {
        this.tipoDeGasto = tipoDeGasto;
    }

    public String getLocalGasto() {
        return localGasto;
    }

    public void setLocalGasto(String localGasto) {
        this.localGasto = localGasto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public String getValorPago() {
        return valorPago;
    }

    public void setValorPago(String valorPago) {
        this.valorPago = valorPago;
    }
}
