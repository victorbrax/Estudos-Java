package exemplo_POO5_y_construct;

public class Caneta {

    private String modelo;
    private String cor;
    private float ponta;
    private boolean tampada;

    public Caneta(boolean tam, String mod, float pon, String color) { // método construtor usando parametros

        this.setTampar(tam);
        this.setModelo(mod);
        this.setPonta(pon);
        this.setCor(color);
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
