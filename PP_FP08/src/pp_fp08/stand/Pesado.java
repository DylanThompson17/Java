package pp_fp08.stand;

import pp_fp08.enums.Condition;
import pp_fp08.enums.Origin;
import pp_fp08.enums.TruckType;

/**
 * Classe que contém a estrutura de um veículo do tipo Pesado
 */
public class Pesado extends Vehicle {
    
    /**
     * @param MAX_TRAILERS máximo de trailers de um Pesado
     */
    private final int MAX_TRAILERS = 5;
    //private final int MAX_TRAILERS = 1; // faça testes
    
    /**
     * @param nTrailers números de Trailers do Pesado
     */
    private int nTrailers = 0;
    
    /**
     * @param length comprimento do Pesado
     */
    private int length;
    
    /**
     * @param load carga útil do Pesado
     */
    private int load;
    
    /**
     * @param truckType tipologia do Pesado
     */
    private TruckType truckType;
    
    /**
     * @param trailers conjunto dos atrelados do Pesado
     */
    private Trailer[] trailers;

    /**
     * Método construtor da classe Pesado
     * @param length comprimento do Pesado
     * @param load carga útil do Pesado
     * @param truckType tipologia do Pesado
     * @param vin número de chassis do Pesado
     * @param brand marca do Pesado
     * @param model modelo do Pesado
     * @param manufacturingDate data de fabrico do Pesado
     * @param origin origem do Pesado
     * @param kms número de quilómetros do Pesado
     * @param condition estado do Pesado
     * @param price preço do Pesado
     */
    public Pesado(int length, int load, TruckType truckType, int vin, String brand, String model, String manufacturingDate, Origin origin, int kms, Condition condition, int price) {
        super(vin, brand, model, manufacturingDate, origin, kms, condition, price);
        this.length = length;
        this.load = load;
        this.truckType = truckType;
        this.trailers = new Trailer[MAX_TRAILERS];
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getLoad() {
        return load;
    }

    public void setLoad(int load) {
        this.load = load;
    }

    public TruckType getTruckType() {
        return truckType;
    }

    public void setTruckType(TruckType truckType) {
        this.truckType = truckType;
    }

    /**
     * Método que verifica se pode ou não adicionar uma trainer no Pesado
     * @param trailer trailer a ser adicionado
     * @return true se possível, false caso contrário
     */
    private boolean verifyAddTrailer(Trailer trailer) {
    
        // verifica s existe espaço
        if (nTrailers == MAX_TRAILERS) {
            return false;
        }
        
        // verifica se não existe
        for (int i = 0; i < nTrailers; i++) {
            
            if (trailers[i].equals(trailer)) {
                return false;
            }
        }
        
        return true;
    }
    
    /**
     * Método que adiciona uma trailer no array dos trailers do Pesado
     * @param trailer trailer a ser adicionado
     */
    public void addTrailer(Trailer trailer) {
        
        if (verifyAddTrailer(trailer) == true) {
            trailers[nTrailers] = trailer;
            nTrailers++;
        }
    }
    
    /**
     * Método que encontra uma trailer no array dos trailers do Pesado
     * @param trailer trailer a ser encontrado
     * @return posição do trailer no array se encontrado, ou -1 caso não encontrado
     */
    private int findTrailer(Trailer trailer) {
        
        for (int i = 0; i < nTrailers; i++) {
            
            if (trailers[i].equals(trailer)) {
                return i;
            }
        }
        
        return -1;
    }
    
    /**
     * Método que remove uma trailer no array dos trailers do Pesado
     * @param trailer trailer a ser removido
     */
    public void removeTrailer(Trailer trailer) {
        
        if (findTrailer(trailer) != -1) {
            
            for (int i = findTrailer(trailer); i < nTrailers-1; i++) {
                
                trailers[i] = trailers[i+1];
            }
            
            trailers[nTrailers-1] = null;
            nTrailers--;
        }
    }
    
    /**
     * Método que imprime info de dodas as trailers do Pesado
     */
    public void seeAllTrailers() {
        
        System.out.printf("Pesado id: %d | All trailers\n", getId());
        
        if (nTrailers > 0) {
            
            for (int i = 0; i < nTrailers; i++) {
                
                System.out.println("   " + trailers[i].toString());
            }
            
        } else {
            System.out.println("   No trailers found");
        }
    }
    
    /*
    reescrever o método getPrice()
    */
    @Override
    public int getPrice() {
        
        if (nTrailers > 0 && super.getCondition() == Condition.NEW) {
            
            return (int) (super.getPrice() - (super.getPrice() * 0.05));
        
        } else if (nTrailers == 0 && super.getCondition() == Condition.NEW) {
            return super.getPrice();
        
        } else {
            return (int) (super.getPrice() - (super.getPrice() * 0.15));
        }
    }

    // reescrever o método toString()
    @Override
    public String toString() {
        
        return "Pesado {" + "id: " + getId() + ", vin: " + getVin() + ", brand: " + getBrand() + ", model: " + getModel() + ", manufacturing Date: " + getManufacturingDate() + ", origin: " + getOrigin() + ", kms: " + getKms() + ", condition: " + getCondition() + ", price: " + getPrice() + ", length: " + length + ", load: " + load + ", truck Type: " + truckType + '}';
    }
}