package pp_fp06.pizza_restaurant;

/**
 * Classe que contem a estrutura de uma ementa
 */
public class Ementa {
    
    /**
     * @param desig designação de uma ementa
     */
    private String desig;
    
    /**
     * @param desc descrição de uma ementa
     */
    private String desc;
    
    /**
     * @param id código de identificação de uma ementa
     */
    private int id;
    
    /**
     * @param dataInicio data em que a emneta entra em vigor
     */
    private String dataInicio;
    
    /**
     * @param dataFim data do fim do prazo de validade da ementa
     */
    private String dataFim;
    
    /**
     * @param MAX_PIZAS número de pizzas que fazem parte da ementa
     */
    private final int MAX_PIZAS = 10;
    
    /**
     * @param conjuntoPizas conjunto de pizzas que fazem parte da ementa
     */
    private Pizza[] pizzas;
    
    /**
     * @param count número de pizzas contidos contidos no array de pizzas
     */
    private int count = 0;
    
    public Ementa (int id, String desig, String desc, String dataInicio, String dataFim) {
    
        this.desig = desig;
        this.desc = desc;
        this.id = id;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.pizzas = new Pizza[MAX_PIZAS];
    }

    public String getDesig() {
        return desig;
    }

    public void setDesig(String desig) {
        this.desig = desig;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }
    
    /**
     * Métode que verifica se pode ou não adicionar a pizza no array de pizzas
     * @param pizza pizza a ser analizada
     * @return true se possível, false caso contrário
     */
    public boolean verifyAddPizza(Pizza pizza) {
        
        if (pizza == null) {
            System.out.println("Ups pizza null «Pizza não adicionado!»");
            return false;
        }
        
        if (count == MAX_PIZAS) {
            System.out.println("O array já se encontra cheio,  «Pizza não adicionado!»");
            return false;
        }
        
        for (int i = 0; i < count; i++) {
            
            if (pizzas[i].getId() == pizza.getId()) {
                System.out.printf("Pizza com id:%d já se encontra na ementa «Pizza não adicionado!»\n", pizza.getId());
                return false;
            }
        }

        return true;
    }
    
    /**
     * Médoto que adiciona uma pizza no array das pizzas
     * @param pizza pizza a ser adicionada no array
     */    
    public void addPizza(Pizza pizza) {
        
        if (verifyAddPizza(pizza) == true) {
            pizzas[count] = pizza;
            count++;
            System.out.printf("Pizza com id:%d adicionado na ementa\n", pizza.getId());
        }
    }
    
    /**
     * Médoto que encontra uma pizza no array das pizzas
     * @param pizza pizza a ser procurada no array
     * @return -1 se não encontrado ou posição da pizza no array se encontrado
     */
    private int findPizza(Pizza pizza) {
        
        if (pizza == null) {
            System.out.println("Pizza não encontrado, «Pizza null!»");
            return -1;
        }
        
        for (int i = 0; i <= count; i++) {
            
            if (pizzas[i].getId() == pizza.getId()) {
                return i;
            }
        }
        
        return -1;
    }
    
    /**
     * Método que edita uma pizza existente no array de pizza
     * @param pizza conteḿ o id da pizza a ser editada
     */
    public void editePizza(Pizza pizza) {
        
        if (findPizza(pizza) != -1) {
            
            pizzas[findPizza(pizza)].setName(pizza.getName());
            pizzas[findPizza(pizza)].setDesc(pizza.getDesc());
            pizzas[findPizza(pizza)].setPrice(pizza.getPrice());
            pizzas[findPizza(pizza)].setSize(pizza.getSize());
            pizzas[findPizza(pizza)].setIngredientes(pizza.getIngredientes());
        }
    }
    
    /**
     * Método que encontra uma pizza no array as pizzas pelo seu id
     * @param id id da pizza a ser procurado
     * @return posição da pizza no array se encontrado ou -1 se não encontrado
     */
    private int findPizzaById(int id) {
        
        for (int i = 0; i < count; i++) {
            
            if (pizzas[i].getId() == id) {
                return i;
            }
        }
        
        return -1;
    }
    
    public void removePiza(int id) {
        
        if (findPizzaById(id) != -1) {
            
            System.out.printf("Pizza com id:%d removido da ementa\n", id);
            
            // se for a última manda a null e decrementa o contador
            if (id == count) {
                pizzas[count] = null;
                count--;
                
            // se não pega na próxima pizza e colaca no lugar do anterior
            } else {
                
                for (int i = findPizzaById(id); i < count; i++) {
                    pizzas[i] = pizzas[i++];
                }
                count--;
            }
        } else {
            System.out.printf("Pizza com id:%d não encontrado «Pizza não removida!»\n", id);
        }
    }
    
    /**
     * Método que mostra os detalhes de todas as pizzas da ementa
     */
    public void showAllPizzas() {
        
        for (int i = 0; i < count; i++) {
            
            if (i == 0) {
                System.out.println("\n\tTodas as pizzas da ementa: " + count);
            }
            System.out.println("Pizza " + (i+1));
            System.out.println("ID: " + pizzas[i].getId());
            System.out.println("Name: " + pizzas[i].getName());
            System.out.println("Description: " + pizzas[i].getDesc());
            System.out.println("Price: " + pizzas[i].getPrice());
            System.out.println("Size: " + pizzas[i].getSize());
            System.out.println();
        }
    }
    
    /**
     * Método que mostra o total de pizzas contidos na ementa
     */
    public void contValue() {
        System.out.println("\nNúmero de pizzas na ementa: " + count + "\n");
    }
    
    /**
     * Método que dado uma pizza imprime os seus detalhes
     * @param pizza pizza a ser imprimido os seus detalhes
     */
    public void printPizzaDetails(Pizza pizza) {
        
        if (findPizza(pizza) != -1) {
            System.out.println("Pizza details");
            System.out.println("ID: " + pizzas[findPizza(pizza)].getId());
            System.out.println("Name: " + pizzas[findPizza(pizza)].getName());
            System.out.println("Description: " + pizzas[findPizza(pizza)].getDesc());
            System.out.println("Price: " + pizzas[findPizza(pizza)].getPrice());
            System.out.println("Size: " + pizzas[findPizza(pizza)].getSize());
        
        } else {
            System.out.println("Pizza não encontrado na ementa");
        }
    }
}

/*
Ex 2.1 -> Resposta: colocar MAX_PIZAS = 10
*/

/*
Ex 2.2 -> Adicionar métodos:
_adionar pizza
_editar pizza
_remover pizza
*/