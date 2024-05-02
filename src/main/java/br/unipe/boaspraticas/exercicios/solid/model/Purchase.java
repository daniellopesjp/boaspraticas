package br.unipe.boaspraticas.exercicios.solid.model;

import lombok.Data;

import java.util.List;

@Data
public class Purchase {
    private List<PurchaseItem> items;
    private Discount discount;

    public Purchase(List<PurchaseItem> items, Discount discount) {
        this.items = items;
        this.discount = discount;
    }

    public double calculateTotal() {
        double total = 0;
        for (PurchaseItem item : items) {
            total += item.getTotalPrice();
        }
        return discount.applyDiscount(total);
    }
}
