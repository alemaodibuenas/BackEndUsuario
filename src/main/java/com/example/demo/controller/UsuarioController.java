package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Usuario;
import com.example.demo.repository.IUsuarioRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(path = "/api")
public class UsuarioController {

	@Autowired
	private IUsuarioRepository repo;

	@GetMapping(path = "/usuarios")
	public List<Usuario> getAll() {
		return this.repo.findAll();
	}

	@GetMapping(path = "/usuarios/{id}")
	public Usuario getById(@PathVariable int id) {
		return this.repo.findById(id).orElse(null);
	}

	@PostMapping(path = "/usuarios")
	public Usuario post(@RequestBody Usuario usuario) {
		return this.repo.save(usuario);
	}

	@DeleteMapping(path = "/usuarios/{id}")
	public void delete(@PathVariable int id) {
		if (this.repo.findById(id).orElse(null) != null) {
			this.repo.deleteById(id);
		}
	}

	@PutMapping(path = "/usuarios")
	public Usuario put(@RequestBody Usuario novo) {
		return this.repo.findById(novo.getId()).map(cat -> {
			cat.setNome(novo.getNome());
			cat.setIdade(novo.getIdade());
			cat.setCep(novo.getCep());
			cat.setEstado(novo.getEstado());
			cat.setCidade(novo.getCidade());
			cat.setLogradouro(novo.getLogradouro());
			cat.setBairro(novo.getBairro());
			cat.setNumero(novo.getNumero());
			return this.repo.save(cat);
		}).orElse(null);
	}

}
