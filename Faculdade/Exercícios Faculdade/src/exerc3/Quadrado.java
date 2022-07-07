package exerc3;

public class Quadrado extends Retangulo {

    private float lado1, lado2;

    @Override
    public void perimetro(double per){
        System.out.println("Perimetro do Retangulo");
    }
    @Override
    public void area(double are){
        System.out.println("Area do Retangulo");
    }

    public float getLado1() {
        return lado1;
    }
    public void setLado1(float lado1) {
        this.lado1 = lado1;
    }
    public float getLado2() {
        return lado2;
    }
    public void setLado2(float lado2) {
        this.lado2 = lado2;
    }
}
