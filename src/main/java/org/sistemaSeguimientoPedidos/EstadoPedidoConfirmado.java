package org.sistemaSeguimientoPedidos;

public class EstadoPedidoConfirmado implements EstadoPedido {
    private static EstadoPedidoConfirmado instancia = new EstadoPedidoConfirmado();

    private EstadoPedidoConfirmado() {
    }

    public static EstadoPedidoConfirmado getInstancia() {
        return instancia;
    }

    public void procesarPedido(SujetoPedido sujetoPedido) {
        // Lógica para procesar un pedido en proceso
        System.out.println("El pedido ha sido confirmado y está pendiente de procesamiento");
        sujetoPedido.cambiarEstado(EstadoPedidoEntregado.getInstancia());
    }
}