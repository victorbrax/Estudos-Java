package exemplo_POO10_HENRANCA2;

public abstract class Pessoa { // abstract: nao pode ser instanciada/gerar objetos. so pode ser mamae
    // metodos abstratos so podem ser colocados em interfaces ou classes abstratas, ele é declarado, mas nao implementado na progenitora


    private String nome, sexo;
    private int idade;

    public void  FazerAniversario(){
        this.idade=+1;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sexo='" + sexo + '\'' +
                ", idade=" + idade +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
