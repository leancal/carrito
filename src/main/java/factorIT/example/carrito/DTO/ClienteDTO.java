package factorIT.example.carrito.DTO;

import factorIT.example.carrito.modelos.Cliente;

import java.util.Set;
import java.util.stream.Collectors;


public class ClienteDTO {
    private long id;
    private String primerNombre;
    private String apellido;
    private String email;

    private Set<ClienteProductoDTO> clienteProducto;



    public ClienteDTO(Cliente cliente) {

        this.id = cliente.getId();

        this.primerNombre = cliente.getPrimerNombre();

        this.apellido = cliente.getApellido();

        this.email = cliente.getEmail();

        this.clienteProducto= cliente.getProductos().stream().map(ClienteProductoDTO::new).collect(Collectors.toSet());

    }

    public long getId() {
        return id;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEmail() {
        return email;
    }

    public Set<ClienteProductoDTO> getClienteProducto() {
        return clienteProducto;
    }
}
