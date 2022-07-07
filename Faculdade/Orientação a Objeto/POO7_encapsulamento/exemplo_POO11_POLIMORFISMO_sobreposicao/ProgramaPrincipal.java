package exemplo_POO7_ENCAP_conremoto.exemplo_POO11_POLIMORFISMO_sobreposicao;

public class ProgramaPrincipal {

    // Assinatura do Método
// quando o metodo tem o mesmo tipo e quantidade de parametros entre outro metodo

    // polimorfismo de sobreposicao acontece quando
    // substituimos um metodo de uma superclasse na sua subclasse, usando a mesma assinatura

    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Aves a = new Aves();
        Peixe p = new Peixe();
        Reptil r = new Reptil();
        Canguru c = new Canguru();
        // TODOS EXTENDEM A CLASSE ANIMAL

        m.setPeso(84);
        m.setCorPelo("Branco");
        m.setIdade(12);
        m.locomover(); // correndo

        a.setCorPena("Azul");
        a.locomover(); // voando

        p.setCorNadadeiras("verde");
        p.setMembros(4);

        r.setCorEscama("Azul");
        r.emitirSom(); // LAMBIDA, SOM DE REPTIL

        c.locomover(); // esse aqui nao corre, ele pula kk


        // polimorfismo e chamar o mesmo metodo ou classe e obter resultados diferentes

        // fazer ou chamar uma coisa com o mesmo nome e essa coisa fazer coisas diferentes.
    }


}