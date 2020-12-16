package com.venta.controlador;


import com.venta.modelo.Venta;
import com.venta.service.ArtefactoService;
import com.venta.service.VentaService;
import javax.websocket.server.PathParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@Slf4j
public class IndexController {

    @Autowired
    private ArtefactoService artefactoService;
    @Autowired
    private VentaService ventaService;

    @GetMapping("/")
    public String Inicio(Model model) {
        log.info("Entre al controlador inicio");
        var lista = ventaService.ListarVentas();
        log.info(lista.toString());
        
        model.addAttribute("listaVenta", ventaService.ListarVentas());
        return "index";
    }

    @GetMapping("/Venta")
    public String CrearVenta(Model model, Venta venta) {
        var lista = artefactoService.ListarArtefactos();
        model.addAttribute("listaArtefacto", lista);
        return "Venta";
    }

    @PostMapping("/GuardarVenta")
    public String GenerarVenta(Model model, Venta venta, RedirectAttributes attributes) {
        ventaService.GuardarVenta(venta);

        attributes.addFlashAttribute("mensaje", "Venta generada correctamente del cliente " + venta.getCliente());
        return "redirect:/";
    }

    @GetMapping("/Consultar")
    public String Consultar() {
        return "Consultar";
    }

    @GetMapping("/FiltroConsulta")
    public String FiltroConsulta(@PathParam("inicio") String inicio, @PathParam("fin") String fin ,
            Model model) {
        
        model.addAttribute("listaVenta", ventaService.ListarVentasFiltro(inicio, fin));
        return "Filtro";
    }
}
