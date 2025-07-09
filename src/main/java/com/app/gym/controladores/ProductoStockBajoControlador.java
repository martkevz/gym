package com.app.gym.controladores;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.gym.modelos.ProductoStockBajo;
import com.app.gym.servicios.ProductoStockBajoServicio;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api/productos-stock-bajo")
public class ProductoStockBajoControlador {
    
    private final ProductoStockBajoServicio productoStockBajoServicio;

    public ProductoStockBajoControlador(ProductoStockBajoServicio productoStockBajoServicio) {
        this.productoStockBajoServicio = productoStockBajoServicio;
    }

    /**
     * Obtiene una lista de productos cuyo stock es igual o menor a 10 unidades.
     * 
     * @return Lista de productos con stock bajo.
     */
    @GetMapping
    public ResponseEntity<List<ProductoStockBajo>> listarProductosStockBajo(){
        List<ProductoStockBajo> productos = productoStockBajoServicio.obtenerProductosStockBajo();

        if(productos.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        } else {
            return ResponseEntity.ok(productos);
        }
    }
}
