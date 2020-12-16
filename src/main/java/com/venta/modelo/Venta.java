package com.venta.modelo;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "venta")
public class Venta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long nrofac;
    private String cliente;
    private int meses;
    private String fecha;

    @ManyToOne
    @JoinColumn(name = "codart")
    private Artefacto artefacto;

    public String NumFac() {
        return String.format("%08d", nrofac);
    }

    public double Interes() {
        return (artefacto.getPreart()) * (getMeses() * 0.05);
    }

    public double Saldo() {
        return artefacto.getPreart() + Interes();
    }

    public double Cuota() {
        return Saldo() / getMeses();
    }
}
