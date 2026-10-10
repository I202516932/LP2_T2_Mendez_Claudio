package com.examen_t2.LP2_T2_Mendez_Claudio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen_t2.LP2_T2_Mendez_Claudio.model.OrdenCompraMendezClaudio;
import com.examen_t2.LP2_T2_Mendez_Claudio.repository.OrdenCompraMendezClaudioRepository;

@Service
public class OrdenCompraMendezClaudioServiceImpl implements OrdenCompraMendezClaudioService {

    @Autowired
    private OrdenCompraMendezClaudioRepository repo;

    @Override
    public List<OrdenCompraMendezClaudio> listar() {
        return repo.findAllByOrderByNroOrdenDesc();
    }

    @Override
    public OrdenCompraMendezClaudio buscar(Integer nroOrden) {
        return repo.findById(nroOrden).orElse(null);
    }

    @Override
    public OrdenCompraMendezClaudio guardar(OrdenCompraMendezClaudio orden) {
        return repo.save(orden);
    }
}