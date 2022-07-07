package exemplo_POO2_sec;

public class UsoCaneta {

    public static void main(String[] args) {

        Caneta c1 = new Caneta();

        c1.modelo = "BIC Crystal"; // (está público)
        c1.cor = "Verde"; // (está público)
    //  c1.ponta = 0.5f; (está privado, apenas a classe pode mexera)
        c1.carga = 80; // (está protegida, apenas a Main Class pode mexer)
    //  c1.tampada = false; // (está privado, apenas a classe pode mexera)

        c1.tampar();
        c1.status();
        //  c1.rabiscar(); (está privado, apenas a classe pode mexera)
        System.out.println();
        c1.destampar();
        c1.status();

        /* Perceba que o atributo "tampada" é privado, e você não pode mexer nele, porque
        apenas a própria classe pode mexer em atributos privados, mas os métodos "tampar"
        e "destampar" são públicos, então você consegue manipular o atributo "tampada" através dele. */

    }
}
