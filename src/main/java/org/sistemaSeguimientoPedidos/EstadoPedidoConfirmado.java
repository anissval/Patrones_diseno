package org.sistemaSeguimientoPedidos;

public class EstadoPedidoConfirmado implements EstadoPedido {
    private static EstadoPedidoConfirmado instancia;

    private EstadoPedidoConfirmado() {
    }

    public static EstadoPedidoConfirmado getInstancia() {
        if (instancia == null) {
            instancia = new EstadoPedidoConfirmado();
        }
        return instancia;
    }

    @Override
    public void procesarPedido(Pedido pedido) {
        System.out.println("El pedido" + pedido.getId() + "ha sido confirmado y está pendiente de procesamiento");

    }
}