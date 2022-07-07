package exemplo_POO1;

public class Caneta {

    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status(){
        System.out.println();
        System.out.println("Cor: "+this.cor);
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Tampada: "+this.tampada);
        System.out.println("Ponta: "+this.ponta);
        System.out.println("Carga: "+this.carga+"%");
        System.out.println();
    }

    void rabiscar() {
        if (this.tampada == true || this.carga == 0) {
            System.out.println("ERRO! Não consigo rabiscar.");
        } else {
            System.out.println("Estou rabiscando.");
        }
    }

    void tampar() {
        this.tampada = true;
    }

    void destampar() {
        this.tampada = false;
    }

}
