package exerc3;

public class ProgramaPrincipal {

    public static void main(String[] args) {

        Poligono p1 = new Poligono();
        Quadrado q1 = new Quadrado();
        Triangulo t1 = new Triangulo();
        Retangulo r1 = new Retangulo();

        r1.perimetro(27);
        q1.area(57.4f);
        t1.desenha();

    }

}
