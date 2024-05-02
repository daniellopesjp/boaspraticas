package br.unipe.boaspraticas.exercicios.solid.sip.animais;

public class Fish implements Fishes {
    @Override
    public void eat() {
        System.out.println("O Peixe está comendo.");
    }

    @Override
    public void sleep() {
        System.out.println("O Peixe está dormindo.");
    }

    @Override
    public void swim() {
        System.out.println("O Peixe está nadando.");
    }
}
