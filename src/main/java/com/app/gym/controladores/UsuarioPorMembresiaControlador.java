package com.app.gym.controladores;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.gym.modelos.UsuarioPorMembresia;
import com.app.gym.servicios.UsuarioPorMembresiaServicio;

@RestController
@RequestMapping("/api/usuarios-membresias")
public class UsuarioPorMembresiaControlador {
    
    private final UsuarioPorMembresiaServicio servicio;

    /**
     * Constructor que inyecta el servicio de Usuarios por Membresía.
     *
     * @param servicio instancia de UsuarioPorMembresiaServicio
     */
    public UsuarioPorMembresiaControlador(UsuarioPorMembresiaServicio servicio) {
        this.servicio = servicio;
    }

    /**
     * Endpoint GET /api/usuarios-por-membresia
     *
     * @return resumen de usuarios agrupado por membresía
     */
    @GetMapping
    public List<UsuarioPorMembresia> listarUsuariosPorMembresias (){
        return servicio.obtenerUsuariosPorMembresias();
    }
}