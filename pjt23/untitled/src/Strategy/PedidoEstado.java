package Strategy;

public abstract class PedidoEstado {
    public PedidoEstado() {
    }

    public abstract String getEstado();

    public void finalizar(Pedido pedido) {
        System.out.println("Pedido #" + pedido.getNumero() + " finalizado.");
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
    }

    public void cancelar(Pedido pedido) {
        System.out.println("Pedido #" + pedido.getNumero() + " cancelado.");
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
    }
}
