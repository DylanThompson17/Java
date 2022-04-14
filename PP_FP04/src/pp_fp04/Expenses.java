package pp_fp04;

/**
 * <h3>
 * ESTGF - Escola Superior de Tecnologia e Gestão de Felgueiras<br>
 * IPP - Instituto Politécnico do Porto<br>
 * LSIRC - Licenciatura em Segurança Informática em Redes de Computadores<br>
 * PP - Paradigmas de Programação / Programing Paradigms<br>
 * </h3>
 * <p>
 * <strong>Descrição: </strong><br>
 * Class that represents the expense structure
 * </p>
 */
public class Expenses {
    
    private static final int NUMBER_OF_DAYS = 31;//para o mês de março
    
    //Para despesas com o automóvel
    protected static int number1;
    /**
     * Vetor com o valor das despesas de automóvel durante o dia do mês
     * (o índece do vetor corresposnde ao dia do mês)
     */
    protected static double[] carValues = new double[NUMBER_OF_DAYS];//em Euros
    protected static char[] descriptionCar = new char[]{'C','A','R'};
    
    //Para despesas alimentares;
    protected static int number2;
    protected static double[] foodValues = new double[NUMBER_OF_DAYS];//em Euros
    protected static char[] descriptionFood = new char[]{'F','O','O','D'};
}