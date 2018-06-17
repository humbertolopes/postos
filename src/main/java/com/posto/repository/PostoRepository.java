package com.posto.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.posto.model.Tbl_posto;

@Service
public interface PostoRepository extends JpaRepository<Tbl_posto, Long>{
	
    @Query("SELECT p.razao_social_posto FROM Tbl_posto p")
    List<Tbl_posto> pesquisarPosto();
     
    @Query("select p from Tbl_posto p where autorizado_anp_posto is not null")
    List<Tbl_posto> getPostosAlutorizados();
	

}
