package br.unipe.boaspraticas.exercicios.solid.dip;

public class Pedido {
    private DataSource dataSource;

    // Construtor que recebe uma instância de DataSource, permitindo a injeção de dependência
    public Pedido(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void salvar() {
        dataSource.salvarPedido(this);
    }
}
