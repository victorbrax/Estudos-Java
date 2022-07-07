package exemplo_POO10_HENRANCA;

public class ProgramaPrincipal {
    public static void main(String[] args) {


        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Pedro");

        p2.setNome("Lucas"); // herdou de pessoas
        p2.setSexo("Masculino"); // herdou de pessoas
        p2.setIdade(17); // herdou de pessoas
        p2.setComportamento("Bom"); // dele mesmo
        p2.setEstudando(true); // dele mesmo
        p2.setMedia(8); // dele mesmo
        p2.setNomeEscola("Orosimbo Maia");
        p2.fazerAniv(); // herdou de pessoas

        p3.setNome("Valmir"); // herdou de pessoas
        p3.setIdade(54); // herdou de pessoas
        p3.setSexo("Masculino"); // herdou de pessoas
        p3.setMateria("Matematica"); // dele mesmo


    }

}
