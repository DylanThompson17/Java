package pp_fp08.stand;

import pp_fp08.enums.Condition;
import pp_fp08.enums.Origin;

/**
 * Classe que contém a estrutura de um veículo do tipo Motociclo
 */
public class Motociclo extends Vehicle {
    
    /**
     * @param cubicCapacity cilindrada do motociclo
     */
    private int cubicCapacity;
    
    /**
     * @param wheelSize diâmetro de rodas do moticiclo
     */
    private int wheelSize;

    /**
     * Método construtor da classe Motociclo
     * @param cubicCapacity cilindrada do motociclo
     * @param wheelSize diâmetro de rodas do moticiclo
     * @param vin número de chassis do motociclo
     * @param brand marca do motociclo
     * @param model modelo do motociclo
     * @param manufacturingDate data de fabrico do motociclo
     * @param origin origem do motociclo
     * @param kms número de quilómetros do motociclo
     * @param condition estado do motociclo
     * @param price preço do motociclo
     */
    public Motociclo(int cubicCapacity, int wheelSize, int vin, String brand, String model, String manufacturingDate, Origin origin, int kms, Condition condition, int price) {
        super(vin, brand, model, manufacturingDate, origin, kms, condition, price);
        this.cubicCapacity = cubicCapacity;
        this.wheelSize = wheelSize;
    }

    public int getCubicCapacity() {
        return cubicCapacity;
    }

    public void setCubicCapacity(int cubicCapacity) {
        this.cubicCapacity = cubicCapacity;
    }

    public int getWheelSize() {
        return wheelSize;
    }

    public void setWheelSize(int wheelSize) {
        this.wheelSize = wheelSize;
    }

    // reescrever o método toString()
    @Override
    public String toString() {
        
        return "Motociclo {" + "id: " + getId() + ", vin: " + getVin() + ", brand: " + getBrand() + ", model: " + getModel() + ", manufacturing Date: " + getManufacturingDate() + ", origin: " + getOrigin() + ", kms: " + getKms() + ", condition: " + getCondition() + ", price: " + getPrice() + ", cubic capacity: " + cubicCapacity + ", wheelSize: " + wheelSize + '}';
    }
}