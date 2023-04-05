package factorIT.example.carrito.servicios;

import factorIT.example.carrito.DTO.CarritoDTO;
import factorIT.example.carrito.DTO.CarritoVipDTO;
import factorIT.example.carrito.DTO.ProductosDTO;
import factorIT.example.carrito.modelos.CarritoVip;
import factorIT.example.carrito.modelos.Productos;

import java.util.List;

public interface ProductosServicios {
    public List<ProductosDTO> obtenerListaProductos();

    public void eliminarProducto(Productos productos);

    public void guardarProducto(Productos productos);

    public Productos BuscarProductoPorId(long id);

}
