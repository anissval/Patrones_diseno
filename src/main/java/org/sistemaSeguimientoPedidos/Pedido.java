package org.sistemaSeguimientoPedidos;

public class Pedido {
    String id;
    EstadoPedido estadoPedido;

    public Pedido() {
        this.id = String.valueOf((int) (Math.random() * 1000));
    }

    public String getId() {
        return id;
    }

    public EstadoPedido getEstadoPedido() {
        return estadoPedido;
    }

    public void setEstadoPedido(EstadoPedido pedido) {
        this.estadoPedido = pedido;
    }
}
