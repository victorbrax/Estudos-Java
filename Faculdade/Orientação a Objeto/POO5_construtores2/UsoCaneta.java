package exemplo_POO5_y_construct;

public class UsoCaneta {

    public static void main(String[] args) {

        Caneta c1 = new Caneta(true, "BIC", 0.4f, "Vermelha");
        Caneta c2 = new Caneta(false, "Inviktus", 0.8f, "Amarela");
        Caneta c3 = new Caneta(true, "Polo", 0.1f, "Roxa");

        System.out.println("Olha como elas ja vieram de fábrica através do método construtor com parametros: ");
        System.out.println();
        c1.status();
        System.out.println();
        c2.status();
        System.out.println();
        c3.status();

    }
}
