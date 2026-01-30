package com.websysnet.pelisplay.Aplication;
import java.util.List;

import com.websysnet.pelisplay.Domain.Cliente;
import com.websysnet.pelisplay.Infraestructure.ClienteRepository;
import org.springframework.stereotype.Service;


@Service
public class ClienteService {
  private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public List<Cliente> getAllClientes() {
        return clienteRepository.getAllClientes();
    }

    public Cliente getClienteById(Integer id) {
        if(id == null || id <= 0) {
            throw new IllegalArgumentException("ID inválido");
        }
        else{

            Cliente cliente = clienteRepository.getClienteById(id);

            if(cliente == null){
                throw  new NullPointerException("No se ha encontrado un cliente con este id {id}");
            }
            return clienteRepository.getClienteById(id);
        }
        
    }   

}
