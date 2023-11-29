package org.sistemaSeguimientoPedidos;

import java.util.ArrayList;
import java.util.List;

public class PedidoManager {
    private static PedidoManager instancia;
    private List<NotificadorEstadoPedido> observadores = new ArrayList<>();

    private PedidoManager() {
    }

    public static PedidoManager getInstancia() {
        if (instancia == null) {
            instancia = new PedidoManager();
        }
        return instancia;
    }

    public void agregarObservador(NotificadorEstadoPedido observador) {
        observadores.add(observador);
    }

    public void quitarObservador(NotificadorEstadoPedido observador) {
        observadores.remove(observador);
    }

    public void notificarObservadores(Pedido pedido, EstadoPedido nuevoEstado) {
        for (NotificadorEstadoPedido observador : observadores) {
            observador.actualizar(pedido, nuevoEstado);
        }
    }
}
