package pp_fp08.stand;

/**
 * Classe que contém a estrutura de um Atrelado
 */
public class Trailer {
    
    /**
     * @param axesNumber número de eixos do atrelado
     */
    private int axesNumber;
    
    /**
     * @param load capacidade do atrelado
     */
    private int load;

    /**
     * Método construtor da classe Trailer
     * @param load capacidade do atrelado
     */
    public Trailer(int laod) {
        this.load = laod;
        this.axesNumber = 2;
    }

    public int getAxesNumber() {
        return axesNumber;
    }

    public void setExesNumber(int axesNumber) {
        this.axesNumber = axesNumber;
    }

    public int getLoad() {
        return load;
    }

    public void setLaod(int laod) {
        this.load = laod;
    }

    @Override
    public String toString() {
        return "Trailer {" + "exes number: " + axesNumber + ", load: " + load + '}';
    }
}