package com.example.Store.servicios;

import com.example.Store.helpers.ValidacionPedido;
import com.example.Store.modelos.Pedido;
import com.example.Store.modelos.TipoPrenda;
import com.example.Store.modelos.Usuario;
import com.example.Store.repositorios.PedidoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoServicios {
    @Autowired
    ValidacionPedido validacionPedido;
    PedidoRepositorio  pedidoRepositorio;
    public Pedido guardarPedido() {
        return null;
    }
    public Pedido buscarPedidoPorId(){
        return null;
    }
    public List<Pedido> buscarTodoslosPedidos(){
        return null;
    }
    public Pedido mostrarPedido(){
        return null;
    }
    public boolean eliminarPedido(){
        return true;
    }
}
