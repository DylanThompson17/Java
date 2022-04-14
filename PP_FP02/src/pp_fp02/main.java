package pp_fp02;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        // Ex_1
        System.out.println("\n\nExecício 1\n");
        char[] aluno = {'e', 'u', ' ', 's', 'o', 'u', ' ', 'a', 'l', 'u', 'n',
            'o', ' ', 'd', 'a', ' ', 'E', 'S', 'T', 'G', '.', '\n'};
        System.out.println(aluno.length);
        for (int i = 0; i < aluno.length; i++) {
            System.out.print(aluno[i]);
        }

        // Ex_2
        System.out.println("\n\nExecício 2\n");
        int[][] matriz = new int[3][3];
        float soma = 0, media;
        int divisor = 0;
        matriz[0][0] = 11;
        matriz[0][1] = 7;
        matriz[0][2] = 333;
        matriz[1][0] = -20;
        matriz[1][1] = -23;
        matriz[1][2] = 63;
        matriz[2][0] = -22;
        matriz[2][1] = 501;
        matriz[2][2] = 10000;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " | ");
                soma += matriz[i][j];
                divisor++;
            }
            System.out.println();
        }
        media = soma / divisor;
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);

        // Ex_3
        System.out.println("\n\nExecício 3\n");
        int[] lista = {12, 5, -21, 10, -345, 22, 50, -125, 80, -1};
        float multiplicacao = 1;
        int nNegativos = 0, maior = lista[0];

        for (int i = 0; i < lista.length; i++) {

            if (lista[i] > 0) {
                // multiplicacao = multiplicacao * lista[i];
                multiplicacao *= lista[i];
            }
            if (lista[i] < 0) {
                nNegativos++;
            }
            if (lista[i] > maior) {
                maior = lista[i];
            }
        }
        System.out.println("Multiplicação de todos os elementos positivos " + multiplicacao);
        System.out.println("Número de elementos negativos: " + nNegativos);
        System.out.println("Maior número: " + maior);

        // Ex_4
        System.out.println("\n\nExecício 4\n");
        char[] nome = {'A', 'n', 'a', ' ', 'S', 'a', 'n', 't', 'o', 's', '\n'};
        //char[] nome = {'N','o','m','e',' ','A','p','e','l','i','d','o','\n'};
        int vogais = 0, constantes = 0;

        for (int i = 0; i < nome.length; i++) {

            if (nome[i] == ' ') {

                for (int j = i + 1; j < nome.length; j++) {
                    if (nome[j] != '\n') {
                        System.out.print(nome[j]);
                    } else {
                        System.out.print(" ");
                    }
                }

                for (int j = 0; j < i; j++) {
                    System.out.print(nome[j]);
                }
            }

            if (nome[i] == 'A' || nome[i] == 'E' || nome[i] == 'I'
                    || nome[i] == 'O' || nome[i] == 'U' || nome[i] == 'a'
                    || nome[i] == 'e' || nome[i] == 'i' || nome[i] == 'o'
                    || nome[i] == 'u') {
                vogais++;
            } else if (nome[i] == '\n' || nome[i] == ' ') {

            } else {
                constantes++;
            }
        }
        System.out.println("\nNúmero de vogais: " + vogais);
        System.out.println("Número de constantes: " + constantes);

        // Ex_5 -> Versão para IDE
        System.out.println("\n\nExecício 5\n");
        String name, surName;
        System.out.print("Enter your name: ");
        name = ler.nextLine();
        System.out.print("Enter your surname: ");
        surName = ler.nextLine();
        System.out.println("Surname: " + surName);
        System.out.println("Name: " + name);

        // Ex_6
        System.out.println("\n\nExecício 6\n");
        int[] listaA = {2, -5, -121, 102, -35, -2, 0, -125, 802, -10};
        int[] listaB = {6, 99, -1, 12, 1, -2, -5};

        int[] listaC = new int[listaA.length + listaB.length];
        int j = 0, repetidos = 0;

        // Obtendo array listaC
        for (int i = 0; i < listaC.length; i++) {

            if (i < listaA.length) {
                listaC[i] = listaA[i];
            } else {
                listaC[i] = listaB[j];
                j++;
            }
        }

        // Imprimir o array listaA
        for (int i = 0; i < listaA.length; i++) {

            if (i == 0) {
                System.out.print("Vetor dos elementos da listaA:\n[");
                System.out.print(listaA[i] + ", ");
            } else if (i == listaA.length - 1) {
                System.out.println(listaA[i] + "]");
            } else {
                System.out.print(listaA[i] + ", ");
            }
        }

        // Imprimir o array listaB
        for (int i = 0; i < listaB.length; i++) {

            if (i == 0) {
                System.out.print("\nVetor dos elementos da listaB:\n[");
                System.out.print(listaB[i] + ", ");
            } else if (i == listaB.length - 1) {
                System.out.println(listaB[i] + "]");
            } else {
                System.out.print(listaB[i] + ", ");
            }
        }

        // Imprimir o array listaC
        System.out.println("\nAlínea a");
        for (int i = 0; i < listaC.length; i++) {

            if (i == 0) {
                System.out.print("\nVetor dos elementos da listaC:\n[");
                System.out.print(listaC[i] + ", ");
            } else if (i == listaC.length - 1) {
                System.out.println(listaC[i] + "]");
            } else {
                System.out.print(listaC[i] + ", ");
            }
        }

        System.out.println("\nAlínea b");
        for (int i = 0; i < listaA.length; i++) {

            for (int k = 0; k < listaB.length; k++) {

                if (listaA[i] == listaB[k]) {
                    repetidos++;
                }
            }
        }

        if (repetidos != 0 && repetidos == 1) {
            System.out.println("Existem 1 elemento repetido");
        } else if (repetidos != 0 && repetidos > 1) {
            System.out.printf("Existem %d elementos repetidos\n", repetidos);
        }

        // Obtendo o tamanho do array listaBemA;
        int n = 0;
        for (int i = 0; i < listaA.length; i++) {

            for (int y = 0; y < listaB.length; y++) {

                if (listaA[i] == listaB[y]) {
                    n ++;
                }
            }
        }
        
        // Declarando o array listaBemA
        int[] listaBemA = new int[n];
        
        int t = 0;
        // Obtendo os valores do array listaBemA
        for (int i = 0; i < listaA.length; i++) {

            for (int y = 0; y < listaB.length; y++) {

                if (listaA[i] == listaB[y]) {
                    listaBemA[t] = listaB[y];
                    t++;
                }
            }
        }
        
        // Obtendo o tamanho do array listaAsemB
        int m = listaA.length;
        for (int i = 0; i < listaB.length; i++) {
            
            for (int y = 0; y < listaA.length; y++) {
                
                if (listaB[i] == listaA[y]) {
                    m--;
                }
            }
        }

        // Declarando o array listaAsemB
        int[] listaAsemB = new int[m];
        
        // Obtendo os valores do array listaAsemB
        int igual = 0;
        t = 0;
        for (int i = 0; i < listaA.length; i++) {
            
            for (int y = 0; y < listaB.length; y++) {
                
                if (listaA[i] == listaB[y]) {
                    igual = 1;
                }
            }
            
            if (igual != 1) {
                listaAsemB[t] = listaA[i];
                t++;
            }
            igual = 0;
        }
        
        // Imprimir o array listaAsemB
        System.out.println("\nAlínea 6.c");
        for (int i = 0; i < listaAsemB.length; i++) {
            
            if (i == 0) {
                System.out.print("Vetor dos elementos que se sencontram na lista"
                        + "A , mas que não se encontram na listaB:" + "\n[");
                System.out.print(listaAsemB[i] + ", ");
            } else if (i == listaAsemB.length - 1) {
                System.out.println(listaAsemB[i] + "]");
            } else {
                System.out.print(listaAsemB[i] + ", ");
            }
        }
        
        // Imprimir o array listaBemA;
        System.out.println("\nAlínea 6.d");
        for (int i = 0; i < listaBemA.length; i++) {
            
            if (i == 0) {
                System.out.print("Vetor dos elementos que se encontram em comum"
                        + " na listaA e na listaB:" + "\n[");
                System.out.print(listaBemA[i] + ", ");
                
            } else if (i == listaBemA.length - 1) {
                System.out.println(listaBemA[i] + "]");
                
            } else {
                System.out.print(listaBemA[i] + ", ");
            }
        }
    }
}
