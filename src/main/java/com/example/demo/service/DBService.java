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

		Usuario cat1 = new Usuario(null, "Giovanni","37","79006520","MS","Campo Grande","Gabriel Cubel","vila bandeirantes","123");
		Usuario cat2 = new Usuario(null, "Carol","33","79084810","MS","mpo Grande","Cecilio Alves Correa","conj. Aero Rancho","123");
		Usuario cat3 = new Usuario(null, "Joao","16","79084810","MS","mpo Grande","Cecilio Alves Correa","conj. Aero Rancho","123");

		this.repo.saveAll(Arrays.asList(cat1, cat2, cat3));
	}

}

