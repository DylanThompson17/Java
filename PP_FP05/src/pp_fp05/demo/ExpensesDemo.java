package pp_fp05.demo;

import pp_fp05.expenses.Expense;
import pp_fp05.expenses.User;

public class ExpensesDemo {

    public static void main(String[] args) {

        User user1 = new User(1, "User 1", "user1@estg.ipp.pt", "2000-01-01");
        user1.expenses[0] = new Expense(1, "automóvel", 20, "2014-10-08");
        user1.expenses[13] = new Expense(2, "alimentar", 13, "2014-10-11");
        user1.expenses[27] = new Expense(3, "outro", 25, "2014-10-20");

        User user2 = new User(2, "User 2", "user2@estg.ipp.pt", "20001-06-08");
        user2.expenses[4] = new Expense(1, "alimentar", 50, "2015-08-10");
        user2.expenses[19] = new Expense(2, "outro", 24, "2015-08-20");
        user2.expenses[30] = new Expense(3, "automóvel", 40, "2015-08-30");

        //Imprimindo dados do user 1
        System.out.println("DADOS DO USER 1");
        System.out.println("Código: " + user1.id);
        System.out.println("Nome: " + user1.nome);
        System.out.println("E-mail: " + user1.email);
        System.out.println("Data de nascimento: " + user1.birthDate);
        for (int i = 0; i < user1.expenses.length; i++) {
            if (user1.expenses[i] != null) {
                System.out.println("----------------------------");
                System.out.println("Despesa nº: " + user1.expenses[i].id);
                System.out.println("Tipo: " + user1.expenses[i].type);
                System.out.println("Valor gasto: " + user1.expenses[i].amount);
                System.out.println("Data: " + user1.expenses[i].date);
            } else {
                System.out.println("Não teve despesa no dia " + (i+1));
            }
        }

        //Imprimindo dados do user 2
        System.out.println("\nDADOS DO USER 2");
        System.out.println("Código: " + user2.id);
        System.out.println("Nome: " + user2.nome);
        System.out.println("E-mail: " + user2.email);
        System.out.println("Data de nascimento: " + user2.birthDate);
        for (int i = 0; i < user2.expenses.length; i++) {
            if (user2.expenses[i] != null) {
                System.out.println("----------------------------");
                System.out.println("Despesa nº: " + user2.expenses[i].id);
                System.out.println("Tipo: " + user2.expenses[i].type);
                System.out.println("Valor gasto: " + user2.expenses[i].amount);
                System.out.println("Data: " + user2.expenses[i].date);
            } else {
                System.out.println("Não teve despesa no dia " + (i+1));
            }
        }
        
        /*
        Ex 1.4
        Surgiram erros de compilação porque as variáveis da classe User e 
        Expense têm o modificador protected, e não podem ser acedido daquela 
        forma. A maneira de resolver isso é colocar o modificador public em cada
        uma das variáveis da classe User e Expense
        */
    }
}