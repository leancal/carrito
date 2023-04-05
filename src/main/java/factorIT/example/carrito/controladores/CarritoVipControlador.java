package factorIT.example.carrito.controladores;

import factorIT.example.carrito.DTO.CarritoDTO;
import factorIT.example.carrito.DTO.CarritoPromocionableDTO;
import factorIT.example.carrito.DTO.CarritoVipDTO;
import factorIT.example.carrito.modelos.CarritoVip;
import factorIT.example.carrito.repositorios.CarritoVipRepositorio;
import factorIT.example.carrito.servicios.CarritoVipServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class CarritoVipControlador {

    @Autowired
    CarritoVipServicios carritoVipServicios;

    @GetMapping("/carritoVip")
    public List<CarritoVipDTO> obtenerListaCarritoVip() {
        return carritoVipServicios.obtenerListaCarritoVip();
    }

    @DeleteMapping("/eliminarCarritoVip")
    public ResponseEntity<Object> eliminarCarrito() {
        List<CarritoVipDTO> carritoVipDTO = carritoVipServicios.obtenerListaCarritoVip();
        if (carritoVipDTO.size() == 0) {
            return new ResponseEntity<>("Su carrito  ya esta vacio", HttpStatus.FORBIDDEN);
        } else {
            carritoVipServicios.eliminarCarritoVip();
        }

        return new ResponseEntity<>("Se ha eliminado el carrito con exito", HttpStatus.OK);
    }
}
