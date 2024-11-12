package es.unex;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.github.javafaker.Faker;

import es.unex.model.Usuario;
import es.unex.repository.UsuarioRepository;

@SpringBootTest
class SpringDataApplicationTests {
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	@Test
	void testCrudRepository() {
		Faker faker=new Faker();
		int numUsuarios=20;
		
		for(int i=0;i<numUsuarios;i++) {
			usuarioRepository.save(new Usuario(faker.name().firstName(),faker.internet().emailAddress()));
		}
		
		Iterable<Usuario> listaUsuarios=usuarioRepository.findByNombreStartingWith("A");
		for(Usuario u:listaUsuarios) {
			System.out.println(u.toString());
		}
		
	}

}
