package exerc1;

public abstract class Produto {

    private String nome, marca;
    private double peso;

    public void exibirDados(){
        System.out.println("Nome: do Produto: "+getNome());
        System.out.println("Marca "+getMarca());
        System.out.println("Peso: "+getPeso());
    }

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    public String getMarca() {return marca;}
    public void setMarca(String marca) {this.marca = marca;}
    public double getPeso() {return peso;}
    public void setPeso(double peso) {this.peso = peso;}

}
