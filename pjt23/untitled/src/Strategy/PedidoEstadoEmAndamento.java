package Strategy;

public class PedidoEstadoEmAndamento extends PedidoEstado {
    private static PedidoEstadoEmAndamento instance = new PedidoEstadoEmAndamento();

    private PedidoEstadoEmAndamento() {
    }

    public static PedidoEstadoEmAndamento getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Em andamento";
    }
}