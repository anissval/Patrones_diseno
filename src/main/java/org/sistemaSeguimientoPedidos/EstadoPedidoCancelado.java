package org.sistemaSeguimientoPedidos;

public class EstadoPedidoCancelado implements EstadoPedido {
    private static EstadoPedidoCancelado instancia = new EstadoPedidoCancelado();

    private EstadoPedidoCancelado() {
    }

    public static EstadoPedidoCancelado getInstancia() {
        return instancia;
    }

    public void procesarPedido(SujetoPedido sujetoPedido) {
        // Lógica para procesar un pedido en proceso
        System.out.println("El pedido ha sido cancelado");
        sujetoPedido.cambiarEstado(EstadoPedidoEntregado.getInstancia());
    }
}