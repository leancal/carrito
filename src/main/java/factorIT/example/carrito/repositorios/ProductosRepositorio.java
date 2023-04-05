package factorIT.example.carrito.repositorios;


import factorIT.example.carrito.modelos.Productos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ProductosRepositorio extends JpaRepository<Productos, Long> {

}


