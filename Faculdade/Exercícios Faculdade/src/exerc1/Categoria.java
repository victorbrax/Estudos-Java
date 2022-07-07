package exerc1;

public class Categoria extends Produto {

    private String nomeCat;
    private int idCat;

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Categoria: "+getNomeCat());
        System.out.println("ID Categoria: "+getIdCat());
    }

    public String getNomeCat() {return nomeCat;}
    public void setNomeCat(String nomeCat) {this.nomeCat = nomeCat;}
    public int getIdCat() {return idCat;}
    public void setIdCat(int idCat) {this.idCat = idCat;}
}
