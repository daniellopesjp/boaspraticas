package br.unipe.boaspraticas.exercicios.oc;

import br.unipe.boaspraticas.exercicios.solid.model.Item;

import java.util.ArrayList;
import java.util.List;

public class AddRemoveItens {

    private List<Item> items;

    public AddRemoveItens() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        if (item != null) {
            items.add(item);
        } else {
            throw new IllegalArgumentException("O item não pode ser nulo");
        }
    }

    public void removeItem(Item item) {
        items.remove(item);
    }
}
