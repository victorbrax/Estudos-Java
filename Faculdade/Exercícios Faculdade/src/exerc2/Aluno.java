package exerc2;

public class Aluno extends Pessoa{

    private int matricula;
    private boolean bolsista;

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Matrícula: "+getMatricula());
        System.out.println("Bolsa ativa: "+isBolsista());
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public boolean isBolsista() {
        return bolsista;
    }

    public void setBolsista(boolean bolsista) {
        this.bolsista = bolsista;
    }
}
