package exerc2;

public class ProgramaPrincipal {

    public static void main(String[] args) {

        Professor p1 = new Professor();

        p1.setNome("Monica Frigeri");
        p1.setSexo("Feminino");
        p1.setIdade(34);
        p1.setEmail("monicafrigeri@fatec.com");
        p1.setDisciplina("Projeto Interdisciplinar");
        p1.setLicença(48673);
        p1.mostrarDados();

        Aluno a1 = new Aluno();

        a1.setNome("Victor");
        a1.setSexo("Masculino");
        a1.setIdade(20);
        a1.setEmail("joaogomespcl@fatec.com");
        a1.setBolsista(false);
        a1.setMatricula(9864);

        a1.mostrarDados();



    }
}
