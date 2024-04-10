package com.example.Store.servicios;

import com.example.Store.helpers.ValidacionTipoPrenda;
import com.example.Store.modelos.TipoPrenda;
import com.example.Store.modelos.Usuario;
import com.example.Store.repositorios.TipoPrendaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service

public class TipoPrendaServicios {
    @Autowired
    ValidacionTipoPrenda validacionTipoPrenda;
    TipoPrendaRepositorio tipoPrendaRepositorio;

    public TipoPrenda guardarTipoPrenda() {
        return null;
    }
    public TipoPrenda buscarTipoPrendaPorId(){
        return null;
    }
    public List<TipoPrenda> buscarTodoslosTipoPrenda(){
        return null;
    }
    public TipoPrenda mostrarTipoPrenda(){
        return null;
    }
    public boolean eliminarTipoPrenda(){
        return true;
    }
}
