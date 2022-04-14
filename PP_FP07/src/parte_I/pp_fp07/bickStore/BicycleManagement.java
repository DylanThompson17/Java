package parte_I.pp_fp07.bickStore;

/**
 * Classe que armazena conjunto de bicicletas que estão disponíveis para venda
 * Exercício 2.1
 */
public class BicycleManagement {
        
    /**
     * @param count número de bicicletas já compradas
     */
    private int count = 0;
    
    /**
     * @param MAX máximo de bicicletas à venda
     */
    private final int MAX = 20;
    
    /**
     * @param bike referência de uma bicicleta
     */
    private Bicycle[] bicycle = new Bicycle[MAX];
    
    /**
     * Método que verifica se pode ou não adicionar uma bicicleta para vender
     * @return true se possível, false caso contrário
     */
    private boolean verifySell() {
        
        if (count == MAX) {
            return false;
        }
        
        return true;
    }
    
    /**
     * Método que adiciona uma bicicleta à venda
     * @param bicycle bicicleta à venda
     */
    public void addBike(Bicycle bicycle) {
        
        if (verifySell() == true) {
            
            if (bicycle instanceof MountainBike) {
                
                this.bicycle[count] = bicycle;
                count++;
                System.out.printf("Mountain Bike with id: %d added with success\n", bicycle.getId());
                
            } else if (bicycle instanceof RoadBike) {
                
                this.bicycle[count] = bicycle;
                count++;
                System.out.printf("Road Bike with id: %d added with success\n", bicycle.getId());
            }
        
        } else {
            System.out.println("Não há espaço para mais bicicletas! «BIKE NOT ADDED!»");
        }
    }
    
    /**
     * Método que encontra uma bicicleta no array das bicicletas
     * @param bicycle bicicleta a ser procurada
     * @return posição da bicicleta no array se encontrado, ou -1 caso contrário
     */
    public int findBicicle(Bicycle bicycle) {
        
        if (bicycle == null) {
            return -1;
        }
        
        for (int i = 0; i < count; i++) {
            
            if (this.bicycle[i] == bicycle) {
                return i;
            }
        }
        
        return -1;
    }
    
    /**
     * Método que remove uma bicicleta do array das bicicletas à venda
     * @param bicycle bicicleta a ser removida
     */
    public void removeBike(Bicycle bicycle) {
        
        if (findBicicle(bicycle) != -1) {
            
            if (bicycle instanceof MountainBike) {
                System.out.printf("\nMountain Bike com id:%d removida\n", this.bicycle[findBicicle(bicycle)].getId());
            
            } else if (bicycle instanceof RoadBike) {
                System.out.printf("\nRoad Bike com id:%d removida\n", this.bicycle[findBicicle(bicycle)].getId());
            }
            
        
            for (int i = findBicicle(bicycle); i < count-1; i++) {
            
                this.bicycle[i] = this.bicycle[i+1];
            }
            
            this.bicycle[count-1] = null;
            count--;
        
        } else {
            System.out.printf("Bicicleta com id: %d não encontrada, «BIKE NOT FOUND!»", bicycle.getId());
        }
    }
    
    /**
     * Método que imprime todas as bicicletas que estão no array de bicicletas
     */
    public void seeAllBikes() {
        
        for (int i = 0; i < count; i++) {
            
            if (this.bicycle[i] instanceof MountainBike) {
                MountainBike mBike = (MountainBike)this.bicycle[i];
                mBike.seeMountainBikeInfo();
            }
            
            if (this.bicycle[i] instanceof RoadBike) {
                RoadBike rBike = (RoadBike)this.bicycle[i];
                rBike.seeRoadBikeInfo();
            }
            
            System.out.println();
        }
    }
    
    /**
     * Método que imprime info de uma bike contida no array das bikes
     * @param bicycle bike a ser imprimida os seus infos
     */
    public void seeBikeInfo(Bicycle bicycle) {
        
        if (findBicicle(bicycle) != -1) {
            
            if (bicycle instanceof RoadBike) {
                RoadBike rbike = (RoadBike)bicycle;
                rbike.seeRoadBikeInfo();
            
            } else if (bicycle instanceof MountainBike) {
                MountainBike mBike = (MountainBike)bicycle;
                mBike.seeMountainBikeInfo();
            }

        } else {
            System.out.printf("Bicicleta com id:%d não encontrada\n", bicycle.getId());
        }
    }
    
    // Exercício 2.2
    /**
     * Método que imprime info de uma bike se ela for de montanha
     * @param bicycle bicicleta a ser imprimida a sua info
     */
    public void seeOnlyMountainBikeInfo(Bicycle bicycle) {
        
        if (findBicicle(bicycle) != -1) {
            
            if (bicycle instanceof MountainBike) {
                MountainBike mBike = (MountainBike)bicycle;
                mBike.seeMountainBikeInfo();
            
            } else {
                System.out.println("A bicicleta não é de montanha");
            }

        } else {
            System.out.printf("Bicicleta com id:%d não encontrada\n", bicycle.getId());
        }
    }
}