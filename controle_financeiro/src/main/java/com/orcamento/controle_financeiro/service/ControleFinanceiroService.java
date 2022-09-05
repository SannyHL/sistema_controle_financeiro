package com.orcamento.controle_financeiro.service;

import com.orcamento.controle_financeiro.model.ControleFinanceiro;
import com.orcamento.controle_financeiro.repository.ControleFinanceiroRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

@Service
public class ControleFinanceiroService {

    @Autowired
    public ControleFinanceiroRepo controleFinanceiroRepo;


    public ControleFinanceiro create(ControleFinanceiro controleFinanceiro) {
        return controleFinanceiroRepo.save(controleFinanceiro);
    }

    public Optional<ControleFinanceiro> findId(Date dataGasto) {
        return controleFinanceiroRepo.findById(dataGasto);
    }

    public void delete(ControleFinanceiro controleFinanceiro) {
        controleFinanceiroRepo.delete(controleFinanceiro);
    }
}
