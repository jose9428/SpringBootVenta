package com.venta.service;

import com.venta.modelo.Venta;
import java.util.List;

public interface VentaService {

    List<Venta> ListarVentas();

    void GuardarVenta(Venta venta);

    List<Venta> ListarVentasFiltro(String inicio, String fin);
}
