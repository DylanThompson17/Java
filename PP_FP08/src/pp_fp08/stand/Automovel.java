package pp_fp08.stand;

import pp_fp08.enums.Condition;
import pp_fp08.enums.Origin;

/**
 * Classe que contém a estrutura de um veículo do tipo automóvel
 */
public class Automovel extends Vehicle {
    
    /**
     * @param occupantNumber número de ocupantes do automóvel
     */
    private int occupantsNumber;
    
    /**
     * @param doorsNumber número de portas do automóvel
     */
    private int doorsNumber;

    /**
     * Método construtor da classe Automóvel
     * @param vin número de chassis do automóvel
     * @param brand marca do automóvel
     * @param model modelo do automóvel
     * @param manufacturingDate data de fabrico do automóvel
     * @param origin origem do automóvel
     * @param kms número de quilómetros do automóvel
     * @param condition estado do automóvel
     * @param price preço do automóvel
     * @param occupantsNumber número de ocupantes do automóvel
     */
    public Automovel(int occupantsNumber, int vin, String brand, String model, String manufacturingDate, Origin origin, int kms, Condition condition, int price) {
        super(vin, brand, model, manufacturingDate, origin, kms, condition, price);
        this.occupantsNumber = occupantsNumber;
        this.doorsNumber = 3;
    }

    public int getOccupantsNumber() {
        return occupantsNumber;
    }

    public void setOccupantsNumber(int occupantsNumber) {
        this.occupantsNumber = occupantsNumber;
    }

    public int getDoorsNumber() {
        return doorsNumber;
    }

    public void setDoorsNumber(int doorsNumber) {
        this.doorsNumber = doorsNumber;
    }
    
    /*
    reescrever o método getPrice
    se for um automóvel usado tem um desconto de 30%
    primeiro faz um cast para inteiro depois retorna    
    */
    @Override
    public int getPrice() {
        
        if (super.getCondition() == Condition.NEW) {
            return super.getPrice();
        
        } else {
            return (int) (super.getPrice() - (super.getPrice() * 0.3));
        }
    }

    // reescrever o método toString()
    @Override
    public String toString() {
        
        return "Automóvel {" + "id: " + getId() + ", vin: " + getVin() + ", brand: " + getBrand() + ", model: " + getModel() + ", manufacturing Date: " + getManufacturingDate() + ", origin: " + getOrigin() + ", kms: " + getKms() + ", condition: " + getCondition() + ", price: " + getPrice() + ", occupants number: " + occupantsNumber + ", doors number: " + doorsNumber + '}';
    }
}