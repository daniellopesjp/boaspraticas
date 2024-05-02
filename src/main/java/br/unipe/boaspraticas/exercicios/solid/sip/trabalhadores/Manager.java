package br.unipe.boaspraticas.exercicios.solid.sip.trabalhadores;

class Manager implements FullTimeWorker, TemporaryWorker {
    @Override
    public void workFullTime() {
        // Implementação do trabalho em tempo integral para um gerente
        System.out.println("Gerente trabalhando em tempo integral.");
    }

    @Override
    public void doTemporaryWork() {
        // Implementação do trabalho temporário para um gerente
        System.out.println("Gerente também faz trabalhos temporários.");
    }
}

