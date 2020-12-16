package com.venta.service;

import com.venta.dao.VentaDao;
import com.venta.modelo.Venta;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class VentaServiceImpl implements VentaService {

    @Autowired
    private VentaDao ventaDao;

    @Override
    public List<Venta> ListarVentas() {
        return ventaDao.findAll();
    }

    @Override
    public void GuardarVenta(Venta venta) {
        venta.setFecha(FechaActual());
        ventaDao.save(venta);
    }

    @Override
    public List<Venta> ListarVentasFiltro(String inicio, String fin) {
        return ventaDao.findByFechaBetween(inicio, fin);
    }

    public String FechaActual() {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String cad = "";

        try {
            cad = df.format(new Date());
        } catch (Exception ex) {
        }
        return cad;
    }
}
