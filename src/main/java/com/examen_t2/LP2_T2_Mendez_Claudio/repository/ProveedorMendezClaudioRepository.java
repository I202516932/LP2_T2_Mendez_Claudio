package com.examen_t2.LP2_T2_Mendez_Claudio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examen_t2.LP2_T2_Mendez_Claudio.model.ProveedorMendezClaudio;

@Repository
public interface ProveedorMendezClaudioRepository extends JpaRepository<ProveedorMendezClaudio, Integer> {
}