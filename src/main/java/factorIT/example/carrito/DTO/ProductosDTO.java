package factorIT.example.carrito.DTO;


import factorIT.example.carrito.modelos.Productos;

import java.time.LocalDate;

public class ProductosDTO {

    private long id;

    private String nombre;

    private String descripcion;

    private double precio;

    private int stock;

    private String urlImg;

    private LocalDate fechaEspecial;






    public ProductosDTO(Productos productos) {

        this.id = productos.getId();

        this.nombre = productos.getNombre();

        this.descripcion = productos.getDescripcion();

        this.precio = productos.getPrecio();

        this.stock = productos.getStock();

        this.urlImg = productos.getUrlImg();

        this.fechaEspecial = productos.getFechaEspecial();




    }

    public long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public String getUrlImg() {
        return urlImg;
    }

    public LocalDate getFechaEspecial() {
        return fechaEspecial;
    }



}
