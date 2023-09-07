package com.averduguez.crud_proyectofinal.repositories;

import com.averduguez.crud_proyectofinal.models.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductoRepository extends CrudRepository<Producto,Integer> {


}