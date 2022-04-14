/**
 * Programa para ser executado apartir de uma linha de comando
 * Entre na pasta onde este ficheiro se encontra apartir da linha de comando
 * Execute java nome do ficheiro (Ex_5.java) e o argumento
 * Exemplo: java Ex_5.java 3465 d (enter)
 */
public class Ex_5 {

    public static void main(String[] args) {

        int valor = 0;
        double dolar = 0, euro = 0;
        
        //System.out.println("Argumento 1: " + args[0] + ", argumento 2: " + args[1]);
        
        try {
            
            if (args[1].equals("e")) {
                System.out.println("Valor inserido em euro");
                valor = Integer.valueOf(args[0]);
                dolar = valor * 1.11;
                System.out.printf("%d€ valem %.2f$\n", valor, dolar);
                
            } else if (args[1].equals("d")) {
                System.out.println("Valor inserido em dolar");
                valor = Integer.valueOf(args[0]);
                euro = valor * 0.90;
                System.out.printf("%d$ valem %.2f€\n", valor, euro);
            }
            
        } catch (Exception ex) {
            System.out.println("Valores inválidos");
        }
    }
}