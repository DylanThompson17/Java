package pp_fp06.pizza_restaurant; 

import static pp_fp06.pizza_restaurant.enums.Origem.*;
import static pp_fp06.pizza_restaurant.enums.PizzaSize.*;

/**
 * Classe main do exercício 1.3
 */
public class PizzaDemoEx_1_3 {
    
    public static void main(String[] args) {
        
        //instanceando uma pizza, ou seja, criando um objeto do tipo Pizza
        Pizza piza1;
        
        // instanceando oito ingredientes
        Ingrediente ingrediente1, ingrediente2, ingrediente3, ingrediente4,
                ingrediente5, ingrediente6, ingrediente7, ingrediente8;

        ingrediente1 = null;
        ingrediente2 = new Ingrediente(1, "Carne", ANIMAL, 15);
        ingrediente3 = new Ingrediente(2, "Cenoura", VEGETAL, 4);
        ingrediente4 = new Ingrediente(6, "Alface", VEGETAL, 2);
        ingrediente5 = new Ingrediente(6, "Alface", VEGETAL, 2);
        ingrediente6 = new Ingrediente(4, "Sal", MINERAL, 1);
        ingrediente7 = new Ingrediente(5, "Queijo", ANIMAL, 11);
        ingrediente8 = new Ingrediente(3, "Água", MINERAL, 3);
        
        piza1 = new Pizza(1, "Rabisco", "Pizza para a família", 10, BIG);
        
        // adicionando 8 ingredientes ao array
        piza1.addIngrediente(ingrediente1);
        piza1.addIngrediente(ingrediente2);
        piza1.addIngrediente(ingrediente3);
        piza1.addIngrediente(ingrediente4);
        piza1.addIngrediente(ingrediente5);
        piza1.addIngrediente(ingrediente6);
        piza1.addIngrediente(ingrediente7);
        piza1.addIngrediente(ingrediente8);
        
        // remover o ingrediente 2, 3, 5, 7 e 8
        piza1.removeIngrediente(ingrediente2);
        piza1.removeIngrediente(ingrediente3);
        piza1.removeIngrediente(ingrediente6);
        piza1.removeIngrediente(ingrediente7);
        piza1.removeIngrediente(ingrediente8);
        
        // mostrar info de todos os ingredientes
        piza1.showAllIngredientesInfo();
        
        // mostar info de um ingrediente dado o seu id
        piza1.ingredienteInfo(1);
        piza1.ingredienteInfo(10);
        
        // Imprime uma descrição detalhada da pizza, inlcuindo os seus ingredientes
        piza1.showAllInfoPizza();
        
        //Imprimir o total de caloria da piza
        System.out.println("Total de caloria da pizza: " + piza1.getTotalCaloria());
    }
}