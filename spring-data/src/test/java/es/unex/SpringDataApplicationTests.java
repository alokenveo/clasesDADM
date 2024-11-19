package es.unex;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import es.unex.model.Usuario;
import es.unex.repository.UsuarioRepository;

@SpringBootTest
class SpringDataApplicationTests {
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	@Test
	void testCrudRepository() {
		Usuario u1=new Usuario("Alfredo","fredy@gmail.com");
		Usuario u2=new Usuario("Juan","pedro@gmail.com");
		Usuario u3=new Usuario("Pedro","juan@gmail.com");
		
		
		
	}

}
