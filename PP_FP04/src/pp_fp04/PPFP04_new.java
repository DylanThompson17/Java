package pp_fp04;

/**
 * Classe correspondente ao exercício 1.3
 */
public class PPFP04_new {
    
    public static void main(String[] args) {
        
        User user1 = null;
        
        user1.id[0] = 'A';
        user1.id[1] = 'B';
        user1.id[2] = 'C';
        user1.name = new char[]{'B','r','u','n','o'};
        user1.email = new char[]{'b','m','o','@','e','s','t','g','f','.','i','p'
                ,'p','.','p','t'};
        
        System.out.println("--------User 1---------");
        System.out.print("ID: ");
        System.out.println(user1.id);
        System.out.print("Name: ");
        System.out.println(user1.name);
        System.out.print("Email: ");
        System.out.println(user1.email);
        
        // Não existe nenhuma diferença no resultado em relação à versão anterior
    }   
}