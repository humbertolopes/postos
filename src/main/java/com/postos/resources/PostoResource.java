package com.postos.resources;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.postos.models.Tbla01Posto;
import com.postos.repository.Tbla01PostoRepository;

@RestController
@RequestMapping("/posto")
public class PostoResource {
	
	@Autowired
	private Tbla01PostoRepository pr;
	
	@GetMapping(produces="application/json")
	public @ResponseBody Iterable<Tbla01Posto> ListaEventos() {
		Iterable<Tbla01Posto> listaPostos = pr.findAll();
		return listaPostos;
	}
	
	@PostMapping("/cadastra")
	public Tbla01Posto cadastraPosto(@RequestBody @Valid Tbla01Posto posto) {
		return pr.save(posto);
	}
	
	@DeleteMapping("/deleta")
	public Tbla01Posto deletaPosto(@RequestBody Tbla01Posto posto) {
		pr.delete(posto);
		return posto;
	}

}
