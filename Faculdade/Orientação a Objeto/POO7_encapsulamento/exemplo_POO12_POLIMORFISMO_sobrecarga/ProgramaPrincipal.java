package exemplo_POO7_ENCAP_conremoto.exemplo_POO12_POLIMORFISMO_sobrecarga;

public class ProgramaPrincipal {

    public static void main(String[] args) {

        Cachorro c1 = new Cachorro();
        c1.reagir(true);
        System.out.println();
        c1.reagir(12, 22);
        System.out.println();
        c1.reagir("Te amo");

        // perceba no codigo que eu estou SOBRECARREGANDO o metodo reagir com varias assinaturas difrentes
        //  e isso so e possivel se exclusivamente, as assinaturas forem diferentes. (conceito de assinaturas:
        // quantidade de parametros e tipos, se for igual nos dois, a assinatura é igual, e ai vira sobreposicao

    }

}
