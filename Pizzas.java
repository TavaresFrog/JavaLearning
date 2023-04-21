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

    public static Pizzas retornaPizzas(int idPizza) throws Exception {
        // para cada obj (pizza) da classe (Pizzas) que está dentro do array (pizzas)
        for (Pizzas pizza : pizzas) {
            if (pizza.idPizza == idPizza) {
                return pizza;
            }
        }
        throw new Exception("Pizza não existe.");
    }

    // func tranforma em pizza na pizza que usuario digitou o id e remove
    public static void deletarPizza(int idDeletarPizza) throws Exception {
        Pizzas pizza = retornaPizzas(idDeletarPizza);
        pizzas.remove(pizza);
    }
}
