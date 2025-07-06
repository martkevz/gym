package com.app.gym.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.gym.modelos.HorariosPorDia;

public interface HorariosPorDiaRepositorio extends JpaRepository<HorariosPorDia, Integer>{
    
}
