package es.unex.service;

import org.springframework.stereotype.Service;

import es.unex.model.Usuario;
import es.unex.repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	private final UsuarioRepository usuarioRepository;

	public UsuarioServiceImpl(UsuarioRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	}
	
	@Override
	public Usuario crearUsuario(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
}
