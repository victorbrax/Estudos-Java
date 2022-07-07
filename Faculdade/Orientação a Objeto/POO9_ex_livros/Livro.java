package exemplo_POO9_livros;

public class Livro implements Publicacao {

    private String titulo, autor;
    private int totpaginas, pagatual;
    private boolean aberto;
    private Pessoa leitor; // lembre-se que vc pode declarar classes como atributos

    @Override
    public String toString() { //  karalho mane dahorao isso, é o status automatico
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ",\n autor='" + autor + '\'' +
                ",\n totpaginas=" + totpaginas +
                ",\n pagatual=" + pagatual +
                ",\n aberto=" + aberto +
                ",\n leitor=" + leitor.getNome() +
                ",\n idade=" + leitor.getIdade() +
                ",\n sexo=" + leitor.getSexo() +
                '}';
    }

    public Livro(String titulo, String autor, int totpaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.aberto = false;
        this.pagatual = 0;
        this.totpaginas = totpaginas;
        this.leitor = leitor;
    }

    // metodos abstratos da interface

    @Override
    public void abrir() {
        this.aberto = true;
        System.out.println("O livro está aberto");
    }

    @Override
    public void fechar() {
        this.aberto = false;
        System.out.println("O livro está fechado");
    }

    @Override
    public void folhear(int pag) {
        this.pagatual = pag;
        System.out.println("Você parou na página "+pag);
    }

    @Override
    public void avancarpag() {
        this.pagatual++;
    }

    @Override
    public void voltarpag() {
        this.pagatual--;

    }
}
