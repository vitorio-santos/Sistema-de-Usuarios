package com.VitorioSantos.api_usuario.business;

import com.VitorioSantos.api_usuario.infrastructure.entities.Usuario;
import com.VitorioSantos.api_usuario.infrastructure.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario salvaUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public List<Usuario> buscarUsuarios() {
        return usuarioRepository.findAll();
    }
    public Usuario atualizarUsuario(Usuario usuario){
        Optional<Usuario> usuarioExiste = usuarioRepository.findById(usuario.getId());

        if(usuarioExiste.isPresent()){
           return usuarioRepository.save(usuario);
        }
        return new Usuario();

    }

    public void deletarUsuario(String id){
        usuarioRepository.deleteById(id);
    }
}

