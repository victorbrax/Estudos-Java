package exemplo_POO7_ENCAP_conremoto;

public class UsoControleRemoto {
    public static void main(String[] args) {

        ControleRemoto c1 = new ControleRemoto(); // Por padrão de fábrica, o controle já vem com o volume no 50, e sem ligar. Lembra?

        c1.ligar(); // deixa o ligado true
        c1.play(); // deixa o tocando true
        c1.maisVolume(); // aumenta 5 no volume
        c1.abrirMenu(); // mostra o status
        c1.fecharMenu();
    }

}
