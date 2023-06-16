package Strategy;

public class PedidoEstadoCancelado extends PedidoEstado {
    private static PedidoEstadoCancelado instance = new PedidoEstadoCancelado();

    private PedidoEstadoCancelado() {
    }

    public static PedidoEstadoCancelado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Cancelado";
    }

    @Override
    public void finalizar(Pedido pedido) {
        // Não faz nada, pois o pedido já está cancelado
        System.out.println("Não é possível finalizar um pedido cancelado.");
    }

    @Override
    public void cancelar(Pedido pedido) {
        // Não faz nada, pois o pedido já está cancelado
        System.out.println("O pedido já está cancelado.");
    }
}
