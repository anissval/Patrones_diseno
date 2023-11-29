package org.sistemaSeguimientoPedidos;

public class EstadoPedidoListoParaEnvio implements EstadoPedido {
    private static EstadoPedidoListoParaEnvio instancia;

    private EstadoPedidoListoParaEnvio() {
    }

    public static EstadoPedidoListoParaEnvio getInstancia() {
        if (instancia == null) {
            instancia = new EstadoPedidoListoParaEnvio();
        }
        return instancia;
    }

    @Override
    public void procesarPedido(Pedido pedido) {
        System.out.println("El pedido " + pedido.getId() + "  está listo para ser enviado o recogido");
    }
}