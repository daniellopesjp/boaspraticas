package br.unipe.boaspraticas.exercicios.solid.model;

import lombok.Data;

@Data
public class PurchaseItem {
    private String name;       //NOME da pessoa realizando compra
    private double totalPrice; //Preço da compra
    private int quantity;      // Quantidade de itens
}
