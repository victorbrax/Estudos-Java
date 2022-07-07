package exemplo_POO10_HENRANCA2;

public final class Bolsista extends Aluno{ // o final e quando vc nao quer que a classe tenha filhos, em metodos
    // o final e quando vc quer que ele nao seja sobreposto

    private float bolsa;

    public void renovarBolsa() {
        System.out.println("Renovando bolsa de: "+this.getNome());

    }

    @Override // importante conceito: o Override sobrepoe o metodo da classe mae, obs: o aluno paga mensalidade e o
    // bolsista tbm, mas a mensalidade do bolsista SOBREPOE a do aluno.
    public void pagarMensalidade(){
        System.out.println(this.getNome()+" é bolsista, Pagamento facilitado.");

    }
}
