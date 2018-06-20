package com.posto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.posto.model.Tbl_bairro;

public interface BairroRepository extends JpaRepository<Tbl_bairro, Long>{
	
    @Query("SELECT b.id_bairro FROM Tbl_bairro b where b.descricao_bairro = ?1")
    Long getIdBairro(String descricao_bairro);

}
