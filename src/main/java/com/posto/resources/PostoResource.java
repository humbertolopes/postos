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

import com.posto.metadata.PostoMetadata;
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
	
	@GetMapping("/atualizaPostos")
	public @ResponseBody Iterable<Tbl_posto> atualizaPosto() {
		return postoService.atualizaPosto();
	}
	
	@GetMapping("/atualizaInfoGasolina")
	public @ResponseBody Iterable<Tbl_posto> atualizaInfoGasolina() {
		return postoService.atualizaInfoGasolina();
	}
	
	@GetMapping("/atualizaInfoAlcool")
	public @ResponseBody Iterable<Tbl_posto> atualizaInfoAlcool() {
		return postoService.atualizaInfoAlcool();
	}
	
	@GetMapping("/autorizados_anp")
	public @ResponseBody Iterable<Tbl_posto> getPostosAutorizados() {
		return pr.getPostosAutorizados();
	}
	
	@GetMapping("/getpostos")
	public @ResponseBody Iterable<PostoMetadata> getpostos() {
		return postoService.getPostos();
	}
	
	@GetMapping("/postosAutorizados")
	public @ResponseBody Iterable<PostoMetadata> postosAutorizados() {
		return postoService.getPostosAutorizados();
	}
	
	@GetMapping("/postosNaoAutorizados")
	public @ResponseBody Iterable<PostoMetadata> postosNaoAutorizados() {
		return postoService.getPostosNaoAutorizados();
	}
	
	@PostMapping("/atualizaPosto")
	public Tbl_posto atualizaPosto(@RequestBody Tbl_posto posto) {
		Tbl_posto p = new Tbl_posto();
		p = pr.findOne(posto.getId_posto());
		if(p != null) {
			if(posto.getPreco_gasolina_usuario_posto() != null) {
				p.setPreco_gasolina_usuario_posto(posto.getPreco_gasolina_usuario_posto());
			}
			if(posto.getPreco_alcool_usuario_posto() != null) {
				p.setPreco_alcool_usuario_posto(posto.getPreco_alcool_usuario_posto());
			}
			if(posto.getAceita_credito_posto() != null) {
				p.setAceita_credito_posto(posto.getAceita_credito_posto());
			}
			if(posto.getAcrescimo_credito_posto() != null) {
				p.setAcrescimo_credito_posto(posto.getAcrescimo_credito_posto());
			}
			if(posto.getPorcentagem_acrescimo_cartao_posto() != null) {
				p.setPorcentagem_acrescimo_cartao_posto(posto.getPorcentagem_acrescimo_cartao_posto());
			}
			return pr.save(p);
		}
		else {
			return null;
		}
	}

}
