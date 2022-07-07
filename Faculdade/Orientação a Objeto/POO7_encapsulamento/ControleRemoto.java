package exemplo_POO7_ENCAP_conremoto;

public class ControleRemoto implements Controlador {

    // Atributos em interfaces SEMPRE privados.
    private int volume;
    private boolean ligado;
    private boolean tocando;

    // Métodos Especiais

    public ControleRemoto() { // Construtor
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    public void setVolume(int v) {
        this.volume = v;
    }

    public void setLigado(boolean l) {
        this.ligado = l;
    }

    public void setTocando(boolean t) {
        this.tocando = t;
    }

    public int getVolume() {
        return volume;
    }

    public boolean getLigado() {
        return ligado;
    }

    public boolean getTocando() {
        return tocando;
    }

    // Métodos Abstratos | Se você já os criou na interface, é só dar o implements no construtor que o Java já cria tudo

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println();
        System.out.println("-------- MENU --------");
        System.out.println("Está ligado? = " + this.getLigado());
        System.out.println("Está tocando? = " + this.getTocando());
        System.out.print("Volume = " + getVolume()+" ");
        for (int i = 0; i <= this.getVolume(); i += 10) { // Gracinha pra mostrar o volume
            System.out.print("|");
        }
        System.out.println();
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu...");
    }

    @Override
    public void maisVolume() {
        if (this.getLigado() == true) {
            this.setVolume(this.getVolume() + 5);
        }
        else {
            System.out.println(" Impossível aumentar o volume.");
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado() == true) {
            this.setVolume(getVolume() - 5);
        }
        else {
            System.out.println(" Impossível abaixar o volume.");
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado() == true && this.getVolume() > 0) {
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (this.getLigado() == true && this.getVolume() == 0) {
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.getLigado() && !(this.getTocando() == true)) {
            this.setTocando(true);
        }
        else {
            System.out.println("Impossível reproduzir, está desligada!");
        }
    }

    @Override
    public void pause() {
        if (this.getLigado() && (this.getTocando() == true)) {
            this.setTocando(false);
        }
        else {
            System.out.println("Impossível pausar, está desligada!");

        }

    }
}
