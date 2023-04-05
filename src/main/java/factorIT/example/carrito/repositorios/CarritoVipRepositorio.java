package factorIT.example.carrito.repositorios;

import factorIT.example.carrito.modelos.CarritoVip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CarritoVipRepositorio extends JpaRepository<CarritoVip, Long> {

}