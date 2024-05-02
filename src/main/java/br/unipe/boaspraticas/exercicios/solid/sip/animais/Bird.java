package br.unipe.boaspraticas.exercicios.solid.sip.animais;

public class Bird implements Birds {
    @Override
    public void eat() {
        System.out.println("A Ave está comendo.");
    }

    @Override
    public void sleep() {
        System.out.println("A Ave está dormindo.");
    }

    @Override
    public void fly() {
        System.out.println("A Ave está voando.");
    }
}
