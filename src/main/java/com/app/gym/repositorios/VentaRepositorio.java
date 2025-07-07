package com.app.gym.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.gym.modelos.Venta;
import com.app.gym.modelos.VentaId;

public interface VentaRepositorio extends JpaRepository<Venta, VentaId> {
    // Aquí puedes agregar métodos personalizados si es necesario
    
}
