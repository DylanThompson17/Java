package pp_fp06.pizza_restaurant.enums;

/**
 * Enumerador que define as possíveis origens de um ingrediente
 */
public enum Origem {
    
    /**
     * @param ANIMAL define ingrediente de origem animal
     */
    ANIMAL,
    
    /**
     * @param VEGETAL define ingrediente de origem vegetal
     */
    VEGETAL,
    
    /**
     * @param MINERAL define ingrediente de origem mineral
     */
    MINERAL;
    
    /**
     * Converte a origem do enumerador para uma string
     * @param origem variável que contém o valor da enumeração
     * @return string correspondente à origem
     */
    public static String origemToString(Origem origem) {
        return switch (origem) {
            case ANIMAL -> "Origem animal";
            case VEGETAL -> "Origem vegetal";
            default -> "Origem mineral";
        };
    }
}