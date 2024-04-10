package com.example.Store.repositorios;

import com.example.Store.modelos.Usuario;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface UsuarioRepositorio extends JpaRepository<Usuario,Integer> {
}
