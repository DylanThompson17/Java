package pp_fp08.stand;

import pp_fp08.enums.Condition;
import pp_fp08.enums.Origin;
import pp_fp08.enums.TrailerType;
import pp_fp08.enums.TruckType;

/**
 * Classe main do exercício 2
 */
public class VehicleManagementDemo {

    public static void main(String[] args) {
        
        // instanceando e inicializando uma SemiTrailer
        SemiTrailer semiTrailer = new SemiTrailer(5, 9);
        
        // instanceando e inicializando um TowHaul
        TowHaul towHaul = new TowHaul(TrailerType.OPEN, 4);
        
        // instanceando e inicializando dois Automóveis
        Automovel car1 = new Automovel (2, 4, "Car 1", "XPTO", "13/04/2022", Origin.NATIONAL, 7, Condition.NEW, 1500);
        Automovel car2 = new Automovel (5, 7, "Car 1", "XPTO", "13/04/2022", Origin.IMPORTED, 8, Condition.USED, 1500);
        
        // instanceando e inicializando quatro Motociclos
        Motociclo bike1 = new Motociclo(6, 5, 7, "bike 1", "ABCD", "13/04/2022", Origin.IMPORTED, 7, Condition.USED, 1000);
        Motociclo bike2 = new Motociclo(4, 11, 11, "bike 2", "ABCD", "13/04/2022", Origin.NATIONAL, 4, Condition.USED, 1300);
        Motociclo bike3 = new Motociclo(9, 15, 9, "bike 3", "ABCD", "13/04/2022", Origin.IMPORTED, 8, Condition.NEW, 1600);
        Motociclo bike4 = new Motociclo(2, 12, 8, "bike 4", "ABCD", "13/04/2022", Origin.NATIONAL, 11, Condition.NEW, 1600);
        
        // instanceando e inicializando três Pesados
        Pesado truck1 = new Pesado(15, 10, TruckType.TRUCK, 11, "truck 1", "WXYZ", "13/04/2022", Origin.NATIONAL, 6, Condition.NEW, 2000);
        Pesado truck2 = new Pesado(10, 9, TruckType.TIR, 12, "truck 2", "WXYZ", "13/04/2022", Origin.NATIONAL, 7, Condition.NEW, 2000);
        Pesado truck3 = new Pesado(12, 6, TruckType.TRUCK, 14, "truck 3", "ZYXW", "13/04/2022", Origin.NATIONAL, 4, Condition.USED, 2000);
        
        truck2.addTrailer(semiTrailer); // adicionar uma trailer do tipo SemiTrailer ao truck2
        truck2.addTrailer(towHaul); // adicionar uma trailer do tipo TowFaul ao truck2
        
        // instanceando e inicializando a classe VehicleManagement
        VehicleManagement manage = new VehicleManagement();
        
        // adicionando os veículos no array
        manage.addVehicle(car1);
        manage.addVehicle(car2);
        manage.addVehicle(bike1);
        manage.addVehicle(bike2);
        manage.addVehicle(bike2);
        manage.addVehicle(bike3);
        manage.addVehicle(bike4);
        manage.addVehicle(truck1);
        manage.addVehicle(truck2);
        //manage.addVehicle(truck3);
        
        // listar todos os veículos do array
        manage.listAllVehicles();
        
        // Ex 2.3 teste -> listar total dos veículos e a quantidade por tipologia
        System.out.println(manage.allVehicles());
        
        // remover alguns veículos
        manage.removeVehicle(bike2);
        manage.removeVehicle(truck3); // não deverá ser encontrado, pois não foi adicionado
        
        // listar todos os veículos do array, note as diferenças
        manage.listAllVehicles();
        
        // listar total dos veículos e a quantidade por tipologia
        System.out.println(manage.allVehicles());
    }   
}