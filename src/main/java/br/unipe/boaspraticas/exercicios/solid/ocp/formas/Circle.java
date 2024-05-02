package br.unipe.boaspraticas.exercicios.solid.ocp.formas;

public class Circle implements Shape {
    private double radius;

     // Construtor, getters e setters omitidos

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
