package factorIT.example.carrito.DTO;

import factorIT.example.carrito.modelos.Cliente;
import factorIT.example.carrito.modelos.ClienteProducto;
import factorIT.example.carrito.modelos.Productos;

public class ClienteProductoDTO {

    private long id;

    private String nombre;

    private int cantidad;

    private double montoDeProducto;

    private double montoTotal;

    private int descuento;

    private Cliente cliente;

    private Productos productos;

    public ClienteProductoDTO(ClienteProducto clienteProducto) {
        this.id = clienteProducto.getId();
        this.nombre = clienteProducto.getNombre();
        this.cantidad = clienteProducto.getCantidad();
        this.montoDeProducto = clienteProducto.getMontoDeProducto();
        this.montoTotal = clienteProducto.getMontoTotal();
        this.descuento = clienteProducto.getDescuento();
        this.cliente = clienteProducto.getCliente();
        this.productos = clienteProducto.getProductos();
    }

    public long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getMontoDeProducto() {
        return montoDeProducto;
    }

    public double getMontoTtotal() {
        return montoTotal;
    }

    public int getDescuento() {
        return descuento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Productos getProductos() {
        return productos;
    }
}
