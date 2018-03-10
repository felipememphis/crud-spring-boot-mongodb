package com.example.crud.mongodb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crud.mongodb.entity.Pessoa;
import com.example.crud.mongodb.repository.PessoaRepository;

@Service
public class PessoaService {

	@Autowired
	private PessoaRepository pessoaRepository;
	
	public String salvaPessoa(Pessoa pessoa) {
		Pessoa pes = pessoaRepository.save(pessoa);
		return pes.getNome();
	}
	
	public String atualizaPessoa(Pessoa pessoa) {
		Pessoa pes = pessoaRepository.save(pessoa);
		return pes.getNome();
	}
	
	public List<Pessoa> listaPessoas(){
		return pessoaRepository.findAll();
	}
	
	public void removePessoa(String idPessoa) {
		pessoaRepository.deleteById(idPessoa);
	}
	
	public Pessoa buscaPessoaPorId(String idPessoa) {
		Optional<Pessoa> pes = pessoaRepository.findById(idPessoa);
		return pes.get();
	}
}
