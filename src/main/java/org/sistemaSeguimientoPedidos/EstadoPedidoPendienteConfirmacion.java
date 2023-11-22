package org.sistemaSeguimientoPedidos;

public class EstadoPedidoPendienteConfirmacion implements EstadoPedido {

    private static EstadoPedidoPendienteConfirmacion instancia = new EstadoPedidoPendienteConfirmacion();

    private EstadoPedidoPendienteConfirmacion() {
    }

    public static EstadoPedidoPendienteConfirmacion getInstancia() {
        return instancia;
    }

    public void procesarPedido(SujetoPedido sujetoPedido) {
        // Lógica para procesar un pedido en proceso
        System.out.println("El pedido está pendiente de confirmación");
        sujetoPedido.cambiarEstado(EstadoPedidoPendienteConfirmacion.getInstancia());
    }
}
