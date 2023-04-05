package factorIT.example.carrito.servicios.implementaciones;
import factorIT.example.carrito.DTO.CarritoPromocionableDTO;
import factorIT.example.carrito.modelos.CarritoPromocionable;
import factorIT.example.carrito.modelos.CarritoVip;
import factorIT.example.carrito.repositorios.CarritoPromocionableRepositorio;
import factorIT.example.carrito.servicios.CarritoPromocionableServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class CarritoPromocionableServicioImplementacion implements CarritoPromocionableServicios {

    @Autowired
    CarritoPromocionableRepositorio carritoPromocionableRepositorio;

    @Override
    public List<CarritoPromocionableDTO> obtenerListaCarritoPromocionable() {
        return carritoPromocionableRepositorio.findAll().stream().map(CarritoPromocionableDTO::new).collect(Collectors.toList());
    }

    @Override
    public List<CarritoPromocionableDTO> eliminarCarritoPromocionable() {
        carritoPromocionableRepositorio.deleteAll();
        return null;
    }

    @Override
    public void guardarCarritoPromocionable(CarritoPromocionable carritoPromocionable) {
        carritoPromocionableRepositorio.save(carritoPromocionable);
    }

}
