package org.sistemaSeguimientoPedidos;

public class EstadoPedidoEnProceso implements EstadoPedido {
    private static EstadoPedidoEnProceso instancia = new EstadoPedidoEnProceso();

    private EstadoPedidoEnProceso() {
    }

    public static EstadoPedidoEnProceso getInstancia() {
        return instancia;
    }

    public void procesarPedido(SujetoPedido sujetoPedido) {
        // Lógica para procesar un pedido en proceso
        System.out.println("El pedido está en proceso de preparación");
        sujetoPedido.cambiarEstado(EstadoPedidoEntregado.getInstancia());
    }
}
