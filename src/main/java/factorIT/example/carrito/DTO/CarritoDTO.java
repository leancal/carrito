package factorIT.example.carrito.DTO;

import factorIT.example.carrito.modelos.Carrito;

import java.util.Set;
import java.util.stream.Collectors;

public class CarritoDTO {

    private long id;

    private String nombreProductoAgregado;

    private int cantidadLlevada;


    private double precio;


    private Set<ProductosDTO> productos;

    public CarritoDTO(Carrito carritoNormal) {

        this.id = carritoNormal.getId();

        this.nombreProductoAgregado = carritoNormal.getNombreProductoAgregado();


        this.cantidadLlevada = carritoNormal.getCantidadLlevada();


        this.precio = carritoNormal.getPrecio();


        this.productos= carritoNormal.getProductos().stream().map(ProductosDTO::new).collect(Collectors.toSet());

    }

    public long getId() {
        return id;
    }

    public String getNombreProductoAgregado() {
        return nombreProductoAgregado;
    }


    public int getCantidadLlevada() {
        return cantidadLlevada;
    }



    public double getPrecio() {
        return precio;
    }


}
