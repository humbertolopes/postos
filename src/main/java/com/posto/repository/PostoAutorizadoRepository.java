package com.posto.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.posto.model.Tbl_posto_autorizado;

public interface PostoAutorizadoRepository extends JpaRepository<Tbl_posto_autorizado, Long>{
	
    @Query("SELECT p FROM Tbl_posto_autorizado p")
    List<Tbl_posto_autorizado> getPostosAutorizados();

}
