package com.Parcial3.repositories;

import com.Parcial3.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}
