package factorIT.example.carrito.controladores;


import factorIT.example.carrito.DTO.CarritoDTO;
import factorIT.example.carrito.DTO.CarritoPromocionableDTO;
import factorIT.example.carrito.DTO.ProductosDTO;
import factorIT.example.carrito.modelos.Carrito;
import factorIT.example.carrito.modelos.CarritoPromocionable;
import factorIT.example.carrito.modelos.CarritoVip;
import factorIT.example.carrito.modelos.Productos;
import factorIT.example.carrito.repositorios.CarritoPromocionableRepositorio;
import factorIT.example.carrito.repositorios.CarritoRepositorio;
import factorIT.example.carrito.repositorios.CarritoVipRepositorio;
import factorIT.example.carrito.repositorios.ProductosRepositorio;
import factorIT.example.carrito.servicios.CarritoPromocionableServicios;
import factorIT.example.carrito.servicios.CarritoServicios;
import factorIT.example.carrito.servicios.CarritoVipServicios;
import factorIT.example.carrito.servicios.ProductosServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class ProductosControlador {



    @Autowired
    ProductosServicios productosServicios;

    @Autowired
    CarritoServicios carritoServicios;

    @Autowired CarritoVipServicios carritoVipServicios;

    @Autowired
    CarritoPromocionableServicios carritoPromocionableServicios;


    @GetMapping("/productos")
    @CrossOrigin(origins ="*")
    public List<ProductosDTO> obetenerListaProductos() {
        return productosServicios.obtenerListaProductos();
    }

    @PatchMapping("/compra/{id}")
    public ResponseEntity<Object> compraProducto(@PathVariable Long id, @RequestParam int cantidad) {

        Productos productos = productosServicios.BuscarProductoPorId(id);
        List<CarritoDTO> carritoDTO = carritoServicios.obtenerListaCarrito();
        List<CarritoPromocionableDTO> carritoPromocionableDTO = carritoPromocionableServicios.obtenerListaCarritoPromocionable();

        if (productos.getStock() != 0) {
            productos.setStock(productos.getStock() - cantidad);
            productosServicios.guardarProducto(productos);
        }else {
            return new ResponseEntity<>("ya no hay stock", HttpStatus.CREATED);
        }

        if (productos.getFechaEspecial().equals(LocalDate.now())) {
            CarritoPromocionable carritoPromocionable = new CarritoPromocionable(productos.getNombre(), cantidad, productos.getPrecio());
            carritoPromocionableServicios.guardarCarritoPromocionable(carritoPromocionable);

        } else {
            Carrito carrito = new Carrito(productos.getNombre(), cantidad, productos.getPrecio());
            carritoServicios.guardarCarrito(carrito);
        }

        double precioTotalCarrito = 0;
        for (int i = 0; i < carritoDTO.size(); i++) {
            precioTotalCarrito += carritoDTO.get(i).getPrecio();
        }

        for (int j = 0; j < carritoPromocionableDTO.size(); j++) {
            precioTotalCarrito +=  carritoPromocionableDTO.get(j).getPrecio();
        }

        if (precioTotalCarrito > 10000){

            for (int i = 0; i < carritoDTO.size(); i++) {
                CarritoVip carritoVip = new CarritoVip(carritoDTO.get(i).getNombreProductoAgregado(), carritoDTO.get(i).getCantidadLlevada(), carritoDTO.get(i).getPrecio());
                carritoVipServicios.guardarCarritoVip(carritoVip);
            }

            for (int i = 0; i < carritoPromocionableDTO.size(); i++) {
                CarritoVip carritoVip = new CarritoVip(carritoPromocionableDTO.get(i).getNombreProductoAgregado(), carritoPromocionableDTO.get(i).getCantidadLlevada(), carritoPromocionableDTO.get(i).getPrecio());
                carritoVipServicios.guardarCarritoVip(carritoVip);
            }
            carritoServicios.eliminarCarrito();
            carritoPromocionableServicios.eliminarCarritoPromocionable();
        }


        return new ResponseEntity<>("agregado a carrito con exito", HttpStatus.CREATED);

    }

    @DeleteMapping("/EliminarProducto/{id}")
    public ResponseEntity<Object> eliminarProducto(@PathVariable Long id) {
        Productos productos = productosServicios.BuscarProductoPorId(id);
        if (productos == null) {
            return new ResponseEntity<>("No se encontró el producto seleccionado", HttpStatus.FORBIDDEN);
        }
        productosServicios.eliminarProducto(productos);

        return new ResponseEntity<>("El producto se ha eliminado con exito", HttpStatus.OK);


    }





}
