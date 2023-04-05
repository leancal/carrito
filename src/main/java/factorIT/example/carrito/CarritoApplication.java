package factorIT.example.carrito;

import factorIT.example.carrito.modelos.Cliente;
import factorIT.example.carrito.modelos.Productos;
import factorIT.example.carrito.repositorios.ClienteRepositorio;
import factorIT.example.carrito.repositorios.ProductosRepositorio;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class CarritoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarritoApplication.class, args);
	}

	@Bean
	public CommandLineRunner initData(ClienteRepositorio clienteRepositorio, ProductosRepositorio productosRepositorio){

		return(args)-> {

			Cliente cliente1 = new Cliente("Enzo", "Estecho", "EnzoEstecho7@gmail.com", "Estecho");

			Cliente cliente2 = new Cliente("Guillermo", "Bonnuto", "Bonutto7@gmail.com", "Bonutto");

			clienteRepositorio.save(cliente1);
			clienteRepositorio.save(cliente2);

			Productos camara1= new Productos("camara1", "Esta es la camara 1", 1000, 10, "http://localhost:8080/web/src/img/camara1.jpeg", LocalDate.now());
			Productos camara2= new Productos("camara2", "Esta es la camara 2", 1200, 20, "http://localhost:8080/web/assets/camara2.jpg", LocalDate.now());
			Productos camara3= new Productos("camara3", "Esta es la camara 3", 1500, 15, "http://localhost:8080/web/assets/camara3.jpg", LocalDate.now().plusDays(2));
			Productos camara4= new Productos("camara4", "Esta es la camara 4", 1800, 10, "http://localhost:8080/web/assets/camara4.jpg", LocalDate.now().plusDays(3));
			Productos camara5= new Productos("camara5", "Esta es la camara 5", 1300, 11, "http://localhost:8080/web/assets/camara5.jpg", LocalDate.now());
			Productos camara6= new Productos("camara6", "Esta es la camara 6", 2200, 18, "http://localhost:8080/web/assets/camara6.jpeg", LocalDate.now());
			Productos camara7= new Productos("camara7", "Esta es la camara 7", 1900, 15, "http://localhost:8080/web/assets/camara7.jpg", LocalDate.now().plusDays(5));
			Productos camara8= new Productos("camara8", "Esta es la camara 8", 1100, 13, "http://localhost:8080/web/assets/camara8.jpeg", LocalDate.now().plusDays(1));
			Productos camara9= new Productos("camara9", "Esta es la camara 9", 2000, 22, "http://localhost:8080/web/assets/camara9.webp", LocalDate.now());
			Productos camara10= new Productos("camara10", "Esta es la camara 10", 2500, 32, "http://localhost:8080/web/assets/camara10.jpg", LocalDate.now());


			productosRepositorio.save(camara1);
			productosRepositorio.save(camara2);
			productosRepositorio.save(camara3);
			productosRepositorio.save(camara4);
			productosRepositorio.save(camara5);
			productosRepositorio.save(camara6);
			productosRepositorio.save(camara7);
			productosRepositorio.save(camara8);
			productosRepositorio.save(camara9);
			productosRepositorio.save(camara10);


		};
	}

}
