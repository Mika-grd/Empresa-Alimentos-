package co.edu.uniquindio.poo.model;

public class ProductoRefrigerado extends Producto implements Refrigerable{

    private String codigoAprobacion;
    private int temperaturaREcomendada;
    
    public ProductoRefrigerado(String codigo, double precioCompra, String nombre, double impuesto, Proveedor proveedor,
            double precioVenta, String codigoAprobacion, int temperaturaREcomendada) {
        super(codigo, precioCompra, nombre, impuesto, proveedor, precioVenta);
        this.codigoAprobacion = codigoAprobacion;
        this.temperaturaREcomendada = temperaturaREcomendada;
    }


    public String getCodigoAprobacion() {
        return codigoAprobacion;
    }

    public void setCodigoAprobacion(String codigoAprobacion) {
        this.codigoAprobacion = codigoAprobacion;
    }

    public int getTemperaturaREcomendada() {
        return temperaturaREcomendada;
    }

    public void setTemperaturaREcomendada(int temperaturaREcomendada) {
        this.temperaturaREcomendada = temperaturaREcomendada;
    }

    @Override
    public double calcularImpuesto(){
        return super.getPrecioVenta() + super.getPrecioVenta()*.05;
    }

    @Override
    public double calcularPrecioVenta(){
        double absolutoTemperatura = temperaturaREcomendada;
        if (absolutoTemperatura < 0) {
            absolutoTemperatura = absolutoTemperatura*-1;
        }
        super.setPrecioVenta(super.getPrecioCompra() * absolutoTemperatura);
        return super.getPrecioCompra() * absolutoTemperatura;
    }

    public String iniciarProcesoRefrigeracion(){
        return "El producto " + super.getNombre() + " está siendo refrigerado a una temperatura de " + temperaturaREcomendada + " grados";
    }

}
