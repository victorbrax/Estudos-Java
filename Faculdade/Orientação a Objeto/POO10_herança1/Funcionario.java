package exemplo_POO10_HENRANCA;

public class Funcionario extends Pessoa {

    private String especialidade;
    private int tempoServ;
    private float hpordia;

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public int getTempoServ() {
        return tempoServ;
    }

    public void setTempoServ(int tempoServ) {
        this.tempoServ = tempoServ;
    }

    public float getHpordia() {
        return hpordia;
    }

    public void setHpordia(float hpordia) {
        this.hpordia = hpordia;
    }
}

