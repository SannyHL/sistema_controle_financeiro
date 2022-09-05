package com.orcamento.controle_financeiro.dto;

import com.orcamento.controle_financeiro.model.GrupoPessoas;

import javax.validation.constraints.NotBlank;
import java.util.Date;

public class ControleFinanceiroDto {

    @NotBlank
    public Date dataGasto;
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

    @NotBlank
    private GrupoPessoas id;

    public GrupoPessoas getId() {
        return id;
    }

    public void setId(GrupoPessoas id) {
        this.id = id;
    }

    public Date getDataGasto() {
        return dataGasto;
    }

    public void setDataGasto(Date dataGasto) {
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
