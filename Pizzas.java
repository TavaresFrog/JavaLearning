import java.util.ArrayList;

public class Pizzas {

    public int idPizza;
    public String tamanho;
    public Integer qntSabores;
    public String[] sabores;
    public String borda;
    public String massa;

    public static ArrayList<Pizzas> pizzas = new ArrayList<Pizzas>();

    public Pizzas(int idPizza, String tamanho, Integer qntSabores, String[] sabores, String borda, String massa) {
        this.idPizza = idPizza;
        this.tamanho = tamanho;
        this.qntSabores = qntSabores;
        this.sabores = sabores;
        this.borda = borda;
        this.massa = massa;

        pizzas.add(this);
    }
}
