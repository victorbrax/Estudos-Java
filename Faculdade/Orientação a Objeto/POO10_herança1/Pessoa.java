package exemplo_POO10_HENRANCA;

public class Pessoa {

    private String sexo, nome;
    private int idade;

    public void fazerAniv(){
        setIdade(getIdade() + 1);
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
