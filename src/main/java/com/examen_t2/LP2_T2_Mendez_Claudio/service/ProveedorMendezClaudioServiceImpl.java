package com.examen_t2.LP2_T2_Mendez_Claudio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen_t2.LP2_T2_Mendez_Claudio.model.ProveedorMendezClaudio;
import com.examen_t2.LP2_T2_Mendez_Claudio.repository.ProveedorMendezClaudioRepository;

@Service
public class ProveedorMendezClaudioServiceImpl implements ProveedorMendezClaudioService {

    @Autowired
    private ProveedorMendezClaudioRepository repo;

    @Override
    public List<ProveedorMendezClaudio> listar() {
        return repo.findAll();
    }
}