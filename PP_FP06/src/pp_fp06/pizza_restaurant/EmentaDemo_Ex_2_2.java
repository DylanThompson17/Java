package pp_fp06.pizza_restaurant;

import static pp_fp06.pizza_restaurant.enums.PizzaSize.*;

/**
 * Classe main do exercício 2.2
 */
public class EmentaDemo_Ex_2_2 {

    public static void main(String[] args) {

        // instanceando uma ementa
        Ementa ementa = new Ementa(1, "Ementa especial", "Só para casos "
                + "especiasis", "02-04-2022", "02-05-2022");
        
        // instanceando 13 pizzas
        Pizza pizza1, pizza2, pizza3, pizza4, pizza5, pizza6, pizza7, pizza8,
                pizza9, pizza10, pizza11, pizza12, pizza13;
        
        
        pizza1 = new Pizza(1, "Rabisco", "Pizza para a família", 10, BIG);
        pizza2 = new Pizza(2, "Queen", "Take it to your queen", 14, SMALL);
        pizza3 = new Pizza(3, "Take", "Don't forget to take it", 7, MEDIUM);
        pizza4 = new Pizza(4, "Miss", "You don't want to miss this", 9, SMALL);
        pizza5 = new Pizza(4, "Miss", "You don't want to miss this", 9, SMALL);
        pizza6 = new Pizza(6, "Take", "You can eat it while you are going", 10, MEDIUM);
        pizza7 = new Pizza(7, "Late", "When you are late and don't want to leave ungry, take this", 5, SMALL);
        pizza8 = null;
        pizza9 = new Pizza(8, "Comemoration", "Good for a comemoration", 7, BIG);
        pizza10 = new Pizza(9, "Gostoso", "Pizza para comer sozinho", 7, SMALL);
        pizza11 = new Pizza(10, "Saboroso", "Pizza para a família", 15, BIG);
        pizza12 = new Pizza(11, "Delicious", "Ainda não provaste!", 13, SMALL);
        pizza13 = new Pizza(12, "Normal", "A normal pizza", 7, MEDIUM);
        
        // adcionando as 13 pizzas na ementa
        ementa.contValue();      // mostra o total de pizzas atual na ementa
        ementa.addPizza(pizza1); // adicina a pizza 1 na ementa
        ementa.contValue();
        ementa.addPizza(pizza2);
        ementa.contValue();
        ementa.addPizza(pizza3);
        ementa.contValue();
        ementa.addPizza(pizza4);
        ementa.contValue();
        ementa.addPizza(pizza5);
        ementa.contValue();
        ementa.addPizza(pizza6);
        ementa.contValue();
        ementa.addPizza(pizza7);
        ementa.contValue();
        ementa.addPizza(pizza8);
        ementa.contValue();
        ementa.addPizza(pizza9);
        ementa.contValue();
        ementa.addPizza(pizza10);
        ementa.contValue();
        ementa.addPizza(pizza11);
        ementa.contValue();
        ementa.addPizza(pizza12);
        ementa.contValue();
        ementa.addPizza(pizza13);
        ementa.contValue();
        
        ementa.removePiza(8); // remove a pizza 9 da ementa -> id: 8
        ementa.contValue();        // mostra o total de pizzas atual na ementa
        ementa.removePiza(10);
        ementa.contValue();
        ementa.removePiza(11); // não deveria ser possivel !!! -> o método remover não está a funcionar corretamente
        ementa.contValue();
        ementa.removePiza(12);
        ementa.contValue();
        
        // Método que mostra os detalhes de todas as pizzas da ementa
        ementa.showAllPizzas();
        
        // Editando o preço da pizza 3
        pizza3 = new Pizza(3, "Take", "Don't forget to take it", 10, MEDIUM);
        ementa.editePizza(pizza3); // editar no array das pizzas
        ementa.printPizzaDetails(pizza3); // imprime os detalhes da pizza 3 and see the change
        
        // Imprime os detalhes da pizza 8, 12 e 13
        ementa.printPizzaDetails(pizza8);
        ementa.printPizzaDetails(pizza12);
        ementa.printPizzaDetails(pizza13);
    }   
}