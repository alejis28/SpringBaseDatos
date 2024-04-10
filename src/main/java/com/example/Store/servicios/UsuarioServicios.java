package com.example.Store.servicios;

import com.example.Store.helpers.ValidacionUsuario;
import com.example.Store.modelos.Usuario;
import com.example.Store.repositorios.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServicios {
    //en los servicios debo inyectar las dependencias de las validaciones,las consultas y repocitorios
    @Autowired
    ValidacionUsuario validacionUsuario;
    UsuarioRepositorio usuarioRepositorio;

    //en el servicio se crea un metodo para cada una de las consultas a realizar en BD

    //metodos

    //guardar usuario
    public Usuario guardarUsuario(){
        return null;
    }
    //consultar usuario en BD por id
    public Usuario buscarUsuarioPorId(){
        return null;
    }
    //consultar todos los usuarios
    public List<Usuario> buscarTodosLosUsuariaos(){
        return null;
    }
    //mostar un usuario
    public Usuario mostrarUsuario(){
        return null;
    }
    //eliminar un usuario
    public boolean eliminarUsuario(){
        return true;
    }

}
