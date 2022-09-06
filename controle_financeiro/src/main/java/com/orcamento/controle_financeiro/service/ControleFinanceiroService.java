package com.orcamento.controle_financeiro.service;

import com.orcamento.controle_financeiro.model.ControleFinanceiro;
import com.orcamento.controle_financeiro.repository.ControleFinanceiroRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class ControleFinanceiroService {

    @Autowired
    public ControleFinanceiroRepo controleFinanceiroRepo;

    @Transactional
    public ControleFinanceiro create(ControleFinanceiro controleFinanceiro) {
        return controleFinanceiroRepo.save(controleFinanceiro);
    }

    public Optional<ControleFinanceiro> findId(Integer numeroIdentificacao) {
        return controleFinanceiroRepo.findById(numeroIdentificacao);
    }
    @Transactional
    public void delete(ControleFinanceiro controleFinanceiro) {
        controleFinanceiroRepo.delete(controleFinanceiro);
    }


    public List<ControleFinanceiro> findAll() {
       return controleFinanceiroRepo.findAll();
    }
}
