package com.orcamento.controle_financeiro.controller;

import com.orcamento.controle_financeiro.dto.ControleFinanceiroDto;
import com.orcamento.controle_financeiro.model.ControleFinanceiro;
import com.orcamento.controle_financeiro.service.ControleFinanceiroService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@RequestMapping("/financeiro")
@Controller
public class ControleFinanceiroController {

    @Autowired
    public ControleFinanceiroService controleFinanceiroService;

    @GetMapping("/cadastro")
    public String getAllNavegador(){
        return "gastos";
    }

    @PostMapping("/cadastro")
    public ResponseEntity<ControleFinanceiro> createGastoNavegador(@Valid ControleFinanceiroDto controleFinanceiroDto){
        var controleFinanceiro = new ControleFinanceiro();
        BeanUtils.copyProperties(controleFinanceiroDto, controleFinanceiro);
        controleFinanceiro.setDataRegistro(LocalDateTime.now(ZoneId.of("UTC")));
        return new ResponseEntity<>(controleFinanceiroService.create(controleFinanceiro), HttpStatus.CREATED);
    }

    @GetMapping("/")
    public ResponseEntity<List<ControleFinanceiro>> getAll(){
        return new ResponseEntity<>(controleFinanceiroService.findAll(), HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<ControleFinanceiro> createGasto(@RequestBody @Valid ControleFinanceiroDto controleFinanceiroDto){
        var controleFinanceiro = new ControleFinanceiro();
        BeanUtils.copyProperties(controleFinanceiroDto, controleFinanceiro);
        controleFinanceiro.setDataRegistro(LocalDateTime.now(ZoneId.of("UTC")));
        return new ResponseEntity<>(controleFinanceiroService.create(controleFinanceiro), HttpStatus.CREATED);
    }

    @DeleteMapping("/{dataGasto}")
    public ResponseEntity<ControleFinanceiro> deleteGasto(@PathVariable(value = "dataGasto") Date dataGasto){
        Optional<ControleFinanceiro> controleFinanceiroOptional = controleFinanceiroService.findId(dataGasto);
        if (controleFinanceiroOptional.isPresent()){
            controleFinanceiroService.delete(controleFinanceiroOptional.get());
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/{dataGasto}")
    public ResponseEntity<ControleFinanceiro> getId(@PathVariable(value = "dataGasto") Date dataGasto){
        Optional<ControleFinanceiro> controleFinanceiroOptional = controleFinanceiroService.findId(dataGasto);
        if (controleFinanceiroOptional.isPresent()){
            return new ResponseEntity<>(controleFinanceiroOptional.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/{dataGasto}")
    public ResponseEntity<ControleFinanceiro> putGasto(@PathVariable(value = "dataGasto") Date dataGasto, @RequestBody @Valid ControleFinanceiroDto controleFinanceiroDto){
        Optional<ControleFinanceiro> controleFinanceiroOptional = controleFinanceiroService.findId(dataGasto);
        if (controleFinanceiroOptional.isPresent()){
            var controleFinanceiro = new ControleFinanceiro();
            BeanUtils.copyProperties(controleFinanceiroDto, controleFinanceiro);
            controleFinanceiro.setDataRegistro(controleFinanceiroOptional.get().getDataRegistro());
            return new ResponseEntity<>(controleFinanceiroService.create(controleFinanceiro), HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


}
