package factorIT.example.carrito.servicios.implementaciones;

import factorIT.example.carrito.DTO.CarritoDTO;
import factorIT.example.carrito.DTO.CarritoPromocionableDTO;
import factorIT.example.carrito.DTO.CarritoVipDTO;
import factorIT.example.carrito.modelos.Carrito;
import factorIT.example.carrito.modelos.CarritoVip;
import factorIT.example.carrito.repositorios.CarritoPromocionableRepositorio;
import factorIT.example.carrito.repositorios.CarritoVipRepositorio;
import factorIT.example.carrito.servicios.CarritoVipServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarritoVipServicioImpementacion implements CarritoVipServicios {
    @Autowired
    CarritoVipRepositorio carritoVipRepositorio;

    @Override
    public List<CarritoVipDTO> obtenerListaCarritoVip() {
        return carritoVipRepositorio.findAll().stream().map(CarritoVipDTO::new).collect(Collectors.toList());
    }

    @Override
    public List<CarritoVipDTO> eliminarCarritoVip() {
        carritoVipRepositorio.deleteAll();
        return null;
    }

    @Override
    public void guardarCarritoVip(CarritoVip carritoVip) {
        carritoVipRepositorio.save(carritoVip);
    }


}
