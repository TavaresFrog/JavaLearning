import java.util.Scanner;

import javax.print.attribute.PrintRequestAttribute;

public class Pizzaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int optionMenu = 0;
        do {
            System.out.println("=== Menu Pizzaria ===");

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
                    cadastraPizza();
                    break;
                case 2:
                    System.out.println("Listar Pizza");
                    break;
                case 3:
                    System.out.println("Cadastrar Refrigerante");
                    break;
                case 4:
                    System.out.println("Listar Refrigerante");
                    break;
            }
        } while (optionMenu != 0);
        scanner.close();
    }

    public static void cadastraPizza() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o ID da Pizza que você deseja cadastrar: ");
        int idPizza = scanner.nextInt();
        System.out.println("Digite o tamanho desejado: P = Pequena, M = Média, G = Grande e F = Família");
        String tamanho = scanner.next();
        tamanho.toUpperCase();
        switch (tamanho) {
            case "P":
                tamanho = "Pequena";
                break;
            case "M":
                tamanho = "Média";
                break;
            case "G":
                tamanho = "Grande";
                break;
            case "F":
                tamanho = "Família";
                break;
            default:
                System.out.println("Digite uma das opções válidas!");
                break;
        }
        System.out.println("Digite a quantidade de sabores: ");
        int qntSabores = scanner.nextInt();
        System.out.println("Digite o(s) sabor(es) desejado: ");
        for (int i = 0; i < qntSabores; i++) {
            String[] sabores = new String[qntSabores];
            sabores[i] = scanner.next();
        }
        System.out.println("Você gostaria de qual tipo de borda? ");
        System.out.println("[1] Borda sem recheio.");
        System.out.println("[2] Borda de Catupiry.");
        System.out.println("[3] Borda de Cheddar.");
        System.out.println("[4] Borda de Chocolate.");
        System.out.println("[5] Borda de Doce de Leite.");
        System.out.println("[6] Borda de Dois Amores.");
        String borda = scanner.next();
        switch (borda) {
            case "1":
                borda = "Sem recheio";
                break;
            case "2":
                borda = "Catupiry";
                break;
            case "3":
                borda = "Cheddar";
                break;
            case "4":
                borda = "Chocolate";
                break;
            case "5":
                borda = "Doce de leite";
                break;
            case "6":
                borda = "Dois Amores";
            default:
                System.out.println("Opção inválida");
                break;
        }
        System.out.println("Digite qual massa você deseja: ");
        System.out.println("[1] Tradicional");
        System.out.println("[2] Integral");
        System.out.println("[3] De arroz");
        System.out.println("[4] Sem glúten");
        String massa = scanner.next();
        switch (massa) {
            case "1":
                massa = "Tradicional";
                break;
            case "2":
                massa = "Integral";
                break;
            case "3":
                massa = "De arroz";
                break;
            case "4":
                massa = "Sem glúten";
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
        System.out.println("Pizza cadastrada com sucesso!");
        scanner.close();
    }

}