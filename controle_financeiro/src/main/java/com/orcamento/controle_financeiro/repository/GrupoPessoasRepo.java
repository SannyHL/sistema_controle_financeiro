package com.orcamento.controle_financeiro.repository;

import com.orcamento.controle_financeiro.model.GrupoPessoas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GrupoPessoasRepo extends JpaRepository<GrupoPessoas, String> {
}
