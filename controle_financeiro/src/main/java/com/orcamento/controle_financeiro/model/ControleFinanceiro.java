package com.orcamento.controle_financeiro.model;


import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_financas")
public class ControleFinanceiro {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(nullable = false)
    public Integer numeroIdentificacao;

    @Column(nullable = false)
    public String dataGasto;
    @Column(nullable = false, length = 50)
    public String tipoDeGasto;
    @Column(nullable = false, length = 50)
    public String localGasto;
    @Column(nullable = false, length = 50)
    public String descricao;
    @Column(nullable = false, length = 50)
    public String tipoPagamento;
    @Column(nullable = false, length = 50)
    public String valorPago;
    @Column
    public LocalDateTime dataRegistro;

    public Integer getNumeroIdentificacao() {
        return numeroIdentificacao;
    }

    public void setNumeroIdentificacao(Integer numeroIdentificacao) {
        this.numeroIdentificacao = numeroIdentificacao;
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

    public LocalDateTime getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(LocalDateTime dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    @OneToOne
    @JoinColumn(name = "tbpessoas_id")
    private GrupoPessoas id;

    public GrupoPessoas getId() {
        return id;
    }

    public void setId(GrupoPessoas id) {
        this.id = id;
    }
}
