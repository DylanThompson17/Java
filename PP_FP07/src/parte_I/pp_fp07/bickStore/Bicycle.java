package parte_I.pp_fp07.bickStore;

import parte_I.pp_fp07.enums.Brakes_Type;
import parte_I.pp_fp07.enums.Material_Type;

/**
 * Classe que contém a estrutura que todas as bicicletas têm em comum
 */
public class Bicycle {
    
    /**
     * @param numberOfBikes valor que corresponderá ao id de cada bike, é 
     * incrementado sempre que for adicionado uma bike nova
     * static porque pertence à classe e não à instância
     */
     private static int numberOfBikes = 1;
    
    /**
     * @param id identificador da bicicleta
     */
    private int id;
    
    /**
     * @param numberOfGears número de velocidade da bicicleta
     */
    private int numberOfGears;
    
    /**
     * @param mainColor cor principal da bicicleta
     */
    private String mainColor;
    
    /**
     * @param wheelSize diâmetro da roda da bicicleta;
     */
    private float wheelSize;
    
    /**
     * @param brake tipo de travãp da bicicleta
     */
    private Brakes_Type brake;
    
    /**
     * @param material material de construção da bicicleta
     */
    private Material_Type material;
    
    /**
     * @param price preço da bicicleta
     */
    private float price;
    
    /**
     * @param garantee os anos de garantia da bicicleta
     */
    private int garantee;

    public Bicycle (int numberOfGears, String mainColor, float wheelSize, Brakes_Type brake, Material_Type material, float price, int garantee) {
        this.id = numberOfBikes++;
        this.numberOfGears = numberOfGears;
        this.mainColor = mainColor;
        this.wheelSize = wheelSize;
        this.brake = brake; 
        this.material = material;
        this.price = price;
        this.garantee = garantee;
    }

    public int getId() {
        return id;
    }

    public int getNumberOfGears() {
        return numberOfGears;
    }

    public void setNumberOfGears(int numberOfGears) {
        this.numberOfGears = numberOfGears;
    }

    public String getMainColor() {
        return mainColor;
    }

    public void setMainColor(String mainColor) {
        this.mainColor = mainColor;
    }

    public float getWheelSize() {
        return wheelSize;
    }

    public void setWheelSize(float wheelSize) {
        this.wheelSize = wheelSize;
    }

    public Brakes_Type getBrake() {
        return brake;
    }

    public void setBrake(Brakes_Type brake) {
        this.brake = brake;
    }

    public Material_Type getMaterial() {
        return material;
    }

    public void setMaterial(Material_Type material) {
        this.material = material;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getGarantee() {
        return garantee;
    }

    public void setGarantee(int garantee) {
        this.garantee = garantee;
    }
    
    /**
     * Método que vê todas as infos de uma bike
     */
    public void seeBikeInfo(String bikeType) {
        
        System.out.println("\nID: " + this.id + " | «" + bikeType + "»");
        System.out.println("Number of gears: " + numberOfGears);
        System.out.println("Main color: " + mainColor);
        System.out.println("Wheel Size: " + wheelSize);
        System.out.println("Brake: " + brake);
        System.out.println("Meterial: " + material);
        System.out.println("Price: " + price);
        System.out.println("Guarantee: " + garantee);
    }
}