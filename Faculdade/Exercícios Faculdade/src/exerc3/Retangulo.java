package exerc3;

public class Retangulo extends Poligono{

    public float tamanhoX;
    public float tamanhoY;

    @Override
    public void perimetro(double per){
        System.out.println("Perimetro do Retangulo");
    }
    @Override
    public void area(double are){
        System.out.println("Area do Retangulo");
    }

    public float getTamanhoX() {
        return tamanhoX;
    }
    public void setTamanhoX(float tamanhoX) {
        this.tamanhoX = tamanhoX;
    }
    public float getTamanhoY() {
        return tamanhoY;
    }
    public void setTamanhoY(float tamanhoY) {
        this.tamanhoY = tamanhoY;
    }
}
