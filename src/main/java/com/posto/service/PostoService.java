package com.posto.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.posto.dao.DataSource;
import com.posto.dao.PostoDAO;
import com.posto.metadata.PostoMetadata;
import com.posto.model.Tbl_alcool_carga;
import com.posto.model.Tbl_gasolina_carga;
import com.posto.model.Tbl_posto;
import com.posto.model.Tbl_posto_autorizado;
import com.posto.repository.AlcoolCargaRepository;
import com.posto.repository.BairroRepository;
import com.posto.repository.GasolinaCargaRepository;
import com.posto.repository.PostoAutorizadoRepository;
import com.posto.repository.PostoRepository;

@Service
public class PostoService {
	
	@Autowired
	private PostoRepository pr;
	
	@Autowired
	private PostoAutorizadoRepository par;
	
	@Autowired
	private BairroRepository br;
	
	@Autowired
	private GasolinaCargaRepository gcr;
	
	@Autowired
	private AlcoolCargaRepository acr;
	
	public List<Tbl_posto> atualizaPosto() {
		int x,y;
		ArrayList<Tbl_posto> listaPostoAtualizados = new ArrayList<Tbl_posto>();
		List<Tbl_posto> listaPosto = pr.findAll();
		List<Tbl_posto_autorizado> listaPostoAutorizado = par.findAll();
		if(listaPostoAutorizado.size() > 0) {
			for(x = 0; x < listaPostoAutorizado.size(); x++ ) {
				for(y = 0; y < listaPosto.size(); y++) {
					if(listaPostoAutorizado.get(x).getRazao_social_posto_autorizado().equalsIgnoreCase(listaPosto.get(y).getRazao_social_posto())) {
						listaPosto.get(y).setAutorizado_anp_posto(listaPostoAutorizado.get(x).getAutorizado_anp());
						listaPosto.get(y).setFk_id_bairro_posto(br.getIdBairro(listaPostoAutorizado.get(x).getBairro_posto_autorizado()));
						listaPosto.get(y).setEndereco_posto(listaPostoAutorizado.get(x).getEndereco_posto_autorizado());
						pr.save(listaPosto.get(y));
						listaPostoAtualizados.add(listaPosto.get(y));
						y = listaPosto.size();
					}
				}
			}
		}
		return listaPostoAtualizados;
	}
	
	public List<Tbl_posto> atualizaInfoGasolina() {
		int x,y;
		ArrayList<Tbl_posto> listaPostoAtualizados = new ArrayList<Tbl_posto>();
		List<Tbl_posto> listaPosto = pr.findAll();
		List<Tbl_gasolina_carga> listaGasolinaCarga = gcr.findAll();
		if(listaGasolinaCarga.size() > 0) {
			for(x = 0; x < listaGasolinaCarga.size(); x++ ) {
				for(y = 0; y < listaPosto.size(); y++) {
					if(listaGasolinaCarga.get(x).getRazao_social_gasolina_carga().equalsIgnoreCase(listaPosto.get(y).getRazao_social_posto())) {
						listaPosto.get(y).setPreco_compra_gasolina_posto(listaGasolinaCarga.get(x).getPreco_compra_gasolina_carga());
						listaPosto.get(y).setPreco_venda_gasolina_posto(listaGasolinaCarga.get(x).getPreco_venda_gasolina_carga());
						listaPosto.get(y).setData_preco_gasolina_posto(listaGasolinaCarga.get(x).getData_coleta_gasolina_carga());
						listaPosto.get(y).setNota_fiscal_compra_gasolina_posto(listaGasolinaCarga.get(x).getNota_fiscal_compra_gasolina_carga());
						pr.save(listaPosto.get(y));
						listaPostoAtualizados.add(listaPosto.get(y));
						y = listaPosto.size();
					}
				}
			}
		}
		return listaPostoAtualizados;
	}
	
	public List<Tbl_posto> atualizaInfoAlcool() {
		int x,y;
		ArrayList<Tbl_posto> listaPostoAtualizados = new ArrayList<Tbl_posto>();
		List<Tbl_posto> listaPosto = pr.findAll();
		List<Tbl_alcool_carga> listaalcoolCarga = acr.findAll();
		if(listaalcoolCarga.size() > 0) {
			for(x = 0; x < listaalcoolCarga.size(); x++ ) {
				for(y = 0; y < listaPosto.size(); y++) {
					if(listaalcoolCarga.get(x).getRazao_social_alcool_carga().equalsIgnoreCase(listaPosto.get(y).getRazao_social_posto())) {
						listaPosto.get(y).setPreco_compra_alcool_posto(listaalcoolCarga.get(x).getPreco_compra_alcool_carga());
						listaPosto.get(y).setPreco_venda_alcool_posto(listaalcoolCarga.get(x).getPreco_venda_alcool_carga());
						listaPosto.get(y).setData_preco_alcool_posto(listaalcoolCarga.get(x).getData_coleta_alcool_carga());
						listaPosto.get(y).setNota_fiscal_compra_alcool_posto(listaalcoolCarga.get(x).getNota_fiscal_compra_alcool_carga());
						pr.save(listaPosto.get(y));
						listaPostoAtualizados.add(listaPosto.get(y));
						y = listaPosto.size();
					}
				}
			}
		}
		return listaPostoAtualizados;
	}
	
	public ArrayList<PostoMetadata> getPostos() {
		DataSource dataSource = new DataSource();
		PostoDAO postoDao = new PostoDAO(dataSource);
		return postoDao.getPostos(null);
	}
	
	public ArrayList<PostoMetadata> getPostosAutorizados() {
		DataSource dataSource = new DataSource();
		PostoDAO postoDao = new PostoDAO(dataSource);
		return postoDao.getPostos(true);
	}
	
	public ArrayList<PostoMetadata> getPostosNaoAutorizados() {
		DataSource dataSource = new DataSource();
		PostoDAO postoDao = new PostoDAO(dataSource);
		return postoDao.getPostos(false);
	}
}
