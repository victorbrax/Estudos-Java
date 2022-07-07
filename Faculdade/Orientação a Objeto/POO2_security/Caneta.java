package exemplo_POO2_sec;

public class Caneta {

    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;

    public void status(){
        System.out.println();
        System.out.println("Cor: "+this.cor);
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Tampada: "+this.tampada);
        System.out.println("Ponta: "+this.ponta);
        System.out.println("Carga: "+this.carga+"%");
        System.out.println();
    }

    private void rabiscar() {
        if (this.tampada == true || this.carga == 0) {
            System.out.println("ERRO! Não consigo rabiscar.");
        } else {
            System.out.println("Estou rabiscando.");
        }
    }

    public void tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }

}
