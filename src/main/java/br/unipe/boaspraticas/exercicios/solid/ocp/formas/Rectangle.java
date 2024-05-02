package br.unipe.boaspraticas.exercicios.solid.ocp.formas;

public class Rectangle implements Shape {
    private double height;
    private double width;

    // Construtor, getters e setters omitidos

    @Override
    public double calculateArea() {
        return height * width;
    }
}
