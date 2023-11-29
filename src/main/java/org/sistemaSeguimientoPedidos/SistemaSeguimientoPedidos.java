package org.sistemaSeguimientoPedidos;

import java.util.HashMap;
import java.util.Map;

public class SistemaSeguimientoPedidos {
    private static SistemaSeguimientoPedidos instancia;
    private Map<String, Pedido> pedidos = new HashMap<>();

    private SistemaSeguimientoPedidos() {
    }

    public static SistemaSeguimientoPedidos getInstancia() {
        if (instancia == null) {
            instancia = new SistemaSeguimientoPedidos();
        }
        return instancia;
    }

    public Pedido realizarNuevoPedido(PedidoManager pedidoManager) {
        Pedido pedido = new Pedido();
        System.out.println("----- Nuevo pedido realizado -----");
        EstadoPedido estadoInicial = EstadoPedidoPendienteConfirmacion.getInstancia();
        pedido.setEstadoPedido(estadoInicial);
        pedidoManager.notificarObservadores(pedido, estadoInicial);
        pedidos.put(pedido.getId(), pedido);
        return pedido;
    }

    public void consultarEstadoPedido(String pedidoID) {
        // Lógica para consultar el estado del pedido
        if (pedidos.containsKey(pedidoID)) {
            Pedido pedido = pedidos.get(pedidoID);
            System.out.println("----- Estado actual del pedido: " + pedido.getEstadoPedido().getClass().getSimpleName());
        } else {
            System.out.println("---- Pedido no encontrado");
        }
    }

    public void cancelarPedido(Pedido pedido) {
        // Lógica para cancelar un pedido
        if (pedidos.containsKey(pedido.getId())) {
            EstadoPedido estadoCancelado = EstadoPedidoCancelado.getInstancia();
            pedidos.remove(pedido.getId());
            System.out.println("----- Pedido cancelado");
            PedidoManager.getInstancia().notificarObservadores(pedido, estadoCancelado);
        } else {
            System.out.println("----- Pedido no encontrado");
        }
    }

    public void modificarEstadoPedido(Pedido pedido, EstadoPedido nuevoEstado) {
        if (pedidos.containsKey(pedido.getId())) {
            pedido.setEstadoPedido(nuevoEstado);
            PedidoManager.getInstancia().notificarObservadores(pedido, nuevoEstado);
        } else {
            System.out.println("----- Pedido no encontrado");
        }
    }
}

