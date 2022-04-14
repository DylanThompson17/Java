package pp_fp08.stand;

import pp_fp08.enums.TrailerType;

/**
 * Classe que contém a estrutura de um atrelado de tipo Reboque
 */
public class TowHaul extends Trailer {
    
    /**
     * @param trailerType tipologia do reboque
     */
    private TrailerType trailerType;

    /**
     * Método construtor da classe TowHaul
     * @param trailerType tipologia do reboque
     * @param laod capacidade do reboque
     */
    public TowHaul(TrailerType trailerType, int laod) {
        super(laod);
        this.trailerType = trailerType;
    }

    public TrailerType getTrailerType() {
        return trailerType;
    }

    public void setTrailerType(TrailerType trailerType) {
        this.trailerType = trailerType;
    }

    // reescrever o método toString()
    @Override
    public String toString() {
        
        return "TowHaul {" + "exes number: " + getAxesNumber() + ", load: " + getLoad() + ", trailer Type: " + trailerType +'}';
    }
}