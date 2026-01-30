package com.websysnet.pelisplay.Controllers;

import com.websysnet.pelisplay.Domain.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import com.websysnet.pelisplay.Aplication.ClienteService;

@RestController
public class ClienteController {

    private final ClienteService clienteService;

    
    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping("/clientes")
    public List<Cliente> getClientes() {
        return clienteService.getAllClientes();
    }


    @GetMapping("/cliente/{id}")
    public Cliente GetCLiente(@PathVariable Integer id) {

        return clienteService.getClienteById(id);

    }
}
