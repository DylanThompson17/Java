package parte_I.pp_fp07.bickStore;

import static parte_I.pp_fp07.enums.BikeTools.*;
import static parte_I.pp_fp07.enums.Brakes_Type.*;
import static parte_I.pp_fp07.enums.Material_Type.*;
import static parte_I.pp_fp07.enums.Suspension_Type.*;

/**
 * Classe main que testa a classe BicycleManegement
 */
public class BicycleManegementDemo {

    public static void main(String[] args) {
        
        // instanceando uma bicycle manegement
        BicycleManagement bmanegement = new BicycleManagement();
        
        // instanceando 5 roads bikes
        RoadBike roadBike1, roadBike2, roadBike3, roadBike4, roadBike5;
        
        // instanceando 4 mountain bikes
        MountainBike mountainBike1, mountainBike2, mountainBike3, mountainBike4;
        
        // inicializando as road bikes
        roadBike1 = new RoadBike(3, 5, "Tem que ser gito", 13, "blue", 8, PINCAS, CARBONO, 6, 20);
        roadBike2 = new RoadBike(2, 15, "Bem feito", 10, "white",13, HIDRÁLICOS, CARBONO, 7, 13);
        roadBike3 = new RoadBike(3, 10, "Bonito", 9, "red", 5, HIDRÁLICOS, ALUNMINIO, 4, 18);
        roadBike4 = new RoadBike(4, 7, "Levezinho", 2, "yellow", 19, PINCAS, CARBONO, 9, 22);
        roadBike5 = new RoadBike(5, 4, "Normal", 4, "orange", 3, HIDRÁLICOS, ALUNMINIO, 4, 23);

        // inicializando as mountain bikes
        mountainBike1 = new MountainBike(5, "pink", 10, PINCAS, CARBONO, 40, 8, NO_SUSPENSION, 3);
        mountainBike2 = new MountainBike(7, "white", 5, HIDRÁLICOS, ALUNMINIO, 23, 12, DUPLA, 5);
        mountainBike3 = new MountainBike(15, "brown", 15, PINCAS, CARBONO, 35, 5, SIMPLES, 6);
        mountainBike4 = new MountainBike(21, "black", 9, HIDRÁLICOS, ALUNMINIO, 50, 13, NO_SUSPENSION, 4);
        
        // adicionar os utensílios no array dos utensílios da mountain bike 1
        mountainBike1.addUtensilio(ALFORJE);
        mountainBike1.addUtensilio(SUPORTE_PARA_TELEMOVEL);
        mountainBike1.addUtensilio(KIT_REPACACAO_PNEU);
        mountainBike1.addUtensilio(GARRAFA_de_AGUA);
        mountainBike1.addUtensilio(GARRAFA_de_AGUA);
        mountainBike1.addUtensilio(CONTA_QUILOMETROS);
        mountainBike1.addUtensilio(CONTA_QUILOMETROS);
        
        // adicionar os road bikes no array de bicicletas
        bmanegement.addBike(roadBike1);
        bmanegement.addBike(roadBike2);
        bmanegement.addBike(roadBike3);
        bmanegement.addBike(roadBike4);
        bmanegement.addBike(roadBike5);
        
        // adicionar as moauntain bikes no array de bicicletas
        bmanegement.addBike(mountainBike1);
        bmanegement.addBike(mountainBike2);
        bmanegement.addBike(mountainBike3);
        bmanegement.addBike(mountainBike4);
        
        // vê info de todas as bikes contidas no array
        bmanegement.seeAllBikes();
        
        // remover a road bike 5 do array das bicicletas
        bmanegement.removeBike(roadBike5);
        
        /*
        vê info de todas as bikes contidas no array
        repara que a bike 5 foi removida
        */
        bmanegement.seeAllBikes();
        
        // vê info de uma bike qualquer
        bmanegement.seeBikeInfo(roadBike5); // não encontrada já foi removida
        bmanegement.seeBikeInfo(roadBike3);
        bmanegement.seeBikeInfo(mountainBike2);
        
        /*
        vê info de uma bike de montanha, se a bike não for de montanha
        não e mostrada nenhuma info
        Ex 2.2 -> teste
        */
        bmanegement.seeOnlyMountainBikeInfo(roadBike3);
        bmanegement.seeOnlyMountainBikeInfo(mountainBike1);
    }
}