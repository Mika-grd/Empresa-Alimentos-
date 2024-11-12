package co.edu.uniquindio.poo.model;

import java.util.LinkedList;

public class EpresaAlimentos {
    private String nombre;
    private LinkedList<Proveedor> listaProveedores;
    private LinkedList<Producto> listaProductos;
    private LinkedList<MedicamentoFarmacologico> listaMedicamentos;


    //Metodos punto 1

    public double calcularPrecioVenta(Producto producto){
        return producto.calcularPrecioVenta();
    }
    public double calcularImpuesto(Producto producto){
        return producto.calcularImpuesto();
    }


    // CRUD Proveedor

    /**
     * Añadir Proveedor
     * 
     * @param proveedor
     * @return
     * @throws IllegalArgumentException
     */
    public String añadirProveedor(Proveedor proveedor) throws IllegalArgumentException {
        String mensaje = "Se añadió correctamente";
        if (proveedor == null) {
            throw new IllegalArgumentException("No se aceptan objetos nulos");
        }
        listaProveedores.add(proveedor);
        return mensaje;
    }

    /**
     * Eliminar Proveedor
     * 
     * @param proveedor
     * @return
     * @throws IllegalArgumentException
     */
    public String eliminarProveedor(Proveedor proveedor) throws IllegalArgumentException {
        String mensaje = "Se eliminó correctamente";
        if (proveedor == null) {
            throw new IllegalArgumentException("No se aceptan objetos nulos");
        }
        if (!listaProveedores.contains(proveedor)) {
            mensaje = "No se encuentra en la lista";
        }
        listaProveedores.remove(proveedor);
        return mensaje;
    }

    /**
     * Buscar proveedor por nombre
     * 
     * @param nombre
     * @return
     */
    public Proveedor buscarProveedor(String nombre) {
        return listaProveedores.stream().filter(clienteaux -> clienteaux.nombre().equals(nombre)).findFirst()
                .orElse(null);
    }

    /**
     * Editar proveedor, borra uno y añade el nuevo
     * 
     * @param proveedor
     * @param nuevoProveedor
     * @return
     * @throws IllegalArgumentException
     */
    public String editarProveedor(Proveedor proveedor, Proveedor nuevoProveedor) throws IllegalArgumentException {
        String mensaje = "editado correctamente";

        if (proveedor == null || nuevoProveedor == null) {
            throw new IllegalArgumentException("No se aceptan objetos nulos");
        }

        if (!listaProveedores.contains(proveedor)) {
            mensaje = "No se encuentra en la lista";
        }

        listaProveedores.remove(proveedor);
        listaProveedores.add(nuevoProveedor);
        return mensaje;
    }

    // CRUD Producto

    /**
     * Añadir Producto
     * 
     * @param producto
     * @return
     * @throws IllegalArgumentException
     */
    public String añadirProducto(Producto producto) throws IllegalArgumentException {
        String mensaje = "Se añadió correctamente";
        if (producto == null) {
            throw new IllegalArgumentException("No se aceptan objetos nulos");
        }
        listaProductos.add(producto);
        return mensaje;
    }

    /**
     * Eliminar Producto
     * 
     * @param producto
     * @return
     * @throws IllegalArgumentException
     */
    public String eliminarProducto(Producto producto) throws IllegalArgumentException {
        String mensaje = "Se eliminó correctamente";
        if (producto == null) {
            throw new IllegalArgumentException("No se aceptan objetos nulos");
        }
        if (!listaProductos.contains(producto)) {
            mensaje = "No se encuentra en la lista";
        }
        listaProductos.remove(producto);
        return mensaje;
    }

    /**
     * Buscar Producto por Código
     * 
     * @param codigo
     * @return
     */
    public Producto buscarProducto(String codigo) {
        return listaProductos.stream().filter(producto -> producto.getCodigo().equals(codigo)).findFirst().orElse(null);
    }

    /**
     * Editar Producto, borra uno y añade el nuevo
     * 
     * @param producto
     * @param nuevoProducto
     * @return
     * @throws IllegalArgumentException
     */
    public String editarProducto(Producto producto, Producto nuevoProducto) throws IllegalArgumentException {
        String mensaje = "editado correctamente";

        if (producto == null || nuevoProducto == null) {
            throw new IllegalArgumentException("No se aceptan objetos nulos");
        }

        if (!listaProductos.contains(producto)) {
            mensaje = "No se encuentra en la lista";
        }

        listaProductos.remove(producto);
        listaProductos.add(nuevoProducto);
        return mensaje;
    }

    // CRUD MedicamentoFarmacologico

    /**
     * Añadir MedicamentoFarmacologico
     * 
     * @param medicamento
     * @return
     * @throws IllegalArgumentException
     */
    public String añadirMedicamento(MedicamentoFarmacologico medicamento) throws IllegalArgumentException {
        String mensaje = "Se añadió correctamente";
        if (medicamento == null) {
            throw new IllegalArgumentException("No se aceptan objetos nulos");
        }
        listaMedicamentos.add(medicamento);
        return mensaje;
    }

    /**
     * Eliminar MedicamentoFarmacologico
     * 
     * @param medicamento
     * @return
     * @throws IllegalArgumentException
     */
    public String eliminarMedicamento(MedicamentoFarmacologico medicamento) throws IllegalArgumentException {
        String mensaje = "Se eliminó correctamente";
        if (medicamento == null) {
            throw new IllegalArgumentException("No se aceptan objetos nulos");
        }
        if (!listaMedicamentos.contains(medicamento)) {
            mensaje = "No se encuentra en la lista";
        }
        listaMedicamentos.remove(medicamento);
        return mensaje;
    }

    /**
     * Buscar MedicamentoFarmacologico por Código
     * 
     * @param codigo
     * @return
     */
    public MedicamentoFarmacologico buscarMedicamento(String codigo) {
        return listaMedicamentos.stream().filter(medicamento -> medicamento.getCodigo().equals(codigo)).findFirst()
                .orElse(null);
    }

    /**
     * Editar MedicamentoFarmacologico, borra uno y añade el nuevo
     * 
     * @param medicamento
     * @param nuevoMedicamento
     * @return
     * @throws IllegalArgumentException
     */
    public String editarMedicamento(MedicamentoFarmacologico medicamento, MedicamentoFarmacologico nuevoMedicamento)
            throws IllegalArgumentException {
        String mensaje = "editado correctamente";

        if (medicamento == null || nuevoMedicamento == null) {
            throw new IllegalArgumentException("No se aceptan objetos nulos");
        }

        if (!listaMedicamentos.contains(medicamento)) {
            mensaje = "No se encuentra en la lista";
        }

        listaMedicamentos.remove(medicamento);
        listaMedicamentos.add(nuevoMedicamento);
        return mensaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LinkedList<Proveedor> getListaProveedores() {
        return listaProveedores;
    }

    public void setListaProveedores(LinkedList<Proveedor> listaProveedores) {
        this.listaProveedores = listaProveedores;
    }

    public LinkedList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(LinkedList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public LinkedList<MedicamentoFarmacologico> getListaMedicamentos() {
        return listaMedicamentos;
    }

    public void setListaMedicamentos(LinkedList<MedicamentoFarmacologico> listaMedicamentos) {
        this.listaMedicamentos = listaMedicamentos;
    }

    public EpresaAlimentos(String nombre, LinkedList<Proveedor> listaProveedores, LinkedList<Producto> listaProductos,
            LinkedList<MedicamentoFarmacologico> listaMedicamentos) {
        this.nombre = nombre;
        this.listaProveedores = listaProveedores;
        this.listaProductos = listaProductos;
        this.listaMedicamentos = listaMedicamentos;
    }

}
