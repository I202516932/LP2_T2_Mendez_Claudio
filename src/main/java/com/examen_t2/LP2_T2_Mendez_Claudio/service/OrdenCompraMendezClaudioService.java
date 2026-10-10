package com.examen_t2.LP2_T2_Mendez_Claudio.service;

import java.util.List;

import com.examen_t2.LP2_T2_Mendez_Claudio.model.OrdenCompraMendezClaudio;

public interface OrdenCompraMendezClaudioService {
    List<OrdenCompraMendezClaudio> listar();
    OrdenCompraMendezClaudio buscar(Integer nroOrden);
    OrdenCompraMendezClaudio guardar(OrdenCompraMendezClaudio orden);
}