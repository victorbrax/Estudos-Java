package exemplo_POO8_UFC;

public class UltimateCombat {

    public static void main(String[] args) {

        Lutador l1 = new Lutador("Cleiton", "Brasil", 96.44f, 1.98f, 22, 53, 9, 1 );
        Lutador l2 = new Lutador("Robson", "Coreia", 86.44f, 2.68f, 26, 9, 9, 6);
        Lutador l3 = new Lutador("Gomes", "Alemanha", 76.44f, 2.18f, 20, 2, 9, 3 );
        Lutador l4 = new Lutador("Victor", "França", 85.44f, 1.78f, 46, 5, 9, 5);
        Lutador l5 = new Lutador("Gustavo", "Italia", 116.44f, 1.58f, 56, 6, 9, 0);

        Luta UFC01 = new Luta();
        UFC01.marcarLuta(l3, l4);
        UFC01.lutar();

        System.out.println("Resultados finais:"); // Perceba que eles só lutaram por serem da mesma categoria.
        l3.status();
        l4.status();



    }
}
