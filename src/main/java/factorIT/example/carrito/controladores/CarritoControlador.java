package factorIT.example.carrito.controladores;
import factorIT.example.carrito.DTO.CarritoDTO;
import factorIT.example.carrito.servicios.CarritoServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/api")
public class CarritoControlador {


    @Autowired
    CarritoServicios carritoServicios;



    @GetMapping("/carrito")
    public List<CarritoDTO> obtenerListaCarritoDTO() {
        return carritoServicios.obtenerListaCarrito();
    }

    @DeleteMapping("/eliminarCarrito")
    public ResponseEntity<Object> eliminarCarrito() {

        List<CarritoDTO> carritoDTO = carritoServicios.obtenerListaCarrito();
        if (carritoDTO.size() == 0) {
            return new ResponseEntity<>("Su carrito  ya esta vacio", HttpStatus.FORBIDDEN);
        } else {
            carritoServicios.eliminarCarrito();
        }

        return new ResponseEntity<>("Se ha eliminado el carrito con exito", HttpStatus.OK);
    }


}


