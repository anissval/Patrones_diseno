package org.sistemaSeguimientoPedidos;

public class EstadoPedidoEnTransito implements EstadoPedido {
    private static EstadoPedidoEnTransito instancia;

    private EstadoPedidoEnTransito() {
    }

    public static EstadoPedidoEnTransito getInstancia() {
        if (instancia == null) {
            instancia = new EstadoPedidoEnTransito();
        }
        return instancia;
    }

    @Override
    public void procesarPedido(Pedido pedido) {
        System.out.println("El pedido " + pedido.getId() + " está en camino hacia la dirección de entrega");
    }
}