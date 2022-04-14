package pp_fp04;

/**
 * <h3>
 * ESTGF - Escola Superior de Tecnologia e Gestão de Felgueiras<br>
 * IPP - Instituto Politécnico do Porto<br>
 * LSIRC - Licenciatura em Segurança Informática em Redes de Computadores<br>
 * PP - Paradgmas de Programação / Programing Paradigms<br>
 * <h3>
 * <p>
 * <strong>Description: </strong></br>
 * Class that represents the user stucture
 * </p>
 */
public class User {
    private static final int ID_SIZE = 3;
    protected static char[] id = new char[ID_SIZE];
    protected static char[] name;
    protected static char[] email;
    
    /*
    Ex: 2.2
    Associando as despesas ao utilizador
    */
    protected static Expenses expense;
    
    
    /*
    Ex: 2.4
    Colocando as variáveis de classe com o modificador de acesso private
    Comente as declaraçoes anteriores e descomente isso, e veja o erro nas 
    classes main's
    */
    /*
    private static char[] id = new char[ID_SIZE];
    private static char[] name;
    private static char[] email;
    private static Expenses expense;
    */
    //O modificador private impede que a variável seja acedida fora da classe
}