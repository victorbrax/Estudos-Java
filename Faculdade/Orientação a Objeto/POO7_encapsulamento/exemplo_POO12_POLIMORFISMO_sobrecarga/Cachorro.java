package exemplo_POO7_ENCAP_conremoto.exemplo_POO12_POLIMORFISMO_sobrecarga;

public class Cachorro {

    public boolean isDono() {
        return dono;
    }

    public void setDono(boolean dono) {
        this.dono = dono;
    }

    private boolean dono;

    public void reagir (String frase){
        if(frase=="Te amo"){
            System.out.println("Abanar o rabo");
        }
        else{
            System.out.println("Sai daqui meu");
        }
    }

    public void reagir (int hora, int min){
        if(hora<12 && min<30){
            System.out.println("Ficar de boa");
        }
        else{
            System.out.println("Uivar");
        }
    }

    public void reagir (boolean don){
        if(isDono()){
            System.out.println("Abanar o rabo e latir");
        }
        else{
            System.out.println("Rosnar");
        }
    }

}
