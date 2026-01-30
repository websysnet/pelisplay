package com.websysnet.pelisplay.Domain;
import java.util.List;


public interface ICliente {
    public List<Cliente> getAllClientes();
    public Cliente getClienteById(Integer id);
}
