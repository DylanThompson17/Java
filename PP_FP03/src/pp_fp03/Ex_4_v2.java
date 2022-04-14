import static java.lang.System.exit;
import static java.lang.Math.PI;

/**
 * Programa para ser executado apartir de uma linha de comando
 * Entre na pasta onde este ficheiro se encontra apartir da linha de comando
 * Execute java nome do ficheiro (Ex_4_v2.java) e o argumento
 * Exemplo: java Ex_4_v4.java 54 (enter)
 */
public class Ex_4_v2 {

	public static void main(String[] args) {

		double graus = 0, radiano = 0;
		
		try {
			System.out.println("Valor em radiano: " + args[0]);
			graus = Integer.valueOf(args[0]);
			radiano = graus * (PI/180);
		} catch (Exception ex) {
			System.out.println("Valor inválido");
			exit(0);
		}
		System.out.printf("%.1f° vale a %.4f rad\n", graus, radiano);
	}
}
