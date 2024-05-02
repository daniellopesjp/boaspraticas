package br.unipe.boaspraticas.exercicios.solid.lsp.pessoas;

public class Funcionario extends Pessoa implements FazerSom {
    private double salario;

    public Funcionario(String nome, double salario) {
        super(nome);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public void fazerSom() {
        System.out.println("Bom dia!");
    }
}
