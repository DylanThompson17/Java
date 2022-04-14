package pp_fp04;

/**
 * Classe correnpondene ao exercício 1.2
 */
public class PPFP04 {

    static User user1;
    static User user2; // um novo usuário
    
    public static void main(String[] args) {
        
        user1.id[0] = 'A';
        user1.id[1] = 'B';
        user1.id[2] = 'C';
        user1.name = new char[]{'B','r','u','n','o'};
        user1.email = new char[]{'b','m','o','@','e','s','t','g','f','.','i','p'
                ,'p','.','p','t'};
        
        /*se declarares os valores para o usuário 2, os mesmos serão aplicados
        ao usuário 1*/
        
        /*user2.id[0] = 'X';
        user2.id[1] = 'Y';
        user2.id[2] = 'Z';
        user2.name = new char[]{'A','l','u','n','o'};
        user2.email = new char[]{'a','l','u','n','o','@','e','s','t','g','f',
            '.','i','p','p','.','p','t'};*/
        
        System.out.println("--------User 1---------");
        System.out.print("ID: ");
        System.out.println(user1.id);
        System.out.print("Name: ");
        System.out.println(user1.name);
        System.out.print("Email: ");
        System.out.println(user1.email);
        
        System.out.println();
        
        // comente isso e veja a diferença
        user2.id[0] = 'X';
        user2.id[1] = 'Y';
        user2.id[2] = 'Z';
        user2.name = new char[]{'A','l','u','n','o'};
        user2.email = new char[]{'a','l','u','n','o','@','e','s','t','g','f',
            '.','i','p','p','.','p','t'};
        
        System.out.println("--------User 2---------");
        System.out.print("ID: ");
        System.out.println(user2.id);
        System.out.print("Name: ");
        System.out.println(user2.name);
        System.out.print("Email: ");
        System.out.println(user2.email);
    }
}