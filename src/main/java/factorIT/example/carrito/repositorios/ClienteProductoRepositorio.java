package factorIT.example.carrito.repositorios;
import factorIT.example.carrito.modelos.ClienteProducto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ClienteProductoRepositorio extends JpaRepository <ClienteProducto, Long> {

}


