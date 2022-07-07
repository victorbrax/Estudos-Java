package exerc5;

public class Soma {

    public int n1, n2;

    public int soma(int value1, int value2){
        this.n1 = value1;
        this.n2 = value2;
        return this.n1 + this.n2;
    }

    public String soma(String value1, String value2){
        int SomaFinal = (Integer.parseInt(value1) + (Integer.parseInt(value2)));
        String escrita = "A soma dos números é: "+SomaFinal;
        return escrita;
    }

    public double soma(double value1, double value2){
        double SomaFinal = Double.parseDouble(String.valueOf(value1)) + Double.parseDouble(String.valueOf(value2));
        return SomaFinal;
    }








}
