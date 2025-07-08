package com.app.gym.controladores;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.app.gym.modelos.UsuarioActivo;
import com.app.gym.servicios.UsuarioActivoServicio;

/**
 * Controlador REST para exponer endpoints relacionados con Usuarios Activos.
 * Define rutas para listar todos, activos y vencidos.
 */
@RestController
@RequestMapping("/api/usuarios-activos")
public class UsuarioActivoControlador {
    private final UsuarioActivoServicio svc;

    /**
     * Constructor que inyecta el servicio de Usuarios Activos.
     *
     * @param svc instancia de UsuarioActivoService
     */
    public UsuarioActivoControlador(UsuarioActivoServicio svc) {
        this.svc = svc;
    }

    /**
     * Endpoint GET /api/usuarios-activos
     *
     * @return lista de todos los usuarios (activos y vencidos)
     */
    @GetMapping
    public List<UsuarioActivo> listarTodos() {
        return svc.todos();
    }

    /**
     * Endpoint GET /api/usuarios-activos/activos
     *
     * @return lista de usuarios con membresía activa
     */
    @GetMapping("/activos")
    public List<UsuarioActivo> listarActivos() {
        return svc.activos();
    }

    /**
     * Endpoint GET /api/usuarios-activos/vencidos
     *
     * @return lista de usuarios con membresía vencida
     */
    @GetMapping("/vencidos")
    public List<UsuarioActivo> listarVencidos() {
        return svc.vencidos();
    }
}
