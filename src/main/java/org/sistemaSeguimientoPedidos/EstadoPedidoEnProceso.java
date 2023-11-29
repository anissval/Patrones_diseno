package org.sistemaSeguimientoPedidos;

public class EstadoPedidoEnProceso implements EstadoPedido {
    private static EstadoPedidoEnProceso instancia;

    private EstadoPedidoEnProceso() {
    }

    public static EstadoPedidoEnProceso getInstancia() {
        if (instancia == null) {
            instancia = new EstadoPedidoEnProceso();
        }
        return instancia;
    }

    @Override
    public void procesarPedido(Pedido pedido) {
        System.out.println("El pedido " + pedido.getId() + " está en proceso de preparación");
    }
}
