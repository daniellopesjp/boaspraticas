package br.unipe.boaspraticas.exercicios.solid.model;

public class FixedDiscount implements Discount {
    private double discountValue;

    public FixedDiscount(double discountValue) {
        this.discountValue = discountValue;
    }

    @Override
    public double applyDiscount(double total) {
        return total - discountValue;
    }
}
