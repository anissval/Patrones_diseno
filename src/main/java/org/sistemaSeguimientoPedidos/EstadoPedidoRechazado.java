package org.sistemaSeguimientoPedidos;

public class EstadoPedidoRechazado implements EstadoPedido {

    private static EstadoPedidoRechazado instancia = new EstadoPedidoRechazado();

    private EstadoPedidoRechazado() {
    }

    public static EstadoPedidoRechazado getInstancia() {
        return instancia;
    }

    public void procesarPedido(SujetoPedido sujetoPedido) {
        // Lógica para procesar un pedido en proceso
        System.out.println("El pedido ha sido rechazado");
        sujetoPedido.cambiarEstado(EstadoPedidoEntregado.getInstancia());
    }
}