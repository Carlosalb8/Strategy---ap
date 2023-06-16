package Test;

import Strategy.Pedido;
import Strategy.PedidoEstadoCancelado;
import Strategy.PedidoEstadoEntregue;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PedidoTest {

    @Test
    public void testPedidoEmAndamento() {
        Pedido pedido = new Pedido(1);
        Assertions.assertEquals("Em andamento", pedido.getNomeEstado());

        pedido.finalizar();
        Assertions.assertEquals("Entregue", pedido.getNomeEstado());

        pedido.cancelar();
        Assertions.assertEquals("Cancelado", pedido.getNomeEstado());
    }

    @Test
    public void testPedidoEntregue() {
        Pedido pedido = new Pedido(2);
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
        Assertions.assertEquals("Entregue", pedido.getNomeEstado());

        pedido.cancelar();
        Assertions.assertEquals("Cancelado", pedido.getNomeEstado());
    }

    @Test
    public void testPedidoCancelado() {
        Pedido pedido = new Pedido(3);
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        Assertions.assertEquals("Cancelado", pedido.getNomeEstado());

        // Verifica se a função finalizar() não altera o estado quando o pedido está cancelado
        pedido.finalizar();
        Assertions.assertEquals("Cancelado", pedido.getNomeEstado());
    }
}
