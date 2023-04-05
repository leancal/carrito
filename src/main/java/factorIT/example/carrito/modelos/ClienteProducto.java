package factorIT.example.carrito.modelos;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
public class ClienteProducto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "productos_id")
    private Productos productos;


    private String nombre;

    private int cantidad;

    private double montoDeProducto;

    private double montoTotal;

    private int descuento;

    public ClienteProducto() {
    }

    public ClienteProducto( Cliente cliente, Productos productos, String nombre, int cantidad, double montoDeProducto, double montoTtotal, int descuento) {
        this.cliente = cliente;
        this.productos = productos;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.montoDeProducto = montoDeProducto;
        this.montoTotal = montoTtotal;
        this.descuento = descuento;
    }

    public long getId() {
        return id;
    }


    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Productos getProductos() {
        return productos;
    }

    public void setProductos(Productos productos) {
        this.productos = productos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getMontoDeProducto() {
        return montoDeProducto;
    }

    public void setMontoDeProducto(double montoDeProducto) {
        this.montoDeProducto = montoDeProducto;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTtotal) {
        this.montoTotal = montoTtotal;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }
}
