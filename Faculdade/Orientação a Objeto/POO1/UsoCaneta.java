package exemplo_POO1;

public class UsoCaneta {

    public static void main(String[] args) {

        Caneta c1 = new Caneta();

        c1.cor = "Azul";
        c1.modelo = "BIC";
        c1.ponta = 0.6f;
        c1.carga = 84;
        c1.tampada = true;

        c1.destampar();
        c1.status();
        c1.rabiscar();

        Caneta c2 = new Caneta();

        c2.cor = "Vermelha";
        c2.modelo = "Shiklassic";
        c2.ponta = 0.2f;
        c2.carga = 94;
        c2.tampada = false;

        c2.tampar();
        c2.status();
        c2.rabiscar();

        Caneta c3 = new Caneta();

        c3.cor = "Verde";
        c3.modelo = "Galileo";
        c3.ponta = 1.0f;
        c3.carga = 0;
        c3.tampada = true;

        c3.destampar();
        c3.status();
        c3.rabiscar();
    }
}
