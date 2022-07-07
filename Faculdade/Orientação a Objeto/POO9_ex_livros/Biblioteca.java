package exemplo_POO9_livros;

public class Biblioteca {

    public static void main(String[] args) {

        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Joao", 20, "Masc" );
        p[1] = new Pessoa("Carla", 19, "Fem" );

        l[0] = new Livro("O ladrao que roubava gatos", "Dom Kampf", 324, p[1]);
        l[0] = new Livro("MATEMATICA AVANÇADISSIMA", "MyDugness", 954, p[0]);
        l[0] = new Livro("A Fantástica Fábrica de Ódio", "Hailo Norn", 154, p[0]);

        l[0].abrir();
        l[0].folhear(126);
        p[1].fazerAniver();

        System.out.println(l[0].toString());
    }
}
