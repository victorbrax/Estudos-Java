package exemplo_POO4_x_construct;

public class Caneta {

    private String modelo;
    private String cor;
    private float ponta;
    private boolean tampada;

    public Caneta() { // este é o método construtor, ele sempre terá o mesmo nome da classe

        this.setTampar(true);
        this.setModelo("Toyota");
        this.setPonta(0.2f);
        this.setCor("Azul");
    }

    public boolean getTampar() {
        return this.tampada;
    }

    public void setTampar(boolean t) {
        this.tampada = t;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String m) {
        this.modelo = m;
    }

    public float getPonta() {
        return this.ponta;
    }

    public void setPonta(float p) {
        this.ponta = p;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String c) {
        this.cor = c;
    }

    public void status() {

        System.out.println("Sobre a caneta: ");
        System.out.println("Modelo é: " + this.getModelo());
        System.out.println("A ponta é: " + this.getPonta());
        System.out.println("A cor é: " + this.getCor());
        System.out.println("Está tampada: " + this.getTampar());

    }
}
