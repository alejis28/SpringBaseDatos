package com.example.Store.servicios;

import com.example.Store.helpers.ValidacionDetalle;
import com.example.Store.modelos.Detalle;
import com.example.Store.modelos.TipoPrenda;
import com.example.Store.modelos.Usuario;
import com.example.Store.repositorios.DetalleRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class DetalleServicios {
    @Autowired
    ValidacionDetalle validacionDetalle;
    DetalleRepositorio detalleRepositorio;
    public Detalle guardarDetalle() {
        return null;
    }
    public Detalle buscarDetallePorId(){
        return null;
    }
    public List<Detalle> buscarTodoslosDetalle(){
        return null;
    }
    public Detalle mostrarDetaslle(){
        return null;
    }
    public boolean eliminarDetalle(){
        return true;
    }
}
