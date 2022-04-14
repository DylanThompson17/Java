package pp_fp06.pizza_restaurant;

import pp_fp06.pizza_restaurant.enums.Origem;

/**
 * Classe que contém a estrutura de um ingrediente
 */
public class Ingrediente {
    
    /**
     * @param id código de um ingrediente
     */
    private int id;
    
    /**
     * @param name nome de um ingrediente
     */
    private String name;
    
    /**
     * @param origem origem de um ingrediente
     */
    private Origem origem;
    
    /**
     * @param caloria número de caloria de um ingrediente
     */
    private int caloria;

    /**
     * Construtor que não recebe nenhum parâmetro, para teste
     */
    public Ingrediente () {}
    
    public Ingrediente(int id, String name, Origem origem, int caloria) {

        this.id = id;
        this.name = name;
        this.origem = origem;
        this.caloria = caloria;
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

    public Origem getOrigem() {
        return origem;
    }

    public void setOrigem(Origem origem) {
        this.origem = origem;
    }

    public int getCaloria() {
        return caloria;
    }

    public void setCaloria(int caloria) {
        this.caloria = caloria;
    }
}