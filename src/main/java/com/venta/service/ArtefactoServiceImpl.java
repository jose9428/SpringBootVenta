package com.venta.service;

import com.venta.dao.ArtefactoDao;
import com.venta.modelo.Artefacto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArtefactoServiceImpl implements ArtefactoService{

    @Autowired
    private ArtefactoDao artefactoDao;
    
    @Override
    public List<Artefacto> ListarArtefactos() {
        return artefactoDao.findAll();
    }
    
}
