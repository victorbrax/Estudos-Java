package exerc3;

public class Pentagono extends Poligono {

    private float lado1, lado2, lado3, lado4, lado5;

    @Override
    public void perimetro(double per) {
        System.out.println("Perimetro do Poligono");
    }

    @Override
    public void area(double are) {
        System.out.println("Area do Poligono");
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
    public float getLado4() {
        return lado4;
    }
    public void setLado4(float lado4) {
        this.lado4 = lado4;
    }
    public float getLado5() {
        return lado5;
    }
    public void setLado5(float lado5) {
        this.lado5 = lado5;
    }
}
