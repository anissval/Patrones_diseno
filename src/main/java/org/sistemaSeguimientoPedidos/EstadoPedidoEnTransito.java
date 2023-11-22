package org.sistemaSeguimientoPedidos;

public class EstadoPedidoEnTransito implements EstadoPedido {
    private static EstadoPedidoEnTransito instancia = new EstadoPedidoEnTransito();

    private EstadoPedidoEnTransito() {
    }

    public static EstadoPedidoEnTransito getInstancia() {
        return instancia;
    }

    public void procesarPedido(SujetoPedido sujetoPedido) {
        // Lógica para procesar un pedido en proceso
        System.out.println("El pedido está en camino hacia la dirección de entrega");
        sujetoPedido.cambiarEstado(EstadoPedidoEnTransito.getInstancia());
    }
}