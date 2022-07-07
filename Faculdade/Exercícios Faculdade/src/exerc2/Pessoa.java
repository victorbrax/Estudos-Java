package exerc2;

public abstract class Pessoa {

    protected String nome, email, sexo;
    protected int idade;

    public void mostrarDados(){
        System.out.println("Nome: "+getNome());
        System.out.println("Sexo: "+getSexo());
        System.out.println("Idade: "+getIdade());
        System.out.println("E-mail: "+getSexo());
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
