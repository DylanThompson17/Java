package pp_fp05.cd;

import pp_fp05_ex2.Track;

public class CDDemo {

    public static void main(String[] args) {
        
        Artist a1 = new Artist("Artistat 1", "1977-03-04", "German");
        Artist[] artists = {a1};
        
        Track t1 = new Track(1, "Ho Hey", 90, "Luminieers");
        Track t2 = new Track(2, "Stubborn Love", 105, "Wesley Schltz");
        
        CD cd = new CD("The Lumineers", "The Lumineers", 2012, "Dualtone Records", 195, artists);
        
        //CD cd = new CD("The Lumineers", "The Lumineers", 2012, "Dualtone Records", 195, artists, t1);
        
        cd.tracks[0] = t1;
        cd.tracks[14] = t2;
        
        int nTracks = cd.tracks.length;
        for (int i = 0; i < nTracks; i++) {
            if (cd.tracks[i] != null) {
                Track t = cd.tracks[i];
                System.out.println("Nome do cd: " + t.nomeFaixa);
                System.out.println("Ano de lançamento: " + cd.anoLancamento);
                System.out.println("Editora: " + cd.editora);
                System.out.println("Música número: " + t.numeroFaixa + " com título: " + t.nomeFaixa);
                System.out.println("Duração (em segundos): " + t.duracao);
                System.out.println("Autor da música: " + t.nomeAutor);
            }
        }
    }   
}