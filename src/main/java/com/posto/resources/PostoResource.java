package com.posto.resources;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.posto.model.Tbl_posto;
import com.posto.model.Tbl_posto_autorizado;
import com.posto.repository.PostoAutorizadoRepository;
import com.posto.repository.PostoRepository;
import com.posto.service.PostoService;

@RestController
@RequestMapping("/posto")
public class PostoResource {
	
	@Autowired
	private PostoRepository pr;
	
	@Autowired
	private PostoAutorizadoRepository pra;
	
	@Autowired
	private PostoService postoService;
	
	
	@GetMapping(produces="application/json")
	public @ResponseBody Iterable<Tbl_posto> ListaEventos() {
		Iterable<Tbl_posto> listaPostos = pr.pesquisarPosto();
		return listaPostos;
	}
	
	@GetMapping("/postoautorizado")
	public @ResponseBody Iterable<Tbl_posto_autorizado> ListaPostoAutorizado() {
		Iterable<Tbl_posto_autorizado> listaPostos = pra.getPostosAutorizados();
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
	
	@GetMapping("/atualizapostos")
	public @ResponseBody Iterable<Tbl_posto> atualizaPosto() {
		return postoService.atualizaPosto();
	}
	
	@GetMapping("/autorizados_anp")
	public @ResponseBody Iterable<Tbl_posto> getPostosAutorizados() {
		return pr.getPostosAlutorizados();
	}

}
