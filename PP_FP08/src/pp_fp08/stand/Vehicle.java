package pp_fp08.stand;

import java.util.Objects;
import pp_fp08.enums.Condition;
import pp_fp08.enums.Origin;

/**
 * Classe que contém a estrutura que todos os veículos têm em comum
 */
public class Vehicle {
    
    /**
     * @param numberOfVeicles números de veículos
     */
    private static int numberOfVeicles = 1;
    
    /**
     * @param id identificador interno do veículo
     * é incrementado sempre que for instanceado (adicionado) um novo veículo
     */
    private int id;
    
    /**
     * @param vin número de chassis do veículo
     */
    private int vin;
    
    /**
     * @param brand marca do veículo
     */
    private String brand;
    
    /**
     * @param model modelo do veículo
     */
    private String model;
    
    /**
     * @param manufacturingDate data de fabrico do veículo
     */
    private String manufacturingDate;
    
    /**
     * @param origin origem do veículo
     */
    private Origin origin;
    
    /**
     * @param kms número de quilómetros do veículo
     */
    private int kms;
    
    /**
     * @param condition estado do veículo
     */
    private Condition condition;
    
    /**
     * @param price preço do veículo
     */
    private int price;

    /**
     * Método construtor da classe Vehicle
     * @param vin número de chassis do veículo
     * @param brand marca do veículo
     * @param model modelo do veículo
     * @param manufacturingDate data de fabrico do veículo
     * @param origin origem do veículo
     * @param kms número de quilómetros do veículo
     * @param condition estado do veículo
     * @param price preço do veículo
     */
    public Vehicle(int vin, String brand, String model, String manufacturingDate, Origin origin, int kms, Condition condition, int price) {
        this.id = numberOfVeicles++;
        this.vin = vin;
        this.brand = brand;
        this.model = model;
        this.manufacturingDate = manufacturingDate;
        this.origin = origin;
        this.kms = kms;
        this.condition = condition;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public int getVin() {
        return vin;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(String manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    public Origin getOrigin() {
        return origin;
    }

    public void setOrigin(Origin origin) {
        this.origin = origin;
    }

    public int getKms() {
        return kms;
    }

    public void setKms(int kms) {
        this.kms = kms;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * Método construtor da classe Vehicle
     * @return uma String com info do veículo
     */
    @Override
    public String toString() {
        return "Stand {" + "id: " + id + ", vin: " + vin + ", brand: " + brand + ", model: " + model + ", manufacturing Date: " + manufacturingDate + ", origin: " + origin + ", kms: " + kms + ", condition: " + condition + ", price: " + price + '}';
    }
    
    // reescrevendo o método equals
    @Override
    public boolean equals(Object obj) {
        
        // verifica se obj é uma instâncea de Vehicle
        if (obj instanceof Vehicle) {
            
            // se o vin do obj for igual ao vin da classe retorna true
            if (((Vehicle) obj).getVin() == this.getVin()) {
                System.out.println("There is another vehicle with this vin: " + this.getVin());
                return true;
            }
        }
        
        return false;
    }
}