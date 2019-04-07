package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Cadastrados;

@Repository
public interface CadastradosRepository extends JpaRepository<Cadastrados,Integer>{
	

}
