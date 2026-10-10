package com.examen_t2.LP2_T2_Mendez_Claudio.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examen_t2.LP2_T2_Mendez_Claudio.model.OrdenCompraMendezClaudio;

@Repository
public interface OrdenCompraMendezClaudioRepository extends JpaRepository<OrdenCompraMendezClaudio, Integer> {
    List<OrdenCompraMendezClaudio> findAllByOrderByNroOrdenDesc();
}