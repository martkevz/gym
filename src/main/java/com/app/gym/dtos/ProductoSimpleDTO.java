package com.app.gym.dtos;

import java.math.BigDecimal;

public class ProductoSimpleDTO {
    
    private Integer idProducto;
    private String nombre;
    private BigDecimal precio;

    // Getters y Setters
    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) { 
        this.precio = precio;
    }   
}
