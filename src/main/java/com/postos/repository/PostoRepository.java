package com.postos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.postos.models.Tbl_posto;

public interface PostoRepository extends JpaRepository<Tbl_posto, String>{
	

}
