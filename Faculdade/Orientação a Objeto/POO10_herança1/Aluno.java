package exemplo_POO10_HENRANCA;

public class Aluno extends Pessoa {

    private boolean Estudando;
    private int media;
    private String nomeEscola;
    private String comportamento;

    public boolean isEstudando() {
        return Estudando;
    }

    public void setEstudando(boolean estudando) {
        Estudando = estudando;
    }

    public int getMedia() {
        return media;
    }

    public void setMedia(int media) {
        this.media = media;
    }

    public String getNomeEscola() {
        return nomeEscola;
    }

    public void setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }

    public String getComportamento() {
        return comportamento;
    }

    public void setComportamento(String comportamento) {
        this.comportamento = comportamento;
    }
}
