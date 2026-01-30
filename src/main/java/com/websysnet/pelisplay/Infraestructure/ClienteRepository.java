package com.websysnet.pelisplay.Infraestructure;

import java.util.List;

import com.websysnet.pelisplay.Domain.Cliente;
import com.websysnet.pelisplay.Domain.ICliente;
import org.springframework.stereotype.Repository;


@Repository
public class ClienteRepository implements ICliente {

    private List<Cliente> clientes = List.of(
            new Cliente(1, "Juan", "juan@example.com"),
            new Cliente(2, "María", "maria@example.com"),
            new Cliente(3, "Pedro", "pedro@example.com")
    );

    @Override
    public List<Cliente> getAllClientes() {
      return clientes;
    }
    @Override
    public Cliente getClienteById(Integer id) {
      return clientes.get(id - 1);
    }
}
