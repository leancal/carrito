package factorIT.example.carrito.DTO;

import factorIT.example.carrito.modelos.CarritoPromocionable;

import java.util.Set;
import java.util.stream.Collectors;

public class CarritoPromocionableDTO {

    private long id;

    private String nombreProductoAgregado;

    private int cantidadLlevada;


    private double precio;


    private Set<ProductosDTO> productos;

    public CarritoPromocionableDTO(CarritoPromocionable carritoPromocionable) {

        this.id = carritoPromocionable.getId();

        this.nombreProductoAgregado = carritoPromocionable.getNombreProductoAgregado();


        this.cantidadLlevada = carritoPromocionable.getCantidadLlevada();


        this.precio = carritoPromocionable.getPrecio();


        this.productos= carritoPromocionable.getProductos().stream().map(ProductosDTO::new).collect(Collectors.toSet());

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
