package exemplo_POO7_ENCAP_conremoto.exemplo_POO11_POLIMORFISMO_sobreposicao;

public class Peixe extends Animal{

    private String corNadadeiras;

    public String getCorNadadeiras() {
        return corNadadeiras;
    }

    public void setCorNadadeiras(String corNadadeiras) {
        this.corNadadeiras = corNadadeiras;
    }

    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo bolinha");
    }

    @Override
    public void emitirSom() {
        System.out.println("glub glub bolhas");
    }
}
