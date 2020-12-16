package com.venta.dao;

import com.venta.modelo.Artefacto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtefactoDao extends JpaRepository<Artefacto, Long>{
    
}
