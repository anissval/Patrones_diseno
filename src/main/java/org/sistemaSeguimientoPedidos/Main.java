package org.sistemaSeguimientoPedidos;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Obtener la instancia del sistema
        SistemaSeguimientoPedidos sistema = SistemaSeguimientoPedidos.getInstancia();

        // Crear instancias
        SujetoPedido sujetoPedido1 = new SujetoPedido();
        SujetoPedido sujetoPedido2 = new SujetoPedido();
        ObservadorUsuario observador = new ObservadorUsuario();

        // Agregar observador al sujeto
        sujetoPedido1.agregarObservador(observador);

        // Iniciar el proceso de pedido
        EstadoPedido estadoInicial = EstadoPedidoPendienteConfirmacion.getInstancia();
        sujetoPedido1.cambiarEstado(estadoInicial);

        // Simular cambios de estado
        sujetoPedido1.cambiarEstado(EstadoPedidoConfirmado.getInstancia());
        sujetoPedido1.cambiarEstado(EstadoPedidoEnProceso.getInstancia());
        sujetoPedido1.cambiarEstado(EstadoPedidoListoParaEnvio.getInstancia());
        sujetoPedido1.cambiarEstado(EstadoPedidoEnTransito.getInstancia());
        sujetoPedido1.cambiarEstado(EstadoPedidoEntregado.getInstancia());

        // Realizar un nuevo pedido con sujetoPedido2
        sistema.realizarNuevoPedido(sujetoPedido2);

        // Consultar el estado del pedido para sujetoPedido2
        sistema.consultarEstadoPedido(sujetoPedido2);

        // Cancelar el pedido para sujetoPedido2
        sistema.cancelarPedido(sujetoPedido2);
    }
}
