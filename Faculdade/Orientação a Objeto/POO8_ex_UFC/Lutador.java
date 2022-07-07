package exemplo_POO8_UFC;

public class Lutador {

    private String nome;
    private String nacionalidade;
    private String categoria;
    private float peso;
    private float altura;
    private int idade;
    private int vitorias;
    private int empates;
    private int derrotas;

    public Lutador(String no, String na, float pe, float al, int id, int vi, int em, int de) {
        this.nome = no;
        this.nacionalidade = na;
        setPeso(pe); // Preste atenção aqui
        this.altura = al;
        this.idade = id;
        this.vitorias = vi;
        this.empates = em;
        this.derrotas = de;
    }

    public void apresentar() {
        System.out.println("-----------------------------------------------");
        System.out.println("Chegou a hora!! O "+this.getNome()+" chegou ao ringue!");
        System.out.println("Lutador de "+getNacionalidade());
        System.out.println("Pesando "+getPeso()+" quilos e possuindo "+getAltura()+" metros de altura!");
        System.out.println("Ele já venceu "+getVitorias()+" vezes, perdeu apenas "+getDerrotas()+" vezes e empatou "+getEmpates()+" vezes!");
        System.out.println("-----------------------------------------------");
    }

    public void status() {
        System.out.println("-----------------------------------------------");
        System.out.println("Ficha Técnica:");
        System.out.println("Nome: "+getNome());
        System.out.println("Peso: "+getPeso()+"kg");
        System.out.println("Altura: "+getAltura()+"m");
        System.out.println("Categoria: "+getCategoria());
        System.out.println("Vitórias: "+getVitorias());
        System.out.println("Derrotas: "+getDerrotas());
        System.out.println("Empates: "+getEmpates());
        System.out.println("-----------------------------------------------");
    }

    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }

    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }

    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria() {
        if (this.peso < 50) {
            this.categoria = "Inválido";
        }
        else if (this.peso <= 70){
            this.categoria = "Leve";
        }
        else if(this.peso <= 100){
            this.categoria = "Médio";
        }
        else if (this.peso <= 130){
            this.categoria = "Pesado";
        }
        else{
            this.categoria = "Inválido";
        }
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        setCategoria();
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }


}
