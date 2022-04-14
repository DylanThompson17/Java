package pp_fp06.pizza_restaurant;

import pp_fp06.pizza_restaurant.enums.PizzaSize;

/**
 * Classe que contém a estrutura de uma pizza
 */
public class Pizza {

    /**
     * @param id código de uma pizza
     */
    private int id;

    /**
     * @param name nome de uma pizza
     */
    private String name;

    /**
     * @param desc descrição de uma pizza
     */
    private String desc;

    /**
     * @param price preço de uma pizza
     */
    private float price;

    /**
     * @param size tamanho de uma pizza
     */
    private PizzaSize size;

    /**
     * @param MAX_INGR número de ingredientes
     */
    private final int MAX_INGR = 5;

    /**
     * @param ingredientes array de ingredientes de uma pizza
     */
    private Ingrediente[] ingredientes;

    /**
     * @param cont variável que armazena o número de ingredientes adicionados
     */
    private int cont = 0;

    /**
     * @param totalCaloria variável que armazena o total de caloria de uma Pizza
     */
    private int totalCaloria = 0;

    public Pizza(int id, String name, String desc, float price, PizzaSize size) {

        this.id = id;
        this.name = name;
        this.desc = desc;
        this.price = price;
        this.size = size;
        ingredientes = new Ingrediente[MAX_INGR];
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public PizzaSize getSize() {
        return size;
    }

    public void setSize(PizzaSize size) {
        this.size = size;
    }

    public Ingrediente[] getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(Ingrediente[] ingredientes) {
        this.ingredientes = ingredientes;
    }

    /**
     * Método para encontrar um ingrediente no array dos ingredientes
     *
     * @param ingrediente o ingrediente a ser procurado no array
     * @return true caso for encontrado, falso caso contrário
     */
    private boolean findIdIngred(Ingrediente ingrediente) {

        for (int i = 0; i < cont; i++) {

            if (ingredientes[i].getId() == ingrediente.getId()) {
                return true;
            }
        }

        return false;
    }

    /**
     * Método que verifica se pode ou não adicionar um ingrediente no array
     *
     * @param ingrediente o ingrediente a ser adicionado
     * @return true se possível, false caso contrário
     */
    private boolean verifyAddIn(Ingrediente ingrediente) {

        if (ingrediente == null) {
            System.out.println("Ups, o ingrediente é nulo «Ingrediente não adicionado!»");
            return false;
        }

        if (findIdIngred(ingrediente) == true) {
            System.out.printf("Ups, já existe um igrediente com o id:%d «Ingrediente não adicionado!»\n", ingrediente.getId());
            return false;
        }

        if (cont == MAX_INGR) {
            System.out.println("Ups, já não pode adicionar mais ingredientes «Ingrediente não adicionado!»");
            return false;
        }

        return true;
    }

    /**
     * Método que adiciona um ingrediente no array de ingredientes
     *
     * @param ingrediente o ingrediente a adicionar no array
     */
    public void addIngrediente(Ingrediente ingrediente) {

        if (verifyAddIn(ingrediente) == true) {
            ingredientes[cont] = ingrediente;
            cont++;
            System.out.println("Ingrediente com id:" + ingrediente.getId() + " adicionado na pizza");
        }
    }

    /**
     * Método que encontra um ingrediente no array de ingredientes
     *
     * @param ingrediente o ingrediente a ser encontrado
     * @return posição do ingredeinte no array ou -1 caso não encontrado
     */
    private int findIng(Ingrediente ingrediente) {

        if (ingrediente == null) {
            return -1;
        }

        for (int i = 0; i < cont; i++) {

            if (ingredientes[i].getId() == ingrediente.getId()) {
                return i;
            }
        }

        return -1;
    }

    /**
     * Método que remove um ingrediente de uma pizza
     *
     * @param ingrediente ingrediente a remover da pizza
     */
    public void removeIngrediente(Ingrediente ingrediente) {

        if (findIng(ingrediente) != -1) {

            System.out.printf("Ingrediente com id:%d removido da pizza\n", ingrediente.getId());

            for (int i = findIng(ingrediente); i < cont-1; i++) {
                ingredientes[i] = ingredientes[i+1];
            }
            ingredientes[cont-1] = null;
            cont--;

        } else {
            System.out.printf("Ingrediente com id:%d não encontrado «Ingrediente não removido!»\n", ingrediente.getId());
        }
    }

    /**
     * Método que apresenta informação de um ingrediente recebendo apenas o seu
     * id
     *
     * @param id o identificador do ingrediente a apresentar
     */
    public void ingredienteInfo(int id) {

        int n = 0;

        for (int i = 0; i < cont; i++) {

            if (this.ingredientes[i].getId() == id) {
                System.out.println("Informações do ingrediente " + (i + 1));
                System.out.println("ID: " + ingredientes[i].getId());
                System.out.println("Name: " + ingredientes[i].getName());
                System.out.println("Origem: " + ingredientes[i].getOrigem());
                System.out.println("Caloria: " + ingredientes[i].getCaloria());
                n = 1;
            }
        }

        if (n == 0) {
            System.out.printf("Ingrediente com id:%d não encontrado\n", id);
        }
    }

    /**
     * Método que para cada ingrediente incrementa ao valor total de caloria da
     * pizza o valor da caloria do ingrediente
     */
    public int getTotalCaloria() {

        for (int i = 0; i < cont; i++) {
            totalCaloria += ingredientes[i].getCaloria();
        }

        return totalCaloria;
    }

    /**
     * Método que imprime info de todos os ingredientes da pizza
     */
    public void showAllIngredientesInfo() {

        for (int i = 0; i < cont; i++) {

            if (i == 0) {
                System.out.println("\nInfo de todos os ingredientes da pizza");
            }

            System.out.println("Ingrediente: " + (i + 1));
            System.out.println("ID: " + ingredientes[i].getId());
            System.out.println("Nome: " + ingredientes[i].getName());
            System.out.println("Origem: " + ingredientes[i].getOrigem());
            System.out.println("Caloria: " + ingredientes[i].getCaloria());
            System.out.println();
        }
    }

    /**
     * Método que imprime total info da pizza
     */
    public void showAllInfoPizza() {

        System.out.println("\nUma descrição detalhada da pizza, inlcuindo os "
                + "seus ingredientes");
        System.out.println("----------Pizza ---------");
        System.out.println("Id: " + this.getId());
        System.out.println("Nome: " + this.getName());
        System.out.println("Descrição: " + this.getDesc());
        System.out.println("Preço: " + this.getPrice() + "€");
        System.out.println("Tamanho: " + size);
        showAllIngredientesInfo();
    }
}

/*
1.1
_garantir encapsulamento é colocar modificador private em todas as variáveis
de instância, ou seja, só podem ser acedidos apartir dos métodos de acesso
_variáveis de instâncias são as variáveis que não possuem o modificador static
_os métodos de acesso necessários são os gets e os sets
*/
