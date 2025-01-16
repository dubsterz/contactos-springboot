package com.dubs.Contactos.servicio;

import com.dubs.Contactos.modelo.Contacto;

import java.util.List;

public interface IContactoServicio {

    public List<Contacto> listarContactos();
    public Contacto buscarContactoPorID(Integer idContacto);
    public void guardarContacto(Contacto contacto);
    public void eliminarContacto(Contacto contacto);

}
