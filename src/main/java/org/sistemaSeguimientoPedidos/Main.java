package org.sistemaSeguimientoPedidos;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Obtener la instancia del sistema
        SistemaSeguimientoPedidos sistema = SistemaSeguimientoPedidos.getInstancia();

        // Crear instancias
        PedidoManager pedidoManager = PedidoManager.getInstancia();
        NotificadorEstadoPedido observador = NotificadorEstadoPedido.getInstancia();

        // Agregar observador
        pedidoManager.agregarObservador(observador);

        // Realizar un nuevo pedido
        Pedido pedido = sistema.realizarNuevoPedido(pedidoManager);

        // Consultar el estado del pedido
        sistema.consultarEstadoPedido(pedido.getId());

        sistema.modificarEstadoPedido(pedido, EstadoPedidoConfirmado.getInstancia());

        sistema.modificarEstadoPedido(pedido, EstadoPedidoEnProceso.getInstancia());

        // Cancelar el pedido para sujetoPedido2
        sistema.cancelarPedido(pedido);

        // Consultar el estado del pedido
        sistema.consultarEstadoPedido(pedido.getId());
    }
}
