package com.example.NutreApp.repositories;

import java.util.List;
import java.util.UUID;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.NutreApp.models.Usuario;

@Repository
public interface IUsuarioRepositorio extends JpaRepository<Usuario, UUID> {
    //Consulta prefabricada para buscar un usuario asociado a un departamento y un rol específico
    //Usuario findByDepartamentoAndRol(String departamento, String rol);

    List<Usuario> findByDepartamentoAndRol(String departamento, String rol);

    Optional<Usuario> findByCorreo(String correo);

    List<Usuario> findByRolOrderByNombreAsc(String rol);

    Boolean extistsByCorreo(String correo);
}