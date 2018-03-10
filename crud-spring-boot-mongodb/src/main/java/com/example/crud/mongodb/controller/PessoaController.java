package com.example.crud.mongodb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.crud.mongodb.entity.Pessoa;
import com.example.crud.mongodb.service.PessoaService;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

	@Autowired
	private PessoaService pessoaService;

	@RequestMapping("/salva-pessoa")
	@PostMapping(produces=MediaType.APPLICATION_JSON_VALUE)
	public String salvaPessoa(@RequestBody Pessoa pessoa) {
		return pessoaService.salvaPessoa(pessoa);
	}
	
	@RequestMapping("/atualiza-pessoa")
	@PutMapping(produces=MediaType.APPLICATION_JSON_VALUE)
	public String atualizaPessoa(@RequestBody Pessoa pessoa) {
		return pessoaService.atualizaPessoa(pessoa);
	}
	
	@RequestMapping(value="/remove-pessoa/{id}")
	@DeleteMapping(consumes=MediaType.APPLICATION_JSON_VALUE)
	public void removePessoa(@PathVariable String id) {
		pessoaService.removePessoa(id);
	}
	
	@RequestMapping(value="/lista-pessoa")
	@GetMapping(consumes=MediaType.APPLICATION_JSON_VALUE)
	public List<Pessoa> listaPessoas(){
		return pessoaService.listaPessoas();
	}
	
	@RequestMapping(value="/{id}")
	@GetMapping(consumes=MediaType.APPLICATION_JSON_VALUE)
	public Pessoa buscaPessoaPorId(@PathVariable String id) {
		return pessoaService.buscaPessoaPorId(id);
	}
}
