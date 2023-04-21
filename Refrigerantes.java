import java.util.ArrayList;

public class Refrigerantes {

    public int idRefrigerante;
    public String zeroAcucar;
    public String marca;
    public String tamanho;

    public static ArrayList<Refrigerantes> refrigerantes = new ArrayList<Refrigerantes>();

    public Refrigerantes(int idRefrigerante, String zeroAcucar, String marca, String tamanho) {
        this.idRefrigerante = idRefrigerante;
        this.zeroAcucar = zeroAcucar;
        this.marca = marca;
        this.tamanho = tamanho;

        refrigerantes.add(this);
    }

}
