package pp_fp03;

import java.util.Scanner;

/**
 * Versão 2 do exercício 6
 * Pode executar apartir de um IDE (ex: NetBeans)
 */
public class Ex_6_v2 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        int euros = 0, centimos = 0, valor = 0;
        
	try {
            System.out.print("Insira o valor em cêntimos: ");
            valor = ler.nextInt();
		euros = valor / 100;
		centimos =  valor % 100;
		System.out.println("Valor: " + valor + " cêntimos");
		System.out.println(euros + " euros e " + centimos + " cêntimos");
	} catch (Exception ex) {
		System.out.println("Valores inválidos");
	}
    }
}