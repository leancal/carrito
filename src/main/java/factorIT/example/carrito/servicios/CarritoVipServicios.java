package factorIT.example.carrito.servicios;

import factorIT.example.carrito.DTO.CarritoDTO;
import factorIT.example.carrito.DTO.CarritoVipDTO;
import factorIT.example.carrito.modelos.Carrito;
import factorIT.example.carrito.modelos.CarritoVip;

import java.util.List;

public interface CarritoVipServicios {
    public List<CarritoVipDTO> obtenerListaCarritoVip();

    public List<CarritoVipDTO> eliminarCarritoVip();

    public void guardarCarritoVip(CarritoVip carritoVip);

}
