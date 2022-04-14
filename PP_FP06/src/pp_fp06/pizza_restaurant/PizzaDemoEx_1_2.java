package pp_fp06.pizza_restaurant; 

import static pp_fp06.pizza_restaurant.enums.Origem.*;
import pp_fp06.pizza_restaurant.enums.PizzaSize;
import static pp_fp06.pizza_restaurant.enums.PizzaSize.*;

/**
 * Classe main do exercício 1.2
 */
public class PizzaDemoEx_1_2 {
    
    public static void main(String[] args) {
        
        //instanceando duas pizzas, ou seja, criando dois objetos do tipo Pizza
        Pizza piza1, piza2;
        
        PizzaSize tamanho = null;
        
        // instanceando dois arrys de ingredientes
        Ingrediente [] ingredientes1 = new Ingrediente[3];
        Ingrediente [] ingredientes2 = new Ingrediente[3];

        ingredientes1[0] = new Ingrediente(1, "Carne", ANIMAL, 15);
        ingredientes1[1] = new Ingrediente(2, "Cenoura", VEGETAL, 4);
        ingredientes1[2] = new Ingrediente(3, "Água", MINERAL, 3);
        ingredientes2[0] = new Ingrediente(4, "Sal", MINERAL, 2);
        ingredientes2[1] = new Ingrediente(5, "Queijo", ANIMAL, 11);
        ingredientes2[2] = new Ingrediente(6, "Alface", VEGETAL, 3);
        
        piza1 = new Pizza(1, "Rabisco", "Pizza para a família", 10, BIG);
        piza2 = new Pizza(2, "Quentinho", "Pizza para comer sozinho", 7, SMALL);
        
        piza1.setIngredientes(ingredientes1);
        piza2.setIngredientes(ingredientes2);
        
        System.out.println("\n----------Pizza 1---------");
        System.out.println("Id: " + piza1.getId());
        System.out.println("Nome: " + piza1.getName());
        System.out.println("Descrição: " + piza1.getDesc());
        System.out.println("Preço: " + piza1.getPrice() + "€");
        //System.out.println("Tamanho: " + piza1.getSize());
        System.out.println("Tamanho: " + tamanho.pizzaToString(piza1.getSize()));
        
        for(int i = 0; i < 3; i++) {
            System.out.println("Ingrediente:");
            System.out.println("  Id: " + piza1.getIngredientes()[i].getId());
            System.out.println("  Nome: " + piza1.getIngredientes()[i].getName());
            System.out.println("  Origem: " + piza1.getIngredientes()[i].getOrigem());
            System.out.println("  Caloria: " + piza1.getIngredientes()[i].getCaloria());
            System.out.println("--  --  --  --");
        }
        
        System.out.println("\n----------Pizza 2---------");
        System.out.println("Id: " + piza2.getId());
        System.out.println("Nome: " + piza2.getName());
        System.out.println("Descrição: " + piza2.getDesc());
        System.out.println("Preço: " + piza2.getPrice() + "€");
        //System.out.println("Tamanho: " + piza2.getSize());
        System.out.println("Tamanho: " + tamanho.pizzaToString(piza2.getSize()));
        
        for(int i = 0; i < 3; i++) {
            System.out.println("Ingrediente:");
            System.out.println("  Id: " + piza2.getIngredientes()[i].getId());
            System.out.println("  Nome: " + piza2.getIngredientes()[i].getName());
            System.out.println("  Origem: " + piza2.getIngredientes()[i].getOrigem());
            System.out.println("  Caloria: " + piza2.getIngredientes()[i].getCaloria());
            System.out.println("--  --  --  --");
        }
    }    
}