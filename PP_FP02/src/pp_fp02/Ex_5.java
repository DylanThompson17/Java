/**
 * Versão do exercício 5 para ser executado pelo terminal
 * Vá até a pasta onde se encontra este ficheiro apartir do terminal
 * Execute java Ex_5.java nome apelido 
 * Ex: java Ex_5.java Zé Mané
 */
public class Ex_5 {

	public static void main(String[] args) {
		try {
			System.out.println("Surname: " + args[1]);
			System.out.println("Name: " + args[0]);
		} catch (Exception ex) {
			System.out.println("Não foram inseridos dados");
		}
	}
}
