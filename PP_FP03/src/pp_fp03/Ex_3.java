package pp_fp03;

public class Ex_3 {

    public static void main(String[] args) {
        
        int[][] matriz = new int[4][3];//Declarando a matriz
        
        //Inicializando a matriz
        matriz[0][0] = 4; matriz[0][1] = 29; matriz[0][2] = 21; matriz[1][0] = 7;
        matriz[1][1] = 2; matriz[1][2] = 2; matriz[2][0] = 15; matriz[2][1] = 2;
        matriz[2][2] = 32; matriz[3][0] = 16; matriz[3][1] = 10;
        matriz[3][2] = 11;
        
        //Imprimindo a matriz
        for (int i = 0; i < 4; i++) {
            
            for (int j = 0; j < 3; j++) {
                
                if (i == 0 && j == 0) {
                    System.out.println("---------------");
                }
                if (j == 0) {
                    System.out.print("| ");
                }
                System.out.print(matriz[i][j] + " | ");
            }
            System.out.println("\n----------------");
        }
        
        //Determinando maior e menor valor de cada linha da matriz
        int maior = matriz[0][0], menor = matriz[0][0];
        
        for (int i = 0; i < 4; i++) {
            int n = i;
            
            for (int j = 0; j < 3; j++) {
                
                if (j == 0) {
                    maior = matriz[i][j];
                    menor = matriz[i][j];
                }
                
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
                
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
            
            n++;
            System.out.println("Maior número da " + n + "ª linha da matriz: " 
                    + maior);
            System.out.println("Menor número da " + n + "ª linha da matriz: " +
                    menor);
            System.out.println();
        }
        
        //Determinando o valor que mais se repete na matriz
    }
}