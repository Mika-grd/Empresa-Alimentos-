package co.edu.uniquindio.poo.model;

public record Proveedor(String nombre, String direccion) {

    public String nombre() {
        return nombre;
    }

    public String direccion() {
        return direccion;
    }

}
