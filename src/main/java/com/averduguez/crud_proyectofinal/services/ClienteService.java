package com.averduguez.crud_proyectofinal.services;

import com.averduguez.crud_proyectofinal.models.Cliente;
import org.springframework.stereotype.Service;
import java.util.Optional;


public interface ClienteService {
    void guardar();
    Iterable<Cliente> listar();

    void eliminarPorId(Integer id);

    Optional<Cliente> buscarPorId(Integer id);

    void actualizarCliente(Cliente cliente);

    void guardar(Cliente cliente);

}