package com.venta.dao;

import com.venta.modelo.Venta;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VentaDao extends JpaRepository<Venta, Long> {

    public List<Venta> findByFechaBetween(String inicio, String fin);
}
