package com.example.Store.servicios;

import com.example.Store.helpers.ValidacionMarca;
import com.example.Store.modelos.Marca;
import com.example.Store.modelos.TipoPrenda;
import com.example.Store.modelos.Usuario;
import com.example.Store.repositorios.MarcaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarcasServicios {
    @Autowired
    ValidacionMarca validacionMarca;
    MarcaRepositorio marcaRepositorio;
    public Marca guardarMarca() {
        return null;
    }
    public Marca buscarMarcaPorId(){
        return null;
    }
    public List<Marca> buscarTodaslasMarca(){
        return null;
    }
    public Marca mostrarMarca(){
        return null;
    }
    public boolean eliminarMarac(){
        return true;
    }
}
