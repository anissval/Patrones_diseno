package org.sistemaSeguimientoPedidos;

public class EstadoPedidoEntregado implements EstadoPedido {
    private static EstadoPedidoEntregado instancia = new EstadoPedidoEntregado();

    private EstadoPedidoEntregado() {
    }

    public static EstadoPedidoEntregado getInstancia() {
        return instancia;
    }

    public void procesarPedido(SujetoPedido sujetoPedido) {
        // Lógica para procesar un pedido entregado
        System.out.println("El pedido ha sido entregado con éxito");
        sujetoPedido.cambiarEstado(EstadoPedidoEntregado.getInstancia());
    }

}
