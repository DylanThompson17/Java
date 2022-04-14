package parte_I.pp_fp07.bickStore;

import parte_I.pp_fp07.enums.Brakes_Type;
import static parte_I.pp_fp07.enums.Brakes_Type.*;
import parte_I.pp_fp07.enums.Material_Type;
import static parte_I.pp_fp07.enums.Material_Type.*;

/**
 * Classe que contém a estrura de uma bicicleta de estrada
 */
public class RoadBike extends Bicycle {
    
    /**
     * @param MAX limite máximo de caracteres de uma observação
     */
    private final int MAX = 50;
    
    /**
     * @param handlebelt número de luzes
     */
    private int handlebelt;
    
    /**
     * @param frameSize tamanho do quadro
     */
    private int frameSize;
    
    /**
     * @param observation conjunto de observações
     */
    private String observation;

    public RoadBike(int handlebelt, int frameSize, String observation, int numberOfGears, String color, float wheelSize, Brakes_Type brake, Material_Type material, float price, int garantee) {

        super(numberOfGears, color, wheelSize, brake, material, price, garantee);
        this.handlebelt = handlebelt;
        this.frameSize = frameSize;
        this.observation = observation;
        material = CARBONO;
        brake = HIDRÁLICOS;
    }

    public int getHandlebelt() {
        return handlebelt;
    }

    public void setHandlebelt(int handlebelt) {
        this.handlebelt = handlebelt;
    }

    public int getFrameSize() {
        return frameSize;
    }

    public void setFrameSize(int frameSize) {
        this.frameSize = frameSize;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        
        if (observation.length() > MAX) {
            observation.lastIndexOf(MAX);
        }
        
        this.observation = observation;
    }
    
    /**
     * Método que vê todas as info de uma bicicleta de montanha
     */
    public void seeRoadBikeInfo() {
        super.seeBikeInfo("Road Bike");
        System.out.println("Handlebelt: " + handlebelt);
        System.out.println("Frame Size: " + frameSize);
        System.out.println("Observation: " + observation);
    }
}