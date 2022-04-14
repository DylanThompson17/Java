package pp_fp05.cd;

import pp_fp05_ex2.Track;

public class CD {
    
    public String nomeBanda;
    
    public String nomeCD;
    
    public int temporal;
    
    public int anoLancamento;
    
    public String editora;
    
    public Artist[] artists;
    
    public Track[] tracks;
    
    public Track track;
    
    public CD(String banda, String cd, int ano, String tempEditora,  int tempTemporal, Artist[] artists/*, Track tempTrack*/) {
        nomeBanda = banda;
        nomeCD = cd;
        temporal = tempTemporal;
        anoLancamento = ano;
        editora = tempEditora;
        artists = new Artist[5];
        tracks = new Track[15];
    }
    
    public CD(String banda, String cd, int ano, String tempEditora,  int tempTemporal, Artist[] artists, int faixas, Track tempTrack) {
        nomeBanda = banda;
        nomeCD = cd;
        temporal = tempTemporal;
        anoLancamento = ano;
        editora = tempEditora;
        artists = new Artist[5];
        tracks = new Track[faixas];
        track = tempTrack;
    }
}