package org.sistemaSeguimientoPedidos;

public class EstadoPedidoPendienteConfirmacion implements EstadoPedido {

    private static EstadoPedidoPendienteConfirmacion instancia;

    private EstadoPedidoPendienteConfirmacion() {
    }

    public static EstadoPedidoPendienteConfirmacion getInstancia() {
        if (instancia == null) {
            instancia = new EstadoPedidoPendienteConfirmacion();
        }
        return instancia;
    }

    @Override
    public void procesarPedido(Pedido pedido) {
        System.out.println("El pedido " + pedido.getId() + " está pendiente de confirmación");
    }
}
