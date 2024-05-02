package br.unipe.boaspraticas.exercicios.solid.sip.animais;

//Neste exemplo, a interface Animal contém todos os métodos relacionados a comportamentos comuns de todos os animais,
// incluindo os métodos voar() e nadar(). No entanto, ao implementar essa interface nas classes Bird e Fish,
// somos obrigados a implementar métodos que não fazem sentido para cada uma dessas classes. Por exemplo, a classe
// Bird precisa implementar o método swim(), mesmo que as aves não nadem. O mesmo acontece com a classe Fish,
// que precisa implementar o método fly(), mesmo que os peixes não voem.
//
//Essa violação do ISP torna o código menos coeso e mais difícil de manter, pois as classes estão
// forçadas a implementar métodos que não são relevantes para elas
interface Animal {
    void eat();
    void sleep();
    void fly();
    void swim();
}
