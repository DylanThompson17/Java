import static java.lang.System.exit;

/**
 * Programa para ser executado apartir de uma linha de comando
 * Entre na pasta onde este ficheiro se encontra apartir da linha de comando
 * Execute java nome do ficheiro (Ex_7_v2.java) e o argumento
 * Exemplo: java Ex_7_v2.java 34 7 (enter)
 * OBS: não funciona corretamente para argumentos negativos
*/
public class Ex_7_v2 {

	public static void main(String args[]) {
	
		int dividendo = 0, divisor = 0, quociente = 0;
		
		try {
			//O primeiro argumento passado correnponde ao dividendo
			dividendo = Integer.valueOf(args[0]);

			//O segundo argumento passado correnponde ao divisor
			divisor = Integer.valueOf(args[1]);
			if (divisor == 0) {
				System.out.println("Não se pode dividir por zero");
				exit(0);
			}

			// uma variável auxiliar para ajudar no cálculo
			int n = dividendo;

			while (dividendo >= divisor) {
				dividendo -= divisor;
				quociente++;
			}

			System.out.printf("A divisão inteira de %d por %d é %d, com o resto %d\n", n, divisor, quociente, dividendo);

		} catch (Exception ex) {
			System.out.println("Os valores terão que ser inteiros");
		}
	}
}
