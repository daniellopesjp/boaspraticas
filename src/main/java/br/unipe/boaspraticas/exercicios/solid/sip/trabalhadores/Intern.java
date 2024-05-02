package br.unipe.boaspraticas.exercicios.solid.sip.trabalhadores;

class Intern implements FullTimeWorker {
    @Override
    public void workFullTime() {
        // Implementação do trabalho em tempo integral para um estagiário
        System.out.println("Estagiário trabalhando em tempo integral.");
    }
}
