package org.sistemaSeguimientoPedidos;

public class EstadoPedidoPendiente implements EstadoPedido {
    private static EstadoPedidoPendiente instancia = new EstadoPedidoPendiente();

    private EstadoPedidoPendiente() {
    }

    public static EstadoPedidoPendiente getInstancia() {
        return instancia;
    }

    public void procesarPedido(SujetoPedido sujetoPedido) {
        // Lógica para procesar un pedido pendiente
        System.out.println("El pedido está pendiente de procesamiento");
        sujetoPedido.cambiarEstado(EstadoPedidoEnProceso.getInstancia());
    }
}

