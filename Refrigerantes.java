import java.util.ArrayList;

public class Refrigerantes {

    public int idRefrigerante;
    public String marca;
    public String tamanho;
    public Boolean zeroAcucar;
    public String sabor;

    public static ArrayList<Refrigerantes> refrigerantes = new ArrayList<Refrigerantes>();

    public Refrigerantes(int idRefrigerante, String marca, String tamanho, Boolean zeroAcucar, String sabor) {
        this.idRefrigerante = idRefrigerante;
        this.marca = marca;
        this.tamanho = tamanho;
        this.zeroAcucar = zeroAcucar;
        this.sabor = sabor;

        refrigerantes.add(this);
    }

}
