package parte_I.pp_fp07.bickStore;

import static parte_I.pp_fp07.enums.BikeTools.*;
import static parte_I.pp_fp07.enums.Brakes_Type.*;
import static parte_I.pp_fp07.enums.Material_Type.*;
import static parte_I.pp_fp07.enums.Suspension_Type.*;

/**
 * Classe main do exercício 1.3
 */
public class BikeDemo {

    public static void main(String[] args) {
        
        RoadBike roadBike; // instanceando uma road bike
        MountainBike mountainBike; // instanceando uma mountain bike

        // inicializando a road bike
        roadBike = new RoadBike(3, 5, "Tem que ser giro", 4, "blue", 4, HIDRÁLICOS, ALUNMINIO, 350, 2);
        
        // inicializando a mountain bike
        mountainBike = new MountainBike(3, "yellow", 6,PINCAS , CARBONO, 250, 2, NO_SUSPENSION, 6);
        
        roadBike.seeRoadBikeInfo(); // ver todas as infos da road bike
        mountainBike.seeMountainBikeInfo(); // ver todas as infos da mountain bike
        
        /*
        adicionar sete utensílios no array dos utensílios da mounatin bike
        apenas cinco serão adicionados, não será adicionado um já existente
        */
        mountainBike.addUtensilio(ALFORJE);
        mountainBike.addUtensilio(SUPORTE_PARA_TELEMOVEL);
        mountainBike.addUtensilio(KIT_REPACACAO_PNEU);
        mountainBike.addUtensilio(GARRAFA_de_AGUA);
        mountainBike.addUtensilio(GARRAFA_de_AGUA);
        mountainBike.addUtensilio(CONTA_QUILOMETROS);
        mountainBike.addUtensilio(CONTA_QUILOMETROS);
        
        mountainBike.seeAllUtensilios(); // ver todos os utensílios
        
        mountainBike.removeUtensilio(ALFORJE); // remover um utensílio, neste caso ALFORJE
        
        /*
        ver todos os utensílios
        repara que o ALFORJE foi removido
        */
        mountainBike.seeAllUtensilios();
        
        mountainBike.addUtensilio(ALFORJE); // adicione o ALFORJE de novo
        
        /*
        ver todos os utensílios
        repara que o ALFORJE foi adicionado
        */
        mountainBike.seeAllUtensilios();
    }   
}