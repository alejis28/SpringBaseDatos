package com.example.Store.servicios;

import com.example.Store.helpers.ValidacionProducto;
import com.example.Store.modelos.Producto;
import com.example.Store.modelos.TipoPrenda;
import com.example.Store.modelos.Usuario;
import com.example.Store.repositorios.ProductoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServicios {
    @Autowired
    ValidacionProducto validacionProducto;
    ProductoRepositorio productoRepositorio;
    public Producto guardarProducto() {
        return null;
    }
    public Producto buscarProductoPorId(){
        return null;
    }
    public List<Producto> buscarTodoslosProducto(){
        return null;
    }
    public Producto mostrarProducto(){
        return null;
    }
    public boolean eliminarProducto(){
        return true;
    }
}
