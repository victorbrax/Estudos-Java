package exerc3;

public class Poligono {

    private int numVertices;
    private int vertices[];

    public void perimetro(double per){

        System.out.println("Calculando vertices...");
    }
    public void area(double are){

        System.out.println("Calculando area...");

    }
    public void desenha(){

        System.out.println("Desenhando...");

    }

    public int getNumVertices() {
        return numVertices;
    }
    public void setNumVertices(int numVertices) {
        this.numVertices = numVertices;
    }
    public int[] getVertices() {
        return vertices;
    }
    public void setVertices(int[] vertices) {
        this.vertices = vertices;
    }
}
