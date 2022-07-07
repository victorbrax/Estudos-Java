package exemplo_POO10_HENRANCA;

public class Trabalho {

    private float salario;
    private String funcao;
    private boolean trabalhando;

    public Trabalho(float salario, String funcao, boolean trabalhando) {
        this.salario = salario;
        this.funcao = funcao;
        this.trabalhando = trabalhando;
    }

    public void recAumento(float aum){
        setSalario(getSalario() + aum);
    }

    public void demissao(){
        if (isTrabalhando()){
           setTrabalhando(false);
        }
        else{
            System.out.println("Essa pessoa já não tem emprego.");
        }
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
}
