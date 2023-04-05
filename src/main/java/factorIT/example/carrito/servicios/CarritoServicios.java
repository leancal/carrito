package factorIT.example.carrito.servicios;
import factorIT.example.carrito.DTO.CarritoDTO;
import factorIT.example.carrito.modelos.Carrito;

import java.util.List;

public interface CarritoServicios {

    public List<CarritoDTO> obtenerListaCarrito();

    public List<CarritoDTO> eliminarCarrito();

    public void guardarCarrito(Carrito carrito);

}