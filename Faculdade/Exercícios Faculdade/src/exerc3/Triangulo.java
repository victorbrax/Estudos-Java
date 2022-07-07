package exerc3;

public class Triangulo extends Poligono{

    private float lado1, lado2, lado3;

    @Override
    public void perimetro(double per){
        System.out.println("Perimetro do Triangulo");
    }
    @Override
    public void area(double are){
        System.out.println("Area do Triangulo");
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
    public float getLado3() {
        return lado3;
    }
    public void setLado3(float lado3) {
        this.lado3 = lado3;
    }
}
