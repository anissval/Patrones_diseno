package org.sistemaSeguimientoPedidos;

public class EstadoPedidoListoParaEnvio implements EstadoPedido {
    private static EstadoPedidoListoParaEnvio instancia = new EstadoPedidoListoParaEnvio();

    private EstadoPedidoListoParaEnvio() {
    }

    public static EstadoPedidoListoParaEnvio getInstancia() {
        return instancia;
    }

    public void procesarPedido(SujetoPedido sujetoPedido) {
        // Lógica para procesar un pedido en proceso
        System.out.println("El pedido está listo para ser enviado o recogido");
        sujetoPedido.cambiarEstado(EstadoPedidoEntregado.getInstancia());
    }
}