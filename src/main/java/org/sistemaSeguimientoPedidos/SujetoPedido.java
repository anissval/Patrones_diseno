package org.sistemaSeguimientoPedidos;

import java.util.ArrayList;
import java.util.List;

public class SujetoPedido {
    private List<ObservadorUsuario> observadores = new ArrayList<>();
    private EstadoPedido estado;

    public void agregarObservador(ObservadorUsuario observador) {
        observadores.add(observador);
    }

    public void quitarObservador(ObservadorUsuario observador) {
        observadores.remove(observador);
    }

    public void notificarObservadores() {
        for (ObservadorUsuario observador : observadores) {
            observador.actualizar(estado);
        }
    }

    public void cambiarEstado(EstadoPedido nuevoEstado) {
        this.estado = nuevoEstado;
        notificarObservadores();
    }
}
