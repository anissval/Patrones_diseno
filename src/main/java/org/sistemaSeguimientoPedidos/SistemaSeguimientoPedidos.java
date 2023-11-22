package org.sistemaSeguimientoPedidos;

import java.util.HashMap;
import java.util.Map;

public class SistemaSeguimientoPedidos {
    private static SistemaSeguimientoPedidos instancia = new SistemaSeguimientoPedidos();
    private Map<SujetoPedido, EstadoPedido> pedidos = new HashMap<>();

    private SistemaSeguimientoPedidos() {
    }

    public static SistemaSeguimientoPedidos getInstancia() {
        return instancia;
    }

    public void realizarNuevoPedido(SujetoPedido sujetoPedido) {
        // Lógica para realizar un nuevo pedido (por ejemplo, establecer estado inicial)
        EstadoPedido estadoInicial = EstadoPedidoPendienteConfirmacion.getInstancia();
        sujetoPedido.cambiarEstado(estadoInicial);
        pedidos.put(sujetoPedido, estadoInicial);
        System.out.println("Nuevo pedido realizado");
    }

    public void consultarEstadoPedido(SujetoPedido sujetoPedido) {
        // Lógica para consultar el estado del pedido
        if (pedidos.containsKey(sujetoPedido)) {
            EstadoPedido estadoActual = pedidos.get(sujetoPedido);
            System.out.println("Estado actual del pedido: " + estadoActual.getClass().getSimpleName());
        } else {
            System.out.println("Pedido no encontrado");
        }
    }

    public void cancelarPedido(SujetoPedido sujetoPedido) {
        // Lógica para cancelar un pedido
        if (pedidos.containsKey(sujetoPedido)) {
            sujetoPedido.cambiarEstado(EstadoPedidoCancelado.getInstancia());
            pedidos.remove(sujetoPedido);
            System.out.println("Pedido cancelado");
        } else {
            System.out.println("Pedido no encontrado");
        }
    }
}

