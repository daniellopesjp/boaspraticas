package br.unipe.boaspraticas.exercicios.solid.lsp.pessoas;

public class LiskovExample {
    public static void main(String[] args) {

        Funcionario joao = new Funcionario("João", 3000);
        joao.fazerSom(); // Bom dia! (Funcionário cumprimenta)

        Funcionario maria = new Funcionario("Maria", 4000);
        maria.fazerSom(); // Bom dia! (Funcionário cumprimenta)
    }
}
