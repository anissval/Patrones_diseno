package org.sistemaSeguimientoPedidos;

public interface IObservadorEstadoPedido {
    public void actualizar(Pedido pedido, EstadoPedido nuevoEstado);
}
