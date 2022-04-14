package pp_fp03;

import static java.lang.System.exit;
import java.util.Scanner;

/**
 * Versão do exercício 7 para ser executado num IDE
 * OBS: não funciona corretamente para valores negativos
 */
public class Ex_7 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int dividendo = 0, divisor = 0, quociente = 0;

        try {
            //Obtendo o valor do dividendo
            System.out.print("Insira o valor do dividendo: ");
            dividendo = ler.nextInt();

            //Obtendo o valor do divisor
            System.out.print("Insira o valor do divisor: ");
            divisor = ler.nextInt();
            
            if (divisor == 0) {
                System.out.println("Não se pode dividir por zero");
                exit(0);
            }

            int n = dividendo;

            while (dividendo >= divisor) {
                dividendo -= divisor;
                quociente++;
            }

            System.out.printf("A divisão inteira de %d por %d é %d, com o resto %d\n"
                    + "", n, divisor, quociente, dividendo);

        } catch (Exception ex) {
            System.out.println("Os valores terão que ser inteiros");
        }
    }
}