package factorIT.example.carrito.DTO;


import factorIT.example.carrito.modelos.CarritoVip;

import java.util.Set;
import java.util.stream.Collectors;

public class CarritoVipDTO {

    private long id;

    private String nombreProductoAgregado;

    private int cantidadLlevada;


    private double precio;


    private Set<ProductosDTO> productos;

    public CarritoVipDTO(CarritoVip carritoVip) {

        this.id = carritoVip.getId();

        this.nombreProductoAgregado = carritoVip.getNombreProductoAgregado();


        this.cantidadLlevada = carritoVip.getCantidadLlevada();


        this.precio = carritoVip.getPrecio();


        this.productos= carritoVip.getProductos().stream().map(ProductosDTO::new).collect(Collectors.toSet());

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
