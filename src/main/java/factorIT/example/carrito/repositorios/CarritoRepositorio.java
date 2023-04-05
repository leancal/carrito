package factorIT.example.carrito.repositorios;
import factorIT.example.carrito.modelos.Carrito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CarritoRepositorio extends JpaRepository<Carrito, Long> {

}



