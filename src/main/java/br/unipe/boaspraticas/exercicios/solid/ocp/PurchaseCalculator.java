package br.unipe.boaspraticas.exercicios.solid.ocp;

import br.unipe.boaspraticas.exercicios.solid.model.Purchase;

// Classe responsável por calcular o valor total de uma compra
public class PurchaseCalculator {
    public double calculateTotal(Purchase purchase) {
        return purchase.calculateTotal(); // Delega o cálculo do total para a compra
    }
}
