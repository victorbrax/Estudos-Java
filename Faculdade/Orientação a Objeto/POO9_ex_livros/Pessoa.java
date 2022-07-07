package exemplo_POO9_livros;

public class Pessoa {

    private String nome;
    private int idade;
    private String sexo;

    public Pessoa (String no, int id, String sex){
        setIdade(id);
        setNome(no);
        setSexo(sex);
    }

    public void fazerAniver(){
        setIdade(getIdade() + 1);
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }



}
