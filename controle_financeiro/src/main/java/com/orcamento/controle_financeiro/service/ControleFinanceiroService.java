package com.orcamento.controle_financeiro.service;

import com.orcamento.controle_financeiro.repository.ControleFinanceiroRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ControleFinanceiroService {

    @Autowired
    public ControleFinanceiroRepo controleFinanceiroRepo;


}
