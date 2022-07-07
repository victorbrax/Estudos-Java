package exemplo_POO7_ENCAP_conremoto.exemplo_POO11_POLIMORFISMO_sobreposicao;

public class Aves extends Animal{

    private String corPena;

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    public void fazerNinho(){
        System.out.println("Pegando galhos e fazendo ninho");
    }

    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo frutas");
    }

    @Override
    public void emitirSom() {
        System.out.println("piu piu");
    }
}
