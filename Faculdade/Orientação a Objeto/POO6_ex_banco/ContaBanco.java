package exemplo_POO6_banco;

public class ContaBanco {

    // Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    // Métodos
    public void abrirConta(String type){
        this.setTipo(type);
        this.setStatus(true);
        if (type == "CC"){
            this.setSaldo(50f); // Promoção do banco: Conta corrente inicia com 50 reais
            System.out.println("Conta aberta com sucesso.");
        }
        else if (type == "CP"){
            this.setSaldo(150f);  // Promoção do banco: Conta poupança inicia com 150 reais
            System.out.println("Conta aberta com sucesso.");
        }
    }

    public void fecharConta(){
        if (this.getSaldo() > 0){
            System.out.println("Conta com dinheiro, favor transferir antes.");
        }
        else if (this.getSaldo() < 0){
            System.out.println("Conta em débito, favor quitar faturas antes.");
        }
        else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso.");
        }
    }

    public void depositar(float v){
        if (this.getStatus() == true){
            setSaldo(getSaldo() + v);
            System.out.println("Depósito realizado com sucesso na conta de "+getDono());
        }
        else {
            System.out.println("Você não pode despositar dinheiro em uma conta inativa!");
        }
    }

    public void sacar(float saq){
        if (this.getStatus() == true){
            if(this.getSaldo() >= saq){
                this.setSaldo((this.getSaldo() - saq));
                System.out.println("Saque realizado com sucesso na conta de "+getDono());

            }
        }
        else {
            System.out.println("Impossível realizar a operação.");
        }
    }

    public void pagarMensal(){
        int taxa = 0;
        if (this.getTipo() == "CC"){
            taxa = 12;
        }
        else if (this.getTipo() == "CP"){
            taxa = 20;
        }
        if (this.getStatus() == true){
            if (getSaldo() >= taxa){
                setSaldo(getSaldo() - taxa);
            }
            else {
                System.out.println("Saldo insuficiente.");
            }
        }
        else {
            System.out.println("Impossível pagar a taxa de manutenção.");
        }

    }

    // Métodos Especiais

    public void estadoAtual(){
        System.out.println("--------------------------------");
        System.out.println("Conta: "+this.getNumConta());
        System.out.println("Dono: "+this.getDono());
        System.out.println("Tipo: "+this.getTipo());
        System.out.println("Saldo: "+this.getSaldo());
        System.out.println("Status: "+this.getStatus());
        System.out.println("--------------------------------");
    }

    public void ContaBanco(){
        this.saldo = 0;
        this.status = false;
    }

    public void setNumConta(int n){
        this.numConta = n;
    }

    public int getNumConta(){
        return this.numConta;
    }

    public void setTipo(String t){
        this.tipo = t;
    }

    public String getTipo(){
        return this.tipo;
    }

    public void setDono(String d){
        this.dono = d;
    }

    public String getDono(){
        return this.dono;
    }

    public void setSaldo(float s){
        this.saldo = s;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setStatus(boolean st){
        this.status = st;
    }

    public boolean getStatus(){
        return this.status;
    }


}
