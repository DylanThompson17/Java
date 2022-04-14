package pp_fp05.expenses;

public class User {
    
    /*protected final int EXPENSE_SIZE = 31;
    
    protected int id;
    
    protected String nome;
    
    protected String email;
    
    protected String birthDate;
    
    protected Expense[] expenses;*/
    
    private final int EXPENSE_SIZE = 31;
    
    public int id;
    
    public String nome;
    
    public String email;
    
    public String birthDate;
    
    public Expense[] expenses;
    
    public User(int nextId, String tempNome, String tempMail, String tempBirthDate) {
        expenses = new Expense[EXPENSE_SIZE];
        id = nextId++;
        nome = tempNome;
        email = tempMail;
        birthDate = tempBirthDate;
    }
}