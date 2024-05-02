package br.unipe.boaspraticas.exercicios.oc;

import br.unipe.boaspraticas.exercicios.solid.model.Item;
import java.util.List;

public class ItemPrinter {
    private List<Item> items;

    public ItemPrinter(List<Item> items) {
        this.items = items;
    }

    public void printItems() {
        for (Item item : items) {
            System.out.println(item.getName() + " - $" + item.getPrice());
        }
    }
}
