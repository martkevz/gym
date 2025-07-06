package com.app.gym.repositorios;
import org.springframework.data.jpa.repository.JpaRepository;
import com.app.gym.modelos.Membresias;

public interface MembresiaRepositorio extends JpaRepository<Membresias, Integer> {
    // Aquí se pueden agregar métodos personalizados si es necesario
}
