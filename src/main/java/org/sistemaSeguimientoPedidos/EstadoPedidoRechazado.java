package org.sistemaSeguimientoPedidos;

public class EstadoPedidoRechazado implements EstadoPedido {

    private static EstadoPedidoRechazado instancia;

    private EstadoPedidoRechazado() {
    }

    public static EstadoPedidoRechazado getInstancia() {
        if (instancia == null) {
            instancia = new EstadoPedidoRechazado();
        }
        return instancia;
    }


    @Override
    public void procesarPedido(Pedido pedido) {
        System.out.println("El pedido  " + pedido.getId() + " eha sido rechazado");
    }
}