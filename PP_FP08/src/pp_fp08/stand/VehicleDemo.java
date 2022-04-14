package pp_fp08.stand;

import pp_fp08.enums.Condition;
import pp_fp08.enums.Origin;
import pp_fp08.enums.TrailerType;
import pp_fp08.enums.TruckType;

/**
 * Classe main do exercício 1.3
 */
public class VehicleDemo {

    public static void main(String[] args) {

        // instanceando e inicializando uma SemiTrailer
        SemiTrailer semiTrailer = new SemiTrailer(5, 9);
        
        // chamando o método toString da classe SemiTrailer
        System.out.println(semiTrailer.toString());
        
        // instanceando e inicializando um TowHaul
        TowHaul towHaul = new TowHaul(TrailerType.OPEN, 4);
        /*
        por omissão qualquer Trailer tem dois números de eixos
        alterar do towHaul para 3
        */
        towHaul.setExesNumber(3);
        
        // chamando o método toString da classe TowHaul
        System.out.println(towHaul.toString());
        
        // instanceando e inicializando dois Automóveis
        Automovel car1 = new Automovel (2, 4, "Car 1", "XPTO", "13/04/2022", Origin.NATIONAL, 7, Condition.NEW, 1500);
        Automovel car2 = new Automovel (5, 7, "Car 1", "XPTO", "13/04/2022", Origin.IMPORTED, 8, Condition.USED, 1500);
        /*
        por omissão um automóvel tem 3 portas
        alterar para 4 apenas no car2
        */
        car2.setDoorsNumber(4);
        
        /*
        chamar o método toString da classe Automovel
        verificar o preço dos Automóveis
        do car1 deverá permanecer, já do car2 não
        */
        System.out.println(car1.toString());
        System.out.println(car2.toString());

        // instanceando e inicializando um Motociclo
        Motociclo bike = new Motociclo(2, 5, 7, "Brand 2", "ABCD", "13/04/2022", Origin.IMPORTED, 7, Condition.USED, 1000);
        
        // chamar o método toString da classe Motociclo
        System.out.println(bike.toString());
        
        // instanceando e inicializando três Pesados
        Pesado truck1 = new Pesado(15, 10, TruckType.TRUCK, 11, "truck 1", "WXYZ", "13/04/2022", Origin.NATIONAL, 6, Condition.NEW, 2000);
        truck1.addTrailer(semiTrailer); // adicionar uma trailer do tipo SemiTrailer ao truck1
        truck1.addTrailer(towHaul); // adicionar uma trailer do tipo TowFaul ao truck1
        Pesado truck2 = new Pesado(10, 9, TruckType.TIR, 12, "truck 2", "WXYZ", "13/04/2022", Origin.NATIONAL, 7, Condition.NEW, 2000);
        Pesado truck3 = new Pesado(12, 6, TruckType.TRUCK, 14, "truck 3", "ZYXW", "13/04/2022", Origin.NATIONAL, 4, Condition.USED, 2000);
        
        /*
        chamar o método toString da classe Pesado
        verificar o preço dos Pesados
        do truck 1 deverá mudar, tem atrelado e é novo
        do truck 2 deverá permaner, não tem atrelado e é novo
        do truck 3 deverá mudar, última opção dos descontos para os Pesados
        */
        System.out.println(truck1.toString());
        System.out.println(truck2.toString());
        System.out.println(truck3.toString());
        
        // listar todos os atrelados do truck1
        truck1.seeAllTrailers();
        
        // remover o atrelado semiTrailer do truck1
        truck1.removeTrailer(semiTrailer);
        //truck1.removeTrailer(towHaul);
        
        /*
        listar todos os atrelados do truck1, repara a diferença
        */
        truck1.seeAllTrailers();
    }   
}