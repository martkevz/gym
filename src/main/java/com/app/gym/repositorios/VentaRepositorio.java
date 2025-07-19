package com.app.gym.repositorios;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.app.gym.modelos.Venta;
import com.app.gym.modelos.VentaId;

public interface VentaRepositorio extends JpaRepository<Venta, VentaId> {
    /**
     * Busca una venta por su ID y fecha.
     *
     * @param IdVenta el ID de la venta
     * @param fecha la fecha de la venta
     * @return un Optional que contiene la venta si se encuentra, o vacío si no
     */
    Optional<Venta> findByIdVentaAndFecha(Integer IdVenta, LocalDate fecha);
    
    /**
     * Busca todas las ventas realizadas en una fecha específica.
     *
     * @param fecha la fecha de las ventas
     * @return una lista de ventas realizadas en esa fecha
     */
    List<Venta> findByFecha(LocalDate fecha);

    /**
     * Busca todas las ventas realizadas en un rango de fechas.
     *
     * @param inicio la fecha de inicio del rango
     * @param fin la fecha de fin del rango
     * @return una lista de ventas realizadas en el rango de fechas
     */
    @Query("SELECT v FROM Venta v WHERE v.fecha BETWEEN :inicio AND :fin") // JPQL query para buscar ventas en un cierto rango de fechas
    List<Venta> findByRangoFechas (@Param("inicio") LocalDate inicio, @Param("fin")LocalDate fin);

    //nuevo
    @Query(value = "SELECT COALESCE(MAX(v.id_venta), 0) FROM ventas v WHERE v.fecha BETWEEN :inicio AND :fin", nativeQuery = true)
    Integer findMaxIdVentaByMonth(@Param("inicio") LocalDate inicio, @Param("fin") LocalDate fin);

    @Query(value = "SELECT COALESCE(MAX(v.id_venta), 0) FROM ventas v WHERE v.fecha BETWEEN :inicio AND :fin FOR UPDATE", nativeQuery = true)
    Integer findMaxIdVentaByMonthWithLock(@Param("inicio") LocalDate inicio, @Param("fin") LocalDate fin);
}
