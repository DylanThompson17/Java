package pp_fp03;

public class Ex_2 {

    public static void main(String[] args) {

        //Exercício 2
        int[] vetor = new int[]{4, 32, 54, 97, 45, 5, 7, 13, 2, 9, 73, 88, 1, 0,
            -4, -32, -54, -97, -45, -5, -7, -13, -2, -9, -73, -88, -1, 6, 28, 
            8128, -8128, 33550336};

        //Imprimindo todos os elementos do vetor
        for (int i = 0; i < vetor.length; i++) {

            if (i == 0) {
                System.out.println("Todos os elementos do vetor: ");
            }

            System.out.print(vetor[i] + " | ");

            if (i == vetor.length - 1) {
                System.out.println("\n");
            }
        }

        //Imprimindo os números não primos do vetor
        for (int i = 0; i < vetor.length; i++) {

            if (i == 0) {
                System.out.println("Números não primos no vetor: ");
            }

            if (vetor[i] == 0 || vetor[i] == 1 || vetor[i] == -1) {
                System.out.print(vetor[i] + " | ");
            } else {
                
                for (int j = 2; j < vetor[i]; j++) {

                    if (vetor[i] % j == 0) {
                        System.out.print(vetor[i] + " | ");
                        break;
                    }
                }

                for (int j = -2; j > vetor[i]; j--) {

                    if (vetor[i] % j == 0) {
                        System.out.print(vetor[i] + " | ");
                        break;
                    }
                }
            }

            if (i == vetor.length - 1) {
                System.out.println();
            }
        }

        //Imprimindo os números primos do vetor
        for (int i = 0; i < vetor.length; i++) {

            int primo = 0;

            if (i == 0) {
                System.out.println("\nNúmeros primos no vetor: ");
            }

            if (vetor[i] == 0 || vetor[i] == 1 || vetor[i] == -1) {
                primo = 1;
            } else {
                
                for (int j = 2; j < vetor[i]; j++) {

                    if (vetor[i] % j == 0) {
                        primo = 1;
                        break;
                    }
                }

                for (int j = -2; j > vetor[i]; j--) {

                    if (vetor[i] % j == 0) {
                        primo = 1;
                        break;
                    }
                }
            }

            if (primo != 1) {
                System.out.print(vetor[i] + " | ");
            }

            if (i == vetor.length - 1) {
                System.out.println("\n");
            }
        }
        
        //Imprimindo os números perfeitos
        for (int i = 0; i < vetor.length; i++) {
            
            int perfeito = 0;
            
            if (i == 0) {
                System.out.println("Números perfeitos no vetor:");
            }
            
            for (int j = 0; j < vetor[i]; j++) {
                
                try {
                    if (vetor[i] % j == 0) {
                        perfeito += j;
                    }
                } catch (Exception ex) {}
            }
            
            if(perfeito == vetor[i]) {
                System.out.print(vetor[i] + " | ");
            }
            
            if (i == vetor.length - 1) {
                System.out.println();
            }
        }
    }
}