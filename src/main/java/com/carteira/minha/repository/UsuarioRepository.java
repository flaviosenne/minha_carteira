package com.carteira.minha.repository;

import com.carteira.minha.model.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
    boolean existsByEmail(String email);
}
