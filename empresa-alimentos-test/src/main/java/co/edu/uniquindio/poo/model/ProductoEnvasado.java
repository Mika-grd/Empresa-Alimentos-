package co.edu.uniquindio.poo.model;

import java.time.LocalDate;

public class ProductoEnvasado extends Producto{

    private LocalDate fechaEnvasado;
    private int pesoEnvase;
    private PaisOrigen paisOrigen;

    

    public ProductoEnvasado(String codigo, double precioCompra, String nombre, double impuesto, Proveedor proveedor,
            double precioVenta, LocalDate fechaEnvasado, int pesoEnvase, PaisOrigen paisOrigen) {
        super(codigo, precioCompra, nombre, impuesto, proveedor, precioVenta);
        this.fechaEnvasado = fechaEnvasado;
        this.pesoEnvase = pesoEnvase;
        this.paisOrigen = paisOrigen;
    }

    

    public LocalDate getFechaEnvasado() {
        return fechaEnvasado;
    }



    public void setFechaEnvasado(LocalDate fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }



    public int getPesoEnvase() {
        return pesoEnvase;
    }



    public void setPesoEnvase(int pesoEnvase) {
        this.pesoEnvase = pesoEnvase;
    }



    public PaisOrigen getPaisOrigen() {
        return paisOrigen;
    }



    public void setPaisOrigen(PaisOrigen paisOrigen) {
        this.paisOrigen = paisOrigen;
    }



    @Override
    public double calcularImpuesto(){
        return super.getPrecioVenta() + super.getPrecioVenta()*.1;
    }

    @Override
    public double calcularPrecioVenta(){
        super.setPrecioVenta(super.getPrecioCompra() * pesoEnvase);
        return super.getPrecioCompra() * pesoEnvase;
    }
}
