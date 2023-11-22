package org.sistemaSeguimientoPedidos;

public class ObservadorUsuario {
    public void actualizar(EstadoPedido nuevoEstado) {
        // Lógica para notificar al usuario sobre cambios en el estado del pedido
        System.out.println("El estado del pedido ha cambiado a: " + nuevoEstado);
    }
}
