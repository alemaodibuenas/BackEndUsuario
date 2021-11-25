package com.example.demo.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Usuario;
import com.example.demo.repository.IUsuarioRepository;

@Service
public class DBService {

	@Autowired
	private IUsuarioRepository repo;

	public void instanciaBaseDeDados() {

		// instanciando categoria

		Usuario cat1 = new Usuario(null, "giovanni",37,"teste","teste","teste","teste","teste","teste");
		Usuario cat2 = new Usuario(null, "giovanni",37,"teste","teste","teste","teste","teste","teste");
		Usuario cat3 = new Usuario(null, "giovanni",37,"teste","teste","teste","teste","teste","teste");

		this.repo.saveAll(Arrays.asList(cat1, cat2, cat3));
	}

}
