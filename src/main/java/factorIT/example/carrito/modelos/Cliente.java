package factorIT.example.carrito.modelos;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @GenericGenerator(name = "native", strategy = "native")
    private long id;

    @OneToMany(mappedBy = "cliente")
    private Set<ClienteProducto> productos = new HashSet<>();


    private String primerNombre;
    private String apellido;
    private String email;
    private String contraseña;


    public Cliente() {
    }

    public Cliente(  String primerNombre, String apellido, String email, String contraseña) {
        this.primerNombre = primerNombre;
        this.apellido = apellido;
        this.email = email;
        this.contraseña = contraseña;
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

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}
