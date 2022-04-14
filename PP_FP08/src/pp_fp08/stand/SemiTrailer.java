package pp_fp08.stand;

/**
 * Classe que contém a estrutura de um atrelado de tipo Semi-reboque
 */
public class SemiTrailer extends Trailer {
    
    /**
     * @param spareTyreNumber número de pneus sobrantes
     */
    private int spareTyreNumber;

    /**
     * Método construtor da classe SemiTrailer
     * @param spareTyreNumber número de pneus sobrantes do SemiTrailer
     * @param laod capacidade do SemiTrailer
     */
    public SemiTrailer(int spareTyreNumber, int laod) {
        super(laod);
        this.spareTyreNumber = spareTyreNumber;
    }

    public int getSpareTyreNumber() {
        return spareTyreNumber;
    }

    public void setSpareTyreNumber(int spareTyreNumber) {
        this.spareTyreNumber = spareTyreNumber;
    }

    // reescrever o método toString()
    @Override
    public String toString() {
        
        return "SemiTrailer {" + "exes number: " + getAxesNumber() + ", load: " + getLoad() + ", spareTyre Number: " + spareTyreNumber + '}';
    }
}