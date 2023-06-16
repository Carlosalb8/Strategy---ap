package Strategy;

public class Pedido {
    private int numero;
    private PedidoEstado estado = PedidoEstadoEmAndamento.getInstance();

    public Pedido(int numero) {
        this.numero = numero;
    }

    public void setEstado(PedidoEstado estado) {
        this.estado = estado;
    }

    public void finalizar() {
        this.estado.finalizar(this);
    }

    public void cancelar() {
        this.estado.cancelar(this);
    }

    public String getNomeEstado() {
        return this.estado.getEstado();
    }

    public int getNumero() {
        return this.numero;
    }
}

