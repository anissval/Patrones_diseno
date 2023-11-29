package org.sistemaSeguimientoPedidos;

public class EstadoPedidoCancelado implements EstadoPedido {
    private static EstadoPedidoCancelado instancia;

    private EstadoPedidoCancelado() {
    }

    public static EstadoPedidoCancelado getInstancia() {
        if (instancia == null) {
            instancia = new EstadoPedidoCancelado();
        }
        return instancia;
    }

    public void procesarPedido(Pedido pedido) {
        System.out.println("El pedido " + pedido.getId() + " ha sido cancelado");
    }

}