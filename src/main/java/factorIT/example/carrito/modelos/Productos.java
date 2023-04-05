package factorIT.example.carrito.modelos;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Productos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @GenericGenerator(name = "native", strategy = "native")
    private long id;

    @OneToMany(mappedBy = "productos")
    private Set<ClienteProducto> productos = new HashSet<>();

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "carritoNormal_id")
    private Carrito carrito;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "carritoPromocionable_id")
    private CarritoPromocionable carritoPromocionable;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "carritoVip_id")
    private CarritoVip carritoVip;



    private String nombre;

    private String descripcion;

    private double precio;

    private int stock;

    private String urlImg;

    private LocalDate fechaEspecial;


    public Productos() {
    }

    public Productos( String nombre, String descripcion, double precio, int stock, String urlImg, LocalDate fechaEspecial) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.urlImg = urlImg;
        this.fechaEspecial = fechaEspecial;
    }

    public long getId() {
        return id;
    }



    public Set<ClienteProducto> getProductos() {
        return productos;
    }

    public void setProductos(Set<ClienteProducto> productos) {
        this.productos = productos;
    }

    public Carrito getCarrito() {
        return carrito;
    }

    public void setCarrito(Carrito carrito) {
        this.carrito = carrito;
    }

    public CarritoPromocionable getCarritoPromocionable() {
        return carritoPromocionable;
    }

    public void setCarritoPromocionable(CarritoPromocionable carritoPromocionable) {
        this.carritoPromocionable = carritoPromocionable;
    }

    public CarritoVip getCarritoVip() {
        return carritoVip;
    }

    public void setCarritoVip(CarritoVip carritoVip) {
        this.carritoVip = carritoVip;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getUrlImg() {
        return urlImg;
    }

    public void setUrlImg(String urlImg) {
        this.urlImg = urlImg;
    }

    public LocalDate getFechaEspecial() {
        return fechaEspecial;
    }

    public void setFechaEspecial(LocalDate fechaEspecial) {
        this.fechaEspecial = fechaEspecial;
    }


}

