import java.util.Scanner;

import javax.print.attribute.PrintRequestAttribute;

public class Pizzaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int optionMenu = 0;
        do {
            System.out.println("\n=== Menu Pizzaria ===");

            System.out.println("+-------------------------------------------------------+");
            System.out.println("| 1 - Cadastrar Pizza                                   |");
            System.out.println("| 2 - Listar Pizza                                      |");
            System.out.println("| 3 - Cadastrar Refrigerante                            |");
            System.out.println("| 4 - Listar Refrigerante                               |");
            System.out.println("| 0 - Sair da aplicação                                 |");
            System.out.println("+-------------------------------------------------------+");

            System.out.println("Digite a opção desejada: ");

            try {
                optionMenu = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Opção inválida");
            }

            switch (optionMenu) {

                case 1:
                    System.out.println("Cadastrar Pizza");
                    cadastraPizza(scanner);
                    break;
                case 2:
                    System.out.println("Listar Pizza");
                    listarPizzas();
                    break;
                case 3:
                    System.out.println("Cadastrar Refrigerante");
                    cadastraRefrigerante(scanner);
                    break;
                case 4:
                    System.out.println("Listar Refrigerante");
                    listarRefrigerantes();
                    break;
            }
        } while (optionMenu != 0);
        scanner.close();
    }

    public static void cadastraPizza(Scanner scanner) {

        System.out.println("Digite o ID da Pizza que você deseja cadastrar: ");
        int idPizza = scanner.nextInt();

        Boolean opValidaTamanho = false;

        String tamanho = "";
        while (!opValidaTamanho) {
            System.out.println("Digite o tamanho desejado: P = Pequena, M = Média, G = Grande e F = Família");
            tamanho = scanner.next();
            tamanho = tamanho.toUpperCase();
            switch (tamanho) {
                case "P":
                    tamanho = "Pequena";
                    opValidaTamanho = true;
                    break;
                case "M":
                    tamanho = "Média";
                    opValidaTamanho = true;
                    break;
                case "G":
                    tamanho = "Grande";
                    opValidaTamanho = true;
                    break;
                case "F":
                    tamanho = "Família";
                    opValidaTamanho = true;
                    break;
                default:
                    System.out.println("Digite uma das opções válidas!");
                    break;
            }
        }
        int qntSabores = 0;
        while (qntSabores < 1 || qntSabores > 6) {
            System.out.println("Digite a quantidade de sabores: ");
            qntSabores = scanner.nextInt();
        }
        System.out.println("Digite o(s) sabor(es) desejado: ");
        String[] sabores = new String[qntSabores];
        scanner.nextLine();
        for (int i = 0; i < qntSabores; i++) {
            System.out.println("[" + (i + 1) + "°] Sabor: ");
            sabores[i] = scanner.nextLine();
        }
        boolean opValidaBorda = false;
        String borda = "";
        while (!opValidaBorda) {
            System.out.println("Você gostaria de qual tipo de borda? (Apenas uma) ");
            System.out.println("[1] Borda sem recheio.");
            System.out.println("[2] Borda de Catupiry.");
            System.out.println("[3] Borda de Cheddar.");
            System.out.println("[4] Borda de Chocolate.");
            System.out.println("[5] Borda de Doce de Leite.");
            System.out.println("[6] Borda de Dois Amores.");
            borda = scanner.next();
            switch (borda) {
                case "1":
                    borda = "Sem recheio";
                    opValidaBorda = true;
                    break;
                case "2":
                    borda = "Catupiry";
                    opValidaBorda = true;
                    break;
                case "3":
                    borda = "Cheddar";
                    opValidaBorda = true;
                    break;
                case "4":
                    borda = "Chocolate";
                    opValidaBorda = true;
                    break;
                case "5":
                    borda = "Doce de leite";
                    opValidaBorda = true;
                    break;
                case "6":
                    borda = "Dois Amores";
                    opValidaBorda = true;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
        boolean opValidaMassa = false;
        String massa = "";
        while (!opValidaMassa) {
            System.out.println("Digite qual massa você deseja: ");
            System.out.println("[1] Tradicional");
            System.out.println("[2] Integral");
            System.out.println("[3] De arroz");
            System.out.println("[4] Sem glúten");
            massa = scanner.next();
            switch (massa) {
                case "1":
                    massa = "Tradicional";
                    opValidaMassa = true;
                    break;
                case "2":
                    massa = "Integral";
                    opValidaMassa = true;
                    break;
                case "3":
                    massa = "De arroz";
                    opValidaMassa = true;
                    break;
                case "4":
                    massa = "Sem glúten";
                    opValidaMassa = true;
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
        Pizzas pizza = new Pizzas(idPizza, tamanho, qntSabores, sabores, borda, massa);
        System.out.println("Pizza cadastrada com sucesso!");

    }

    public static void listarPizzas() {
        if (Pizzas.pizzas != null) {
            for (Pizzas pizza : Pizzas.pizzas) {
                System.out.println("\nId: " + pizza.idPizza);
                System.out.println("\nTamanho: " + pizza.tamanho);
                System.out.println("\nQuantidade de sabores: " + pizza.qntSabores);
                System.out.println("\nSabores: ");
                for (String sabor : pizza.sabores) {
                    System.out.println(sabor);
                }
                System.out.println("Borda: " + pizza.borda);
                System.out.println("Massa: " + pizza.massa);
            }

        } else {
            System.out.println("Você não tem pizzas casdastradas!");
        }
    }

    public static void cadastraRefrigerante(Scanner scanner) {
        System.out.println("Digite o ID do Refrigerante");
        int idRefrigerante = scanner.nextInt();

        // String zeroAcucar = "";
        System.out.println("Você deseja seu refrigerante zero açucar? Digite Sim ou Nao");
        String zeroAcucar = scanner.next();
        zeroAcucar = zeroAcucar.toUpperCase();
        String marca = "";
        boolean opValidaMarca = false;
        if (zeroAcucar.equals("NAO")) {

            while (!opValidaMarca) {
                System.out.println("Escolha entre estas marcas de refrigerante: ");
                System.out.println("[1] Coca-cola");
                System.out.println("[2] Pepsi Twist");
                System.out.println("[3] Pepsi");
                System.out.println("[4] Fanta Laranja");
                System.out.println("[5] Fanta Uva");
                System.out.println("[6] Guaraná");
                System.out.println("[7] Laranjinha");
                marca = scanner.next();
                switch (marca) {
                    case "1":
                        marca = "Coca-cola";
                        opValidaMarca = true;
                        break;
                    case "2":
                        marca = "Pepsi Twist";
                        opValidaMarca = true;
                        break;
                    case "3":
                        marca = "Pepsi";
                        opValidaMarca = true;
                        break;
                    case "4":
                        marca = "Fanta Laranja";
                        opValidaMarca = true;
                        break;
                    case "5":
                        marca = "Fanta Uva";
                        opValidaMarca = true;
                        break;
                    case "6":
                        marca = "Guaraná";
                        opValidaMarca = true;
                        break;
                    case "7":
                        marca = "Laranjinha";
                        opValidaMarca = true;
                        break;
                    default:
                        System.out.println("Opção Inválida! Escolha entre as marcas que temos!");
                        break;
                }
            }
        } else if (zeroAcucar.equals("SIM")) {

            while (!opValidaMarca) {
                System.out.println("Escolha entre estas marcas de refrigerante zero açucar: ");
                System.out.println("[1] Coca-cola Zero");
                System.out.println("[2] Pepsi Zero");
                System.out.println("[3] Guaraná Zero");
                marca = scanner.next();
                switch (marca) {
                    case "1":
                        marca = "Coca-cola Zero";
                        opValidaMarca = true;
                        break;
                    case "2":
                        marca = "Pepsi Zero";
                        opValidaMarca = true;
                        break;
                    case "3":
                        marca = "Guaraná Zero";
                        opValidaMarca = true;
                        break;
                }
            }
        } else {
            System.out.println("Opção não é valida.");
        }

        boolean opValidaTamanho = false;
        String tamanho = "";
        while (!opValidaTamanho) {

            System.out.println("Escolha o tamanho do refrigerante: ");
            System.out.println("[1] Lata (300mL)");
            System.out.println("[2] Garrafa (600mL)");
            System.out.println("[3] Garrafa (1,5L)");
            System.out.println("[4] Garrafa (2L)");
            System.out.println("[5] Garrafa (3L)");
            tamanho = scanner.next();
            switch (tamanho) {
                case "1":
                    tamanho = "Lata (300mL)";
                    opValidaTamanho = true;
                    break;
                case "2":
                    tamanho = "Garrafa (600mL)";
                    opValidaTamanho = true;
                    break;
                case "3":
                    tamanho = "Garrafa (1,5L)";
                    opValidaTamanho = true;
                    break;
                case "4":
                    tamanho = "Garrafa (2L)";
                    opValidaTamanho = true;
                    break;
                case "5":
                    tamanho = "Garrafa (3L)";
                    opValidaTamanho = true;
                    break;
                default:
                    System.out.println("Opção Inválida! Escolha entre so tamanhos que temos!");
                    break;
            }
        }

        Refrigerantes refrigerante = new Refrigerantes(idRefrigerante, zeroAcucar, marca, tamanho);
    }

    public static void listarRefrigerantes() {
        if (Refrigerantes.refrigerantes != null) {
            for (Refrigerantes refrigerante : Refrigerantes.refrigerantes) {
                System.out.println("\nId: " + refrigerante.idRefrigerante);
                System.out.println("\nMarca: " + refrigerante.marca);
                System.out.println("\nTamanho: " + refrigerante.tamanho);
            }

        } else {
            System.out.println("Você não tem refrigerantes casdastrados!");
        }
    }
}