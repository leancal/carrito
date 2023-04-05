package factorIT.example.carrito.servicios.implementaciones;

import factorIT.example.carrito.DTO.ClienteDTO;
import factorIT.example.carrito.DTO.ProductosDTO;
import factorIT.example.carrito.modelos.CarritoVip;
import factorIT.example.carrito.modelos.Productos;
import factorIT.example.carrito.repositorios.ProductosRepositorio;
import factorIT.example.carrito.servicios.ProductosServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductosServicioImplementacion implements ProductosServicios {
    @Autowired
    ProductosRepositorio productosRepositorio;

    @Override
    public List<ProductosDTO> obtenerListaProductos() {
        return productosRepositorio.findAll().stream().map(ProductosDTO::new).collect(Collectors.toList());
    }

    @Override
    public void eliminarProducto(Productos productos) {
        productosRepositorio.delete(productos);
    }

    @Override
    public void guardarProducto(Productos productos) {
        productosRepositorio.save(productos);
    }

    @Override
    public Productos BuscarProductoPorId(long id) {
        return productosRepositorio.findById(id).orElse(null);
    }

}
