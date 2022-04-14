package pp_fp03;

import java.util.Scanner;

/**
 * Versão do exercíco 5 para ser executado num IDE
 */
public class Ex_5_v2 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int valor = 0, opcao = 0;
        double dolar = 0, euro = 0;

        try {
            do {
                System.out.println("Converter de:");
                System.out.println("1 -> euro para dolar");
                System.out.println("2 -> dolar para euro");
                System.out.print("Opcão: ");
                opcao = ler.nextInt();

                if (opcao != 1 && opcao != 2) {
                    System.out.println("Opção inválida\n");
                }

            } while (opcao != 1 && opcao != 2);

            System.out.print("Insira o valor: ");
            valor = ler.nextInt();

            if (opcao == 1) {
                dolar = valor * 1.11;
                System.out.printf("%d€ valem %.2f$\n", valor, dolar);
            } else {
                euro = valor * 0.90;
                System.out.printf("%d$ valem %.2f€\n", valor, euro);
            }
        } catch (Exception ex) {
            System.out.println("Valores inválidos");
        }
    }
}