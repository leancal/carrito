package factorIT.example.carrito.controladores;
import factorIT.example.carrito.DTO.CarritoPromocionableDTO;
import factorIT.example.carrito.servicios.CarritoPromocionableServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/api")
public class CarritoPromocionableControlador {


    @Autowired
    CarritoPromocionableServicios carritoPromocionableServicios;

    @GetMapping("/carritoPromocionable")
    public List<CarritoPromocionableDTO> obtenerListaCarritoPromocionableDTO() {
        return carritoPromocionableServicios.obtenerListaCarritoPromocionable();
    }

    @DeleteMapping("/eliminarCarritoPromocionable")
    public ResponseEntity<Object> eliminarCarritoPromocionable() {

        List<CarritoPromocionableDTO> carritoPromocionableDTO = carritoPromocionableServicios.obtenerListaCarritoPromocionable();

        if (carritoPromocionableDTO.size() == 0) {
            return new ResponseEntity<>("Su carrito promocionable ya esta vacio", HttpStatus.FORBIDDEN);
        } else {

          carritoPromocionableServicios.eliminarCarritoPromocionable();
        }

        return new ResponseEntity<>("Se ha eliminado el carrito con exito", HttpStatus.OK);
    }


}
