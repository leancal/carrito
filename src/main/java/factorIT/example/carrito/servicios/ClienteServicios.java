package factorIT.example.carrito.servicios;

import factorIT.example.carrito.DTO.CarritoDTO;
import factorIT.example.carrito.DTO.ClienteDTO;

import java.util.List;

public interface ClienteServicios {
    public List<ClienteDTO> obtenerListaClientes();
}
