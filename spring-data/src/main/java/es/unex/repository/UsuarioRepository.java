package es.unex.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import es.unex.model.Usuario;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Long> {
	
	//Encontrar los a aquellos cuyos nombres empiezan por una letra
	@Query("SELECT u FROM Usuario u WHERE u.nombre LIKE CONCAT(:letra, '%')")
    List<Usuario> findByNombreStartingWith(@Param("letra") String letra);

}
