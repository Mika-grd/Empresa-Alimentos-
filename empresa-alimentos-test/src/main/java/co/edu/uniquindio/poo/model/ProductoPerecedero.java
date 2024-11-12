package co.edu.uniquindio.poo.model;

import java.time.LocalDate;

public class ProductoPerecedero  extends Producto{

    private LocalDate fechaVencimiento;

    public ProductoPerecedero(String codigo, double precioCompra, String nombre, double impuesto, Proveedor proveedor,
            double precioVenta, LocalDate fechaVencimiento) {
        super(codigo, precioCompra, nombre, impuesto, proveedor, precioVenta);
        this.fechaVencimiento = fechaVencimiento;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    @Override
    public double calcularImpuesto(){
        return super.getPrecioVenta() + super.getPrecioVenta()*.08;
    }

    @Override
    public double calcularPrecioVenta(){
        super.setPrecioVenta(super.getPrecioCompra() + super.getPrecioCompra() * .35);
        return super.getPrecioCompra() + super.getPrecioCompra() * .35;
    }
}
