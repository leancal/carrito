package factorIT.example.carrito.servicios.implementaciones;
import factorIT.example.carrito.DTO.CarritoDTO;
import factorIT.example.carrito.modelos.Carrito;
import factorIT.example.carrito.repositorios.CarritoRepositorio;
import factorIT.example.carrito.servicios.CarritoServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarritoServicioImplementacion implements CarritoServicios {
    @Autowired
    CarritoRepositorio carritoRepositorio;

    @Override
    public List<CarritoDTO> obtenerListaCarrito() {
        return carritoRepositorio.findAll().stream().map(CarritoDTO::new).collect(Collectors.toList());
    }

    @Override
    public List<CarritoDTO> eliminarCarrito() {
        carritoRepositorio.deleteAll();
        return null;
    }

    @Override
    public void guardarCarrito(Carrito carrito) {
        carritoRepositorio.save(carrito);
    }





}
