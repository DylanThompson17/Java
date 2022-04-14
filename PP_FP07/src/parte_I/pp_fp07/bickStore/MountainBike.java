package parte_I.pp_fp07.bickStore;

import parte_I.pp_fp07.enums.Material_Type;
import parte_I.pp_fp07.enums.Suspension_Type;
import parte_I.pp_fp07.enums.BikeTools;
import parte_I.pp_fp07.enums.Brakes_Type;

/**
 * Classe que define a estrutura de uma bicicleta de montanha
 */
public class MountainBike extends Bicycle{
    
    /**
     * @param numberOfLights número de luzes da bicicleta
     */
    private int numberOfLights;
    
    /**
     * @param suspension tipo de suspensão da bicicleta
     */
    private Suspension_Type suspension;
    
    /**
     * @param utensilios conjunto de utensílios
     */
    private BikeTools [] utensilios;
    
    /**
     * @param MAX_UTEN máximo de utensílios
     */
    private final int MAX_UTEN = 5;
    
    /**
     * @param count contador de utensílios
     */
    private int count = 0;
    
    public MountainBike (int numberOfGears, String color, float wheelSize, Brakes_Type brake, Material_Type materail, float price, int guarence, Suspension_Type suspension, int numberOfLights) {

        super(numberOfGears, color, wheelSize, brake, materail, price, guarence);
        this.suspension = suspension;
        this.numberOfLights = numberOfLights;
        utensilios = new BikeTools[MAX_UTEN];
    }

    public int getNumberOfLights() {
        return numberOfLights;
    }

    public void setNumberOfLights(int numberOfLights) {
        this.numberOfLights = numberOfLights;
    }

    public Suspension_Type getSuspension() {
        return suspension;
    }

    public void setSuspension(Suspension_Type suspension) {
        this.suspension = suspension;
    }

    public BikeTools[] getUtensilios() {
        return utensilios;
    }

    public void setUtensilios(BikeTools[] utensilios) {
        this.utensilios = utensilios;
    }
    
    /**
     * Método que verifica se pode ou não adicionar o utensílio no array dos utensílios
     * @param utensilio utensílio a ser verificado
     * @return true se possível, false caso contrário
     */
    private boolean verifyAddUten(BikeTools utensilio) {
        
        if (utensilio == null) {
            System.out.println("Utensílio nulo «Utensílio não adicionado!»");
            return false;
        }
        
        if (count == MAX_UTEN) {
            System.out.println("Já não pode adicionar mais utensílios «Utensílio não adicionado!»");
            return false;
        }
        
        for (int i = 0; i < count; i++) {
            
            if (utensilios[i] == utensilio) {
                System.out.printf("Utensílio '%s' já existente «Utensílio não adicionado!»\n", utensilio);
                return false;
            }
        }
        
        System.out.printf("Utensílio '%s' adicionado com sucesso\n", utensilio);
        return true;
    }
    
    /**
     * Método que adiciona um utensílio no array dos utensílios
     * @param utensilio utensílio a ser adicionado
     */
    public void addUtensilio(BikeTools utensilio) {
        
        if (verifyAddUten(utensilio) == true) {
            utensilios[count] = utensilio;
            count++;
        }
    }
    
    /**
     * Método que encontra um utensílio no array dos utensílios
     * @param utensilio utensílio a ser procurado
     * @return posição do utensílio no array ou -1 se não encontrado
     */
    private int findUtensilio(BikeTools utensilio) {
        
        for (int i = 0; i < count; i++) {
            
            if (utensilios[i] == utensilio) {
                return i;
            }
        }

        return -1;
    }
    
    /**
     * Método que remove um utensílio do array dos utensílios
     * @param utensilio utensílio a ser removido
     */
    public void removeUtensilio(BikeTools utensilio) {
        
        if (findUtensilio(utensilio) != -1) {
            
            System.out.printf("Utensílio '%s' removido com sucesso\n", utensilio);
            
            for (int i = findUtensilio(utensilio); i < count-1; i++) {
                
                utensilios[i] = utensilios[i+1];
            }
            
            utensilios[count-1] = null;
            count--;
        
        } else {
            System.out.printf("Utensílio '%s' não encontrado!", utensilio);
        }
    }
    
    /**
     * Método que imprime todos os utensílios contidos no array
     */
    public void seeAllUtensilios() {
        
        for (int i = 0; i < count; i++) {
            
            if (i == 0) {
                System.out.printf("Todos os utensílios: \n%s", utensilios[i]);
            
            } else {
                System.out.print(" | " + utensilios[i]);
            }
        }
        System.out.println();
    }
    
    /**
     * Método que vê todas as info de uma bicicleta de montanha
     */
    public void seeMountainBikeInfo() {
        super.seeBikeInfo("Mountian Bike");
        System.out.println("Number of lights: " + numberOfLights);
        System.out.println("Syspension: " + suspension);
        seeAllUtensilios();
    }
}