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

import com.postos.models.Tbl_posto;
import com.postos.repository.PostoRepository;

@RestController
@RequestMapping("/posto")
public class PostoResource {
	
	@Autowired
	private PostoRepository pr;
	
	@GetMapping(produces="application/json")
	public @ResponseBody Iterable<Tbl_posto> ListaEventos() {
		Iterable<Tbl_posto> listaPostos = pr.findAll();
		return listaPostos;
	}
	
	@PostMapping("/cadastra")
	public Tbl_posto cadastraPosto(@RequestBody @Valid Tbl_posto posto) {
		return pr.save(posto);
	}
	
	@DeleteMapping("/deleta")
	public Tbl_posto deletaPosto(@RequestBody Tbl_posto posto) {
		pr.delete(posto);
		return posto;
	}

}
