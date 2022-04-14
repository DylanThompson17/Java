package pp_fp04.book;

/**
 * <h3>
 * ESTGF - Escola Superior de Tecnologia e Gestão de Felgueiras<br>
 * IPP - Instituto Politécnico do Porto<br>
 * LSIRC - Licenciatura em Segurança Informática em Redes de Computadores<br>
 * PP - Paradigmas de Programação / Programing Paradigms<br>
 * </h3>
 * <p>
 * <strong>Descrição: </strong><br>
 * Class that represents the book structure
 * </p>
 */
public class Book {
    
    protected static char[] titulo = new char[20];
    protected static char[] editor = new char[15];
    protected static Authors autor1, autor2;
    protected static char[] ano = new char[10];
    protected static int paginas;
    protected static Critico critico1, critico2, critico3;
}