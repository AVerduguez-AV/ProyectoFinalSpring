package com.averduguez.crud_proyectofinal.services;

import com.averduguez.crud_proyectofinal.models.Producto;
import org.springframework.stereotype.Service;
import java.util.Optional;


public interface ProductoService {
    void guardar();
    Iterable<Producto> listar();

    void eliminarPorId(Integer id);

    Optional<Producto> buscarPorId(Integer id);

    void actualizarProducto(Producto producto);

    Boolean actualizarPrecioProducto(Integer idProducto, Double precioActualizado);

    void guardar(Producto producto);
}