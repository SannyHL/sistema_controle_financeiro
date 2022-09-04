package com.orcamento.controle_financeiro.repository;

import com.orcamento.controle_financeiro.model.ControleFinanceiro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface ControleFinanceiroRepo extends JpaRepository<ControleFinanceiro, Date> {
}
