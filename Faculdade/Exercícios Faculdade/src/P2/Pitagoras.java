package p2java;

public class Pitagoras extends Trigonometria {

    @Override
    public final double calcula_Trigonometria(double catad, double catop){
        double hipt = (catad*catad) + (catop*catop);
        double resultado = Math.sqrt(hipt);
        return resultado;
    }
}
