package br.unipe.boaspraticas.exercicios.oc;

import br.unipe.boaspraticas.exercicios.solid.model.Item;
import java.util.List;

public class PriceCalculator {
    private List<Item> items;

    public PriceCalculator(List<Item> items) {
        this.items = items;
    }

    public double calculateTotalPrice() {
        double totalPrice = 0;
        for (Item item : items) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }
}
