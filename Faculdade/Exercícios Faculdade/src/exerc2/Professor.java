package exerc2;

public class Professor extends Pessoa {

    private String disciplina;
    private int licença;

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Disciplina: "+getDisciplina());
        System.out.println("Licença: "+getLicença());

    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public int getLicença() {
        return licença;
    }

    public void setLicença(int licença) {
        this.licença = licença;
    }
}
