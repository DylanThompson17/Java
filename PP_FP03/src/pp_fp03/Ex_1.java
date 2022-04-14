package pp_fp03;

public class Ex_1 {

    public static void main(String[] args) {

        //Exercício 1
        int[][] matriz = new int[3][3]; //declarando a matriz original
        int[][] matrizT = new int[3][3]; //declarando a matriz transposta

        // Inicializando a matriz original
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = j;
            }
        }

        //Inicializando a matriz transposta
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizT[i][j] = matriz[j][i];
            }
        }

        //Imprimindo a matriz original
        System.out.println("Matriz original");
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                if (i == 0 && j == 0) {
                    System.out.println("-------------");
                }
                if (j == 0) {
                    System.out.print("| ");
                }
                System.out.print(matriz[i][j] + " | ");
            }
            System.out.print("\n-------------");
            System.out.println();
        }

        //Imprimindo a matriz transposta
        System.out.println("\nMatriz transposta");
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                if (i == 0 && j == 0) {
                    System.out.println("-------------");
                }
                if (j == 0) {
                    System.out.print("| ");
                }
                System.out.print(matrizT[i][j] + " | ");
            }
            System.out.print("\n-------------");
            System.out.println();
        }
    }
}