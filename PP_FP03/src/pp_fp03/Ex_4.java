package pp_fp03;

import static java.lang.Math.PI;
import static java.lang.System.exit;
import java.util.Scanner;

/**
 * Versão do exercício 4 para ser executado num IDE
 */
public class Ex_4 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        double graus = 0, radiano;
        try {
            System.out.print("Insira o valor da temperatura em graus (°): ");
            graus = ler.nextDouble();
        } catch (Exception ex) {
            System.out.println("Valor inválido");
            exit(0);
        }
        
        radiano = graus * (PI/180);
        System.out.printf("%.1f° vale a %.4f rad\n", graus, radiano);
    }  
}