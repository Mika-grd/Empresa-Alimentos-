package co.edu.uniquindio.poo.model;

public class MedicamentoFarmacologico implements Refrigerable {

    private String nombre;
    private String codigo;
    private double temperaturaREcomendada;

    public String iniciarProcesoRefrigeracion(){
        return "El medicamento " + nombre + " está siendo refrigerado a una temperatura de " + temperaturaREcomendada + " grados";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getTemperaturaREcomendada() {
        return temperaturaREcomendada;
    }

    public void setTemperaturaREcomendada(double temperaturaREcomendada) {
        this.temperaturaREcomendada = temperaturaREcomendada;
    }

    public MedicamentoFarmacologico(String nombre, String codigo, double temperaturaREcomendada) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.temperaturaREcomendada = temperaturaREcomendada;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
        long temp;
        temp = Double.doubleToLongBits(temperaturaREcomendada);
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
        MedicamentoFarmacologico other = (MedicamentoFarmacologico) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (codigo == null) {
            if (other.codigo != null)
                return false;
        } else if (!codigo.equals(other.codigo))
            return false;
        if (Double.doubleToLongBits(temperaturaREcomendada) != Double.doubleToLongBits(other.temperaturaREcomendada))
            return false;
        return true;
    }

    
}
