package ficha1_helloworld;

public class newMain {

    public static void main(String[] args) {
        System.out.println("Este é o novo main do programa");
        
        int valor = 10;
        char letra ='A';
        
        // Ex_1
        // local variables
        System.out.println("\n\nExercício 1\n");
        char l = 'l', p = 'p';
        int q = 4, d = 2;
        System.out.println(l);
        System.out.println(p);
        System.out.println(d);
        System.out.println(q);
        System.out.println(l + p + 2);
        System.out.println("" + l + p + 2);
        System.out.println(q + d);
        
        // Ex_2
        System.out.println("\n\nExercício 2\n");
        int [] array = new int [5];
        for (int i = 0; i < 5; i++) {
            array[i] = 1;
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        
        // Ex_3
        System.out.println("\n\nExercício 3\n");
        boolean canITakeHisMoney;
        int hisBalance = 5;
        long myBalance = 4;
        hisBalance += 8;
        canITakeHisMoney = hisBalance > myBalance;
        canITakeHisMoney = canITakeHisMoney & (hisBalance >= 3);
        System.out.println(canITakeHisMoney); // output true        
        
        // Ex 4
        System.out.println("\n\nExercício 4\n");
        int v = 0;
        System.out.println("v = " + v);
        v++; // v = 1
        System.out.println("v = " + v);
        int amount = v++; // amount = 1, v = 3
        System.out.println("v = " + v + " amount = " + amount);
        System.out.println(++v + " " + amount); // 3 1
        System.out.println("v = " + v + " amount = " + amount);
        System.out.println(v); // 3
        
        // Ex_5
        System.out.println("\n\nExercício 5\n");
        long dan = 0;
        System.out.println("dan = " + dan);
        dan = 3;
        System.out.println("dan = " + dan);
        boolean estado = false;
        System.out.println("estado = " + estado);
        
        // Ex_6
        System.out.println("\n\nExercício 6\n");
        double var1;
        int var2;
        /*System.out.println("var1 = " + var1 + " var2 = " + var2);
        Apresenta warnings porque os valores var1 e var2 não foram
        inicializados*/
    }
    
}
