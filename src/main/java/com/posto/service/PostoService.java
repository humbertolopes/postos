package com.posto.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.posto.model.Tbl_posto;
import com.posto.model.Tbl_posto_autorizado;
import com.posto.repository.PostoAutorizadoRepository;
import com.posto.repository.PostoRepository;

@Service
public class PostoService {
	
	@Autowired
	private PostoRepository pr;
	
	@Autowired
	private PostoAutorizadoRepository pra;
	
	public List<Tbl_posto> atualizaPosto() {
		int x,y;
		List<Tbl_posto> listaPostoAtualizados = new ArrayList<Tbl_posto>();
		List<Tbl_posto> listaPosto = pr.findAll();
		List<Tbl_posto_autorizado> listaPostoAutorizado = pra.findAll();
		if(listaPostoAutorizado.size() > 0) {
			for(x = 0; x < listaPostoAutorizado.size(); x++ ) {
				for(y = 0; y < listaPosto.size(); y++) {
					if(listaPostoAutorizado.get(x).getRazao_social_posto_autorizado().equalsIgnoreCase(listaPosto.get(y).getRazao_social_posto())) {
						listaPosto.get(y).setAutorizado_anp_posto(true);
						pr.save(listaPosto.get(y));
						y = listaPosto.size();	
						//listaPostoAtualizados.add(listaPosto.get(y));
					}
				}
			}
		}
		return listaPosto;
	}

}
