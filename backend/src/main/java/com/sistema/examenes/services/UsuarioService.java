package com.sistema.examenes.services;

import java.util.Set;

import com.sistema.examenes.entity.Usuario;
import com.sistema.examenes.entity.UsuarioRol;

public interface UsuarioService {
    
    public Usuario guardarUsuario(Usuario usuario, Set <UsuarioRol> usuarioRoles)throws Exception;
}
