package com.example.NutreApp.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.NutreApp.models.Usuario;

@Repository
public interface IUsuarioRepositorio extends JpaRepository<Usuario, UUID> {

    // Aquí puedes definir métodos de consulta personalizados

}
