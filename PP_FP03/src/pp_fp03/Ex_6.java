package pp_fp03;

/**
 * Programa para ser executado apartir de uma linha de comando
 * Entre na pasta onde este ficheiro se encontra apartir da linha de comando
 * Execute java nome do ficheiro (Ex_6.java) e o argumento
 * Exemplo: java Ex_6.java 325 (enter)
 */
public class Ex_6 {

    public static void main(String[] args) {
        
        int euros = 0, centimos = 0;
	try {
		euros = Integer.valueOf(args[0]) / 100;
		centimos =  Integer.valueOf(args[0]) % 100;
		System.out.println("Valor: " + args[0] + " cêntimos");
		System.out.println(euros + " euros e " + centimos + " cêntimos");
	} catch (Exception ex) {
		System.out.println("Valores inválidos");
	}
    }
}