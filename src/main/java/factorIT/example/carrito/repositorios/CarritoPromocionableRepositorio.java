package factorIT.example.carrito.repositorios;
import factorIT.example.carrito.modelos.CarritoPromocionable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CarritoPromocionableRepositorio extends JpaRepository<CarritoPromocionable, Long> {
}



