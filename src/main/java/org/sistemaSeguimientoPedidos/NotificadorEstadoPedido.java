package org.sistemaSeguimientoPedidos;

public class NotificadorEstadoPedido implements IObservadorEstadoPedido {

    private static NotificadorEstadoPedido instancia;

    private NotificadorEstadoPedido() {
    }

    public static NotificadorEstadoPedido getInstancia() {
        if (instancia == null) {
            instancia = new NotificadorEstadoPedido();
        }
        return instancia;
    }

    @Override
    public void actualizar(Pedido pedido, EstadoPedido nuevoEstado) {
        //Actualiza el estado del pedido en el sistema
        nuevoEstado.procesarPedido(pedido);
    }
}
