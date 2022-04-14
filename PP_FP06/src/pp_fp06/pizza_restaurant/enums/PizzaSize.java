package pp_fp06.pizza_restaurant.enums;

/**
 * Enumerador que define os possíveis tamanhos de uma pizza
 */
public enum PizzaSize {
    
    /**
     * @param SMALL define pizza do tamanho pequeno
     */
    SMALL,
    
    /**
     * @param MEDIUM define pizza do tamanho médio
     */
    MEDIUM,
    
    /**
     * @param BIG define pizza do tamanho grande
     */
    BIG;
    
    /**
     * Converte o valor do tamanho de enumerador para uma string
     * @param size variável que contém o tamanho de uma pizza
     * @return uma string correspondente ao tamanho da pizza
     */
    public static String pizzaToString(PizzaSize size) {
    //public String pizzaToString(PizzaSize size) {
        switch (size) {
            case SMALL:
                return "The pizza is small";
            case BIG:
                return "The pizza is big";
            default:
                return "The pizza is medium";
        }
    }
}