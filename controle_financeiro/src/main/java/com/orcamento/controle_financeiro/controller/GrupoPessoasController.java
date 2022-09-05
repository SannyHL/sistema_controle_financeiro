package com.orcamento.controle_financeiro.controller;

import com.orcamento.controle_financeiro.dto.GrupoPessoasDto;
import com.orcamento.controle_financeiro.model.GrupoPessoas;
import com.orcamento.controle_financeiro.service.GrupoPessoasService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/pessoas")
public class GrupoPessoasController {

    @Autowired
    public GrupoPessoasService grupoPessoasService;

    @GetMapping("/cadastro")
    public String getAllNavegador(){
        return "pessoas";
    }

    @PostMapping("/cadastro")
    public ResponseEntity<GrupoPessoas> createPessoaNavegador(@Valid GrupoPessoasDto grupoPessoasDto){
        var grupoPessoas = new GrupoPessoas();
        BeanUtils.copyProperties(grupoPessoasDto, grupoPessoas);
        return new ResponseEntity<>(grupoPessoasService.create(grupoPessoas), HttpStatus.CREATED);
    }

    @GetMapping("/")
    public ResponseEntity<List<GrupoPessoas>> getAll(){
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<GrupoPessoas> createPessoa(@RequestBody @Valid GrupoPessoasDto grupoPessoasDto){
        var grupoPessoas = new GrupoPessoas();
        BeanUtils.copyProperties(grupoPessoasDto, grupoPessoas);
        return new ResponseEntity<>(grupoPessoasService.create(grupoPessoas), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<GrupoPessoas> deletePessoa(@PathVariable(value = "id") Integer id){
        Optional<GrupoPessoas> grupoPessoasOptional = grupoPessoasService.findId(id);
        if (grupoPessoasOptional.isPresent()){
            grupoPessoasService.delete(grupoPessoasOptional.get());
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<GrupoPessoas> getId(@PathVariable(value = "id") Integer id){
        Optional<GrupoPessoas> grupoPessoasOptional = grupoPessoasService.findId(id);
        if (grupoPessoasOptional.isPresent()){
            return new ResponseEntity<>(grupoPessoasOptional.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<GrupoPessoas> putPessoas(@PathVariable(value = "id") Integer id, @RequestBody @Valid GrupoPessoasDto grupoPessoasDto){
        Optional<GrupoPessoas> grupoPessoasOptional = grupoPessoasService.findId(id);
        if (grupoPessoasOptional.isPresent()){
            var grupoPessoas = new GrupoPessoas();
            BeanUtils.copyProperties(grupoPessoasDto, grupoPessoas);
            return new ResponseEntity<>(grupoPessoasService.create(grupoPessoas), HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
