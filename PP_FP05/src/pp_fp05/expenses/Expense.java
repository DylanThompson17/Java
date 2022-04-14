package pp_fp05.expenses;

public class Expense {

    /*protected int id;
    
    protected String type;
    
    protected float amount;
    
    protected String date;*/
    
    public int id;
    
    public String type;
    
    public float amount;
    
    public String date;
    
    public Expense(int nextId, String tempType, float tempAmount, String tempDate) {
        id = nextId++;
        type = tempType;
        date = tempDate;
        amount = tempAmount;
    }
}