package exemplo_POO7_ENCAP_conremoto.exemplo_POO11_POLIMORFISMO_sobreposicao;

public class Reptil extends Animal{

    private String corEscama;

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    public void locomover() {
        System.out.println("Arrastando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo folha e vegetal kkk");
    }

    @Override
    public void emitirSom() {
        System.out.println("LAMBIDA! SOM DE REPTIL");
    }
}
