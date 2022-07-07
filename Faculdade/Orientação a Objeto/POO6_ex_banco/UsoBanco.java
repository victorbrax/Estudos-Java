package exemplo_POO6_banco;

public class UsoBanco {

    public static void main(String[] args) {

        ContaBanco pessoa1 = new ContaBanco();

        pessoa1.setNumConta(487436);
        pessoa1.setDono("Víctor");
        pessoa1.abrirConta("CP");
        pessoa1.depositar(1900.25f);
        pessoa1.pagarMensal();
        pessoa1.sacar(244f);

        ContaBanco pessoa2 = new ContaBanco();

        pessoa2.setNumConta(465846);
        pessoa2.setDono("Millena");
        pessoa2.abrirConta("CC");
        pessoa2.depositar(1792.44f);
        pessoa2.pagarMensal();
        pessoa2.sacar(264.22f);
        pessoa2.sacar(1566.22f);
        pessoa2.fecharConta();

        System.out.println();

        pessoa1.estadoAtual();
        pessoa2.estadoAtual();

    }
}
