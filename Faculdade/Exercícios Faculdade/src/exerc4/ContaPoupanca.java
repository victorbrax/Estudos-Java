package exerc4;

public final class ContaPoupanca extends Banco {

    public float TaxaADM = 3.90f;
    public float incentivo = 1.25f;


    public void status(){
        System.out.println("Saldo: "+getSaldo());
        System.out.println("Tipo de Conta: Poupança ");
        System.out.println("Taxa Administrativa: "+TaxaADM);
        System.out.println("Acréscimo de Incentivo: "+incentivo);
        System.out.println("========================================================");
        System.out.println();
    }

    @Override
    public void Sacar(float valor) {
        if(getSaldo() < valor){
            System.out.println("Você não tem dinheiro suficiente para o saque.");
        }
        else{
            setSaldo(getSaldo() - (valor + TaxaADM));
            System.out.println("Sacado com sucesso, seu novo saldo é: "+getSaldo());
            System.out.println("Encerrando.");
        }
    }
    @Override
    public void depositar(float valor){
        setSaldo(getSaldo() + (valor + incentivo));
        System.out.println("Depositado com sucesso, seu novo saldo é: "+getSaldo());
        System.out.println("Encerrando.");
    }

    @Override
    public int getTipo() {
        return tipo;
    }

    @Override
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
}
