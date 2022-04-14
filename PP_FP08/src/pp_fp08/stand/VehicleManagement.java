package pp_fp08.stand;

/**
 * Classe que armazena um conjunto de veículos que estão disponíveis para venda
 */
public class VehicleManagement {
    
    /**
     * @param MAX valor máximo inicialmente suportado pelo array de armazenamento de veículos
     */
    private int MAX = 1;
    
    /**
     * @param count número de veículos contido no array
     */
    private int count = 0;
    
    /**
     * @param vehicles array dos veículos
     */
    private Vehicle[] vehicles = new Vehicle[MAX];
    
    /**
     * Método que aumenta o tamanho do array dos veículos
     */
    private void largeVehicles() {
        
        // se o array estiver cheio
        if (count == MAX) {

            // cria um novo array de veículos com o mesmo tamanho
            Vehicle[] newVehicles = new Vehicle[vehicles.length];
            
            for (int i = 0; i < vehicles.length; i++) {
                
                // manda tudo do antigo array para o novo
                newVehicles[i] = vehicles[i];
            }
            
            // define um novo tamahno para o antigo array
            vehicles = new Vehicle[MAX*2];
            
            for (int i = 0; i < newVehicles.length; i++) {
                
                // manda tudo do novo array para o antigo array
                vehicles[i] = newVehicles[i];
            }
            
            // define um novo máximo temporário
            MAX = vehicles.length;
        }
    }
    
    /**
     * Método que verifica se pode ou não adicionar um veículo no array
     * @param vehicle veículo a ser adicionado
     * @return true se possível, false caso contrário
     */
    private boolean verifyAddVehicle(Object vehicle) {
        
        // verifica se é null
        if (vehicle == null) {
            return false;
        }
        
        // verifica se não existe um com o mesmo número de chassis
        for (int i = 0; i < count; i++) {
            
            if (this.vehicles[i].equals(vehicle)) {
                
                return false;
            }
        }

        return true;
    }
    
    /**
     * Método que adicona um veículo no array
     * @param vehicle veículo a adicionar
     */
    public void addVehicle(Vehicle vehicle) {
        
        if (verifyAddVehicle(vehicle) == true) {
            
            largeVehicles();
            
            this.vehicles[count] = vehicle;
            count++;
        }
    }
    
    /**
     * Método que encontra um veículo no array
     * @param vehicle veículo a ser procurado
     * @return posição do veículo no array se encontrado, ou -1 caso não encontrado
     */
    private int findVehicle(Vehicle vehicle) {
        
        for (int i = 0; i < count; i++) {
            
            if (this.vehicles[i].getId() == vehicle.getId()) {
                
                return i;
            }
        }
        
        return -1;
    }
    
    /**
     * Método que remove um veículo do array
     * @param vehicle veículo a ser removido
     */
    public void removeVehicle(Vehicle vehicle) {
        
        System.out.print("Removing vehicle: ");
        if (findVehicle(vehicle) != -1) {
            
            System.out.println("«Vehicle removed, id: " + this.vehicles[findVehicle(vehicle)].getId() + "»");
            
            for (int i = findVehicle(vehicle); i < count-1; i++) {
                
                vehicles[i] = vehicles[i+1];
            }
            
            vehicles[count-1] = null;
            count--;
            
        } else {
            System.out.println("«Vehicle not found»");
        }
    }
    
    /**
     * Ex 2.5
     * Contar quantos veículos estão disponíveis para
     * @return String com informação adequada por tipologia dos veículos
     */
    public String allVehicles() {
        
        if (count > 0) {
            
            int cars = 0, trucks = 0, bikes = 0;
            
            for (int i = 0; i < count; i++) {
                
                // verifica se o veíiculo é um Automóvel
                if (this.vehicles[i] instanceof Automovel) {
                    cars++;
                
                // verifica se o veíiculo é um Motociclo
                } else if (this.vehicles[i] instanceof Motociclo) {
                    bikes++;
                    
                // verifica se o veíiculo é um Pesado
                } else if (this.vehicles[i] instanceof Pesado) {
                    trucks++;
                }
            }
            
            return "There is " + count + " vehicles: " + cars + " Cars, " + bikes + " Bikes, " + trucks + " Trucks";
            
        } else {
            return "There is no vehicle to sell!";
        }
    }
    
    /**
     * Médoto que lista todos os veículos do array
     */
    public void listAllVehicles() {
     
        System.out.println("All vehicles:");
        
        if (count > 0) {
            
            
            for (int i = 0; i < count; i++) {
                
                System.out.println("  " + vehicles[i].toString());
                
                /* por completar !!!
                // se o veículo for um Pesado, listar as suas trailers
                if (vehicles[i] instanceof Pesado) {
                    //vehicles[i].seeAllTrailers();
                }*/
            }
            
        } else {
            System.out.println("  " + "There is no vehicles!");
        }
    }
}