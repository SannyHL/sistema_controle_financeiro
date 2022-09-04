package com.orcamento.controle_financeiro.service;

import com.orcamento.controle_financeiro.model.GrupoPessoas;
import com.orcamento.controle_financeiro.repository.GrupoPessoasRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GrupoPessoasService {

    @Autowired
    public GrupoPessoasRepo grupoPessoasRepo;


    public GrupoPessoas create(GrupoPessoas grupoPessoas) {
        return grupoPessoasRepo.save(grupoPessoas);
    }

    public Optional<GrupoPessoas> findId(Integer id) {
        return grupoPessoasRepo.findById(id);
    }


    public void delete(GrupoPessoas grupoPessoas) {
        grupoPessoasRepo.delete(grupoPessoas);
    }
}
