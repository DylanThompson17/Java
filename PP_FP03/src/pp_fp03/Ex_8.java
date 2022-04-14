package pp_fp03;

import java.util.Scanner;

/**
 * Versão do exercício 8 para ser executado num IDE
 */
public class Ex_8 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        double valor = 0, n = 0;
        double doisE = 0, umE = 0, cinqC = 0, vintC = 0, dezC = 0, cinC = 0, 
                doisC = 0, umC = 0;
        
        try {
            
            System.out.print("Insira o montante a traduzir: ");
            valor = ler.nextDouble();
            n = valor;
            
            /*while (valor >= 0.01) {
                
                if (valor % 2 == 0) {
                    valor -= 2;
                    doisE++;
                    
                } else if (valor % 1 == 0) {
                    valor -= 1;
                    umE++;
                    
                } else if (valor % 0.5 == 0) {
                    valor -= 0.5;
                    cinqC++;
                    
                } else if (valor % 0.2 == 0) {
                    valor -= 0.2;
                    vintC++;
                    
                } else if (valor % 0.1 == 0) {
                    valor -= 0.1;
                    dezC++;
                
                } else if (valor % 0.05 == 0) {
                    valor -= 0.05;
                    cinC++;
                
                } else if (valor % 0.02 == 0) {
                    valor -= 0.02;
                    doisC++;
                
                } else if (valor % 0.01 == 0) {
                    valor -= 0.01;
                    umC++;
                }
            }*/
            
            /*doisE = (int) valor / 2;
            valor = valor - (doisE * 2);
            
            umE = (int) valor / 1;
            valor = valor - (umE * 1);
            
            cinqC = (int) valor / 0.5;
            valor = valor - (cinqC * 0.5);
            
            vintC = (int) valor / 0.2;
            valor = valor - (vintC * 0.2);
            
            dezC = (int) valor / 0.1;
            valor = valor - (dezC * 0.1);
            
            cinC = (int) valor / 0.05;
            valor = valor - (cinC * 0.05);
            
            doisC = (int) valor / 0.02;
            valor = valor - (doisC * 0.02);
            
            umC = (int) valor / 0.01;
            valor = valor - (umC * 0.01);*/
            
            while (valor >= 0.01) {
                
                if (valor % 2 == 0) {
                    valor -= 2;
                    doisE++;
                    
                } else if (valor % 1 == 0) {
                    valor -= 1;
                    umE++;
                    
                } else if (valor % 0.5 == 0) {
                    valor -= 0.5;
                    cinqC++;
                    
                } else if (valor % 0.2 == 0) {
                    valor -= 0.2;
                    vintC++;
                    
                } else if (valor % 0.1 == 0) {
                    valor -= 0.1;
                    dezC++;
                
                } else if (valor % 0.05 == 0) {
                    valor -= 0.05;
                    cinC++;
                
                } else if (valor / 0.02 == 0) {
                    valor -= 0.02;
                    doisC++;
                
                } else if (valor / 0.01 == 0) {
                    valor -= 0.01;
                    umC++;
                }
            }
       
            
            System.out.printf("Montante inserido %.2f -> equivale a:\n", n);
            
            if (doisE > 0) {
                System.out.println(doisE + " moedas de dois euros");
            }
            
            if (umE > 0) {
                System.out.println(umE + " moedas de um euro");
            }
            
            if (cinqC > 0) {
                System.out.println(cinqC + " moedas de cinquenta cêntimos");
            }
            
            if (vintC > 0) {
                System.out.println(vintC + " moedas de cinte cêntimos");
            }
        
            if (dezC > 0) {
                System.out.println(dezC + " moedas de dez cêntimos");
            }
            
            if (cinC > 0) {
                System.out.println(cinC + " moedas de cinco cêntimos");
            }
            
            if (doisC > 0) {
                System.out.println(doisC + " moedas de dois cêntimos");
            }
            
            if (umC > 0) {
                System.out.println(umC + " moeda de um cêntimo");
            }
            
        } catch (Exception ex) {
            System.out.println("O montante terá que ser um número");
        }
    }   
}