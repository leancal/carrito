package factorIT.example.carrito.servicios;
import factorIT.example.carrito.DTO.CarritoPromocionableDTO;
import factorIT.example.carrito.modelos.Carrito;
import factorIT.example.carrito.modelos.CarritoPromocionable;

import java.util.List;

public interface CarritoPromocionableServicios {

    public List<CarritoPromocionableDTO> obtenerListaCarritoPromocionable();

    public List<CarritoPromocionableDTO> eliminarCarritoPromocionable();

    public void guardarCarritoPromocionable(CarritoPromocionable carritoPromocionable);
}
