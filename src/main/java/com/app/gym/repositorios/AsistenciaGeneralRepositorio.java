package com.app.gym.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.gym.modelos.AsistenciaGeneral;
import com.app.gym.modelos.AsistenciaId;

public interface AsistenciaGeneralRepositorio extends JpaRepository<AsistenciaGeneral, AsistenciaId> {

    /**
     * Interfaz que extiende JpaRepository para manejar operaciones CRUD
     * sobre la entidad AsistenciaGeneral.
     * Utiliza una clave primaria compuesta definida por la clase AsistenciaId.
     */
    
}