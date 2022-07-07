package exemplo_POO10_HENRANCA2;

public class ProgramaPrincipal {

    public static void main(String[] args) { // conceitos importantes na classe bolsista

        Visitante v1 = new Visitante();
        v1.setNome("Juvenal");
        v1.setIdade(44);
        v1.setSexo("Masculino");

        System.out.println(v1.toString());

        Aluno a1 = new Aluno();
        a1.setNome("Rilpi");
        a1.setIdade(19);
        a1.setSexo("Masculino");
        a1.setMatricula(983);
        a1.pagarMensalidade();
        a1.setCurso("Finanças");
        a1.getCurso();

        System.out.println(a1.toString());

        Bolsista b1 = new Bolsista();
        b1.setNome("Jorge");
        b1.setIdade(17);
        b1.FazerAniversario();
        b1.setSexo("Masculino");
        b1.setMatricula(9457);
        b1.pagarMensalidade();
        b1.setCurso("Informatica");
        b1.getCurso();

        System.out.println(b1.toString());
    }
}
