package co.edu.uniquindio.poo.model;

public abstract class Producto {

    private String codigo;
    private double precioCompra;
    private String nombre;
    private double impuesto = 0;
    private Proveedor proveedor;
    private double precioVenta = 0;


    public abstract double calcularPrecioVenta();
    public abstract double calcularImpuesto();


    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public double getPrecioCompra() {
        return precioCompra;
    }
    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getImpuesto() {
        return impuesto;
    }
    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }
    public Proveedor getProveedor() {
        return proveedor;
    }
    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }
    public double getPrecioVenta() {
        return precioVenta;
    }
    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }
    public Producto(String codigo, double precioCompra, String nombre, double impuesto, Proveedor proveedor,
            double precioVenta) {
        this.codigo = codigo;
        this.precioCompra = precioCompra;
        this.nombre = nombre;
        this.impuesto = impuesto;
        this.proveedor = proveedor;
        this.precioVenta = precioVenta;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
        long temp;
        temp = Double.doubleToLongBits(precioCompra);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        temp = Double.doubleToLongBits(impuesto);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((proveedor == null) ? 0 : proveedor.hashCode());
        temp = Double.doubleToLongBits(precioVenta);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Producto other = (Producto) obj;
        if (codigo == null) {
            if (other.codigo != null)
                return false;
        } else if (!codigo.equals(other.codigo))
            return false;
        if (Double.doubleToLongBits(precioCompra) != Double.doubleToLongBits(other.precioCompra))
            return false;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (Double.doubleToLongBits(impuesto) != Double.doubleToLongBits(other.impuesto))
            return false;
        if (proveedor == null) {
            if (other.proveedor != null)
                return false;
        } else if (!proveedor.equals(other.proveedor))
            return false;
        if (Double.doubleToLongBits(precioVenta) != Double.doubleToLongBits(other.precioVenta))
            return false;
        return true;
    }
    
    

}
