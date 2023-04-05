package factorIT.example.carrito.modelos;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.HashSet;
import java.util.Set;

@Entity
public class CarritoVip {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @GenericGenerator(name = "native", strategy = "native")
    private long id;

    @OneToMany(mappedBy = "carritoVip")
    private Set<Productos> productos = new HashSet<>();



    private String nombreProductoAgregado;


    private int cantidadLlevada;


    private double precio;

    public CarritoVip() {
    }

    public CarritoVip( String nombreProductoAgregado, int cantidadLlevada, double precio) {
        this.nombreProductoAgregado = nombreProductoAgregado;
        this.cantidadLlevada = cantidadLlevada;
        this.precio = precio;
    }

    public long getId() {
        return id;
    }

    public Set<Productos> getProductos() {
        return productos;
    }

    public void setProductos(Set<Productos> productos) {
        this.productos = productos;
    }

    public String getNombreProductoAgregado() {
        return nombreProductoAgregado;
    }

    public void setNombreProductoAgregado(String nombreProductoAgregado) {
        this.nombreProductoAgregado = nombreProductoAgregado;
    }

    public int getCantidadLlevada() {
        return cantidadLlevada;
    }

    public void setCantidadLlevada(int cantidadLlevada) {
        this.cantidadLlevada = cantidadLlevada;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
