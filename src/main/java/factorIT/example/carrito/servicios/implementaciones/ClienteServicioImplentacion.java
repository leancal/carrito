package factorIT.example.carrito.servicios.implementaciones;

import factorIT.example.carrito.DTO.CarritoVipDTO;
import factorIT.example.carrito.DTO.ClienteDTO;
import factorIT.example.carrito.repositorios.ClienteRepositorio;
import factorIT.example.carrito.servicios.ClienteServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClienteServicioImplentacion implements ClienteServicios {
    @Autowired
    ClienteRepositorio clienteRepositorio;

    @Override
    public List<ClienteDTO> obtenerListaClientes() {
        return clienteRepositorio.findAll().stream().map(ClienteDTO::new).collect(Collectors.toList());
    }
}
