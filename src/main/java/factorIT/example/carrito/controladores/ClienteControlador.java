package factorIT.example.carrito.controladores;


import factorIT.example.carrito.DTO.ClienteDTO;
import factorIT.example.carrito.repositorios.ClienteRepositorio;
import factorIT.example.carrito.servicios.ClienteServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class ClienteControlador {

    @Autowired
    ClienteServicios clienteServicios;

    @GetMapping("/clientes")
    public List<ClienteDTO> obtenerListaClientesDTO(){
        return clienteServicios.obtenerListaClientes();
    }




}
