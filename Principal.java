import java.util.Scanner;
import java.util.List;

public class Principal {
    private static Scanner scanner = new Scanner(System.in);
    private static Cofrinho cofrinho = new Cofrinho();

    public static void main(String[] args) {
        int opcao;
        do {
            exibirMenu();
            opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    adicionarMoeda();
                    break;
                case 2:
                    removerMoeda();
                    break;
                case 3:
                    cofrinho.listarMoedas();
                    break;
                case 4:
                    calcularTotal();
                    break;
                case 5:
                    System.out.println("Obrigado por usar o Cofrinho! Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 5);
        
        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("\n=== MENU COFRINHO ===");
        System.out.println("1 - Adicionar moeda");
        System.out.println("2 - Remover moeda");
        System.out.println("3 - Listar moedas");
        System.out.println("4 - Calcular total convertido para Real");
        System.out.println("5 - Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void adicionarMoeda() {
        System.out.println("\n=== ADICIONAR MOEDA ===");
        System.out.println("Escolha o tipo de moeda:");
        System.out.println("1 - Real (BRL)");
        System.out.println("2 - Dólar (USD)");
        System.out.println("3 - Euro (EUR)");
        System.out.println("4 - Libra Esterlina (GBP)");
        System.out.println("5 - Iene (JPY)");
        System.out.println("6 - Peso Argentino (ARS)");
        System.out.println("7 - Franco Suíço (CHF)");
        
        int tipo = scanner.nextInt();
        System.out.print("Digite o valor: ");
        double valor = scanner.nextDouble();

        Moeda moeda = null;
        switch (tipo) {
            case 1:
                moeda = new Real(valor);
                break;
            case 2:
                moeda = new Dolar(valor);
                break;
            case 3:
                moeda = new Euro(valor);
                break;
            case 4:
                moeda = new LibraEsterlina(valor);
                break;
            case 5:
                moeda = new Iene(valor);
                break;
            case 6:
                moeda = new PesoArgentino(valor);
                break;
            case 7:
                moeda = new FrancoSuico(valor);
                break;
            default:
                System.out.println("Tipo de moeda inválido!");
                return;
        }

        cofrinho.adicionarMoeda(moeda);
    }

    private static void removerMoeda() {
        if (cofrinho.getMoedas().isEmpty()) {
            System.out.println("O cofrinho está vazio!");
            return;
        }

        System.out.println("\n=== REMOVER MOEDA ===");
        System.out.println("Moedas disponíveis:");
        
        List<Moeda> moedas = cofrinho.getMoedas();
        for (int i = 0; i < moedas.size(); i++) {
            System.out.println((i + 1) + " - " + moedas.get(i));
        }

        System.out.print("Escolha o número da moeda para remover: ");
        int indice = scanner.nextInt() - 1;

        if (indice >= 0 && indice < moedas.size()) {
            cofrinho.removerMoeda(moedas.get(indice));
        } else {
            System.out.println("Índice inválido!");
        }
    }

    private static void calcularTotal() {
        double total = cofrinho.calcularTotalConvertido();
        System.out.printf("\nTotal no cofrinho: R$ %.2f\n", total);
    }
} 