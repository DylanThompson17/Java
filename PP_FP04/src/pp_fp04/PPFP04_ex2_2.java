package pp_fp04;

import static java.lang.System.exit;//biblioteca usado para terminar o programa
import java.util.Scanner; //bibliotaca usado para fazer input
import pp_fp04.exchange.CurrencyRates;

/**
 * Classe onde foram testadas a maioria dos exercídos (de acordo com o enunciado)
 */
public class PPFP04_ex2_2 {

    static User user1;
    static CurrencyRates moeda;

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        user1.id[0] = 'A';
        user1.id[1] = 'B';
        user1.id[2] = 'C';
        user1.name = new char[]{'B', 'r', 'u', 'n', 'o'};
        user1.email = new char[]{'b', 'm', 'o', '@', 'e', 's', 't', 'g', 'f', '.', 'i', 'p',
            'p', '.', 'p', 't'};

        user1.expense.number1 = 10;
        user1.expense.number2 = 30;

        int n = 0, z = 0;// variáveis auxiliares
        float tCarro = 0, tComida = 0, total, media;
        
        for (int i = 0; i < 31; i++) {
            n++;

            try {
                
                do {
                    System.out.print("Despesa com o carro no dia " + n + " de março: ");
                    user1.expense.carValues[i] = ler.nextDouble();

                    if (user1.expense.carValues[i] < 0) {
                        z = 1;
                        System.out.println("O valor terá que ser maior ou igual a zero");
                    } else {
                        z = 0;
                        tCarro += user1.expense.carValues[i];
                    }

                } while (z == 1);
                
            } catch (Exception ex) {
                System.out.println("Valor inválido");
                System.out.println("PROGRAMA TERMINADO");
                exit(0);
            }

            if (i == 30) {
                n = 0;
            }
        }

        for (int i = 0; i < 31; i++) {
            n++;

            try {
                
                do {
                    System.out.print("Despesa alimentar no dia " + n + " de março: ");
                    user1.expense.foodValues[i] = ler.nextDouble();

                    if (user1.expense.foodValues[i] < 0) {
                        z = 1;
                        System.out.println("O valor terá que ser maior ou igual a zero");
                    } else {
                        z = 0;
                        tComida += user1.expense.foodValues[i];
                    }

                } while (z == 1);
                
            } catch (Exception ex) {
                System.out.println("Valor inválido");
                System.out.println("PROGRAMA TERMINADO");
                exit(0);
            }

            if (i == 30) {
                n = 0;
            }
        }

        System.out.println("\n----------------------User 1----------------------");
        System.out.print("ID: ");
        System.out.println(user1.id);
        System.out.print("Name: ");
        System.out.println(user1.name);
        System.out.print("Email: ");
        System.out.println(user1.email);
        System.out.println("\nDespesas com o automóvel no mês de março");
        System.out.println("Nº da despesa: " + user1.expense.number1);
        System.out.print("Descrição da despesa: ");
        System.out.println(user1.expense.descriptionCar);
        System.out.println();
        
        for(int i = 0; i < 31; i++) {
            n++;
            
            System.out.println("Despesa com o carro no dia " + n + " de março: " +
                    user1.expense.carValues[i] + "€");
            
            if (i == 30) {
                n = 0;
            }
        }
        
        System.out.println("\nDespesas alimentares no mês de março");
        System.out.println("Nº da despesa: " + user1.expense.number2);
        System.out.print("Descrição da despesa: ");
        System.out.println(user1.expense.descriptionFood);
        System.out.println();
        
        for(int i = 0; i < 31; i++) {
            n++;
            
            System.out.println("Despesa com a comida no dia " + n + " de março: " +
                    user1.expense.foodValues[i] + "€");
            
            if (i == 30) {
                n = 0;
            }
        }
        System.out.println();
        
        total = tCarro + tComida;
        media = total / 31;
        
        System.out.println("Total gasto com o automovóvel durante o mês de "
                + "março: " + tCarro + "€");
        System.out.println("Total gasto com a alimentação durante o mês de "
                + "março: " + tComida + "€");
        System.out.println("O user 1 gastou um total de " + total + "€ no mês de "
                + "março, uma média de " + media + "€ por dia.");
        
        /*
        Troque os comentários na classe CurrencyRates
        Deu erro, pois a os atributos da classe tem o modificador protected, e
        não podem ser acedidos fora do package, estão protegidos
        */
        System.out.println("\nGastos em moedas internacionais -> $");
        System.out.println("Total gasto com o automovóvel durante o mês de "
                + "março: " + tCarro * moeda.dolar + "$");
        System.out.println("Total gasto com a alimentação durante o mês de "
                + "março: " + tComida * moeda.dolar+ "$");
        System.out.println("O user 1 gastou um total de " + total * moeda.dolar +
                "$ no mês de março, uma média de " + media * + moeda.dolar 
                + "$ por dia.");
        
        System.out.println("\nGastos em moedas internacionais -> iene");
        System.out.println("Total gasto com o automovóvel durante o mês de "
                + "março: " + tCarro * moeda.iene + " iene");
        System.out.println("Total gasto com a alimentação durante o mês de "
                + "março: " + tComida * moeda.iene+ " iene");
        System.out.println("O user 1 gastou um total de " + total * moeda.iene + 
                " iene no mês de março, uma média de " + media * moeda.iene + 
                " iene por dia.");
        
        System.out.println("\nGastos em moedas internacionais -> libra");
        System.out.println("Total gasto com o automovóvel durante o mês de "
                + "março: " + tCarro * moeda.libra + " GBP");
        System.out.println("Total gasto com a alimentação durante o mês de "
                + "março: " + tComida * moeda.libra+ " GBP");
        System.out.println("O user 1 gastou um total de " + total * moeda.libra + 
                " GBP no mês de março, uma média de " + media * moeda.libra + 
                " GBP por dia.");
    }
}