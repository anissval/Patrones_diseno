package org.sistemaSeguimientoPedidos;

public class EstadoPedidoEntregado implements EstadoPedido {
    private static EstadoPedidoEntregado instancia;

    private EstadoPedidoEntregado() {
    }

    public static EstadoPedidoEntregado getInstancia() {
        if (instancia == null) {
            instancia = new EstadoPedidoEntregado();
        }
        return instancia;
    }

    @Override
    public void procesarPedido(Pedido pedido) {
        System.out.println("El pedido " + pedido.getId() + " ha sido entregado con éxito");
    }
}
