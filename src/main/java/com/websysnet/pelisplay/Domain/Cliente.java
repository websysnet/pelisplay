package com.websysnet.pelisplay.Domain;

public class Cliente {

    private Integer Id;
    private String Nombre;
    private String Email;

    public Cliente(Integer id, String nombre, String email) {
        this.Id =id;
        this.Nombre =nombre;
        this.Email = email;
    }

    public Integer getId(){
        return this.Id;
    }
    public String getNombre(){
        return this.Nombre;
    }

    public String getEmail(){
        return this.Email;
    }

    public void setNombre(String nombre){
        this.Nombre=nombre;
    }
    public void setId(Integer id){
        this.Id=id;
    }
    public void setEmail(String email){
        this.Email=email;
    }

}
