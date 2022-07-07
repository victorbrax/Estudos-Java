package exemplo_POO7_ENCAP_conremoto.exemplo_POO11_POLIMORFISMO_sobreposicao;

public class Canguru extends Mamifero{

    public void usarBolsa(){
        System.out.println("Filhote na bolsa");
    }

    @Override
    public void locomover(){
        System.out.println("Saltando"); // o canguru é mamifero mas nao corre, ele salta, entao ele tem que sobrepor
        // a locomocao de um mamifero normal, que é correndo. (usando o override)
    }

}
