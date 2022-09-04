package com.orcamento.controle_financeiro.controller;

import com.orcamento.controle_financeiro.service.ControleFinanceiroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ControleFinanceiroController {

    @Autowired
    public ControleFinanceiroService controleFinanceiroService;

}
