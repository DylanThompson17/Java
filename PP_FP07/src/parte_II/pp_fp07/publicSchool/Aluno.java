package parte_II.pp_fp07.publicSchool;

/**
 * Classe que contém a estrutura de um aluno
 */
public class Aluno extends Pessoa{
    
    /**
     * @param MAX número máximo de unidades curriculares que frequenta
     */
    private final int MAX = 6;
    
    /**
     * @param count número de unidades curriculares que o aluno está afrequentar
     */
    private int count = 0;
    
    /**
     * @param codigo código de um aluno
     */
    private int codigo;
    
    /**
     * @param uc conjunto de unidades curriculares que um aluno frequenta
     */
    private UnidadeCurricular[] uc;

    public Aluno(int codigo, String name, String birthday, String address, String cartaoCidadao, int nif) {
        super(name, birthday, address, cartaoCidadao, nif);
        this.codigo = codigo;
        this.uc = new UnidadeCurricular[MAX];
    }

    public int getCodigo() {
        return codigo;
    }

    public UnidadeCurricular[] getUc() {
        return uc;
    }

    public void setUc(UnidadeCurricular[] uc) {
        this.uc = uc;
    }
    
    /**
     * Método que verifica se o aluno pode ou não inscrever em mais ucs
     * @param uc unidade curricular que o aluno quer se inscrever
     * @return true se possível, false caso contrário
     */
    private boolean verifyAddUc(UnidadeCurricular uc) {
        
        if (uc == null) {
            return false;
        }
        
        if (count == MAX) {
            return false;
        }
        
        for (int i = 0; i < count; i++) {
            
            if (this.uc[i] == uc) {
                return false;
            }
        }
        
        return true;
    }
    
    /**
     * Método que inscreve o aluno em mais uma unidade curricular
     * @param uc unidade curricular a ser adicionado
     */
    public void addUC(UnidadeCurricular uc) {
        
        if (verifyAddUc(uc) == true) {
            
            this.uc[count] = uc;
            count++;
        }
    }
    
    /**
     * Método que encontra uma unidade curricular que o aluno se encontra inscrito
     * @param uc unidade curricular a ser encontrado
     * @return posição da uc no array se encontrado, ou -1 caso contrário
     */
    private int findUc(UnidadeCurricular uc) {
        
        for (int i = 0; i < count; i++) {
            
            if (this.uc[i] == uc) {
                return i;
            }
        }
        
        return -1;
    }
    
    /**
     * Método que desinscreve um aluno de uma unidade curricular
     * @param uc unidade curricular a remover a inscrição
     */
    public void removeUc(UnidadeCurricular uc) {
        
        if (findUc(uc) != -1) {
            
            for (int i = findUc(uc); i < count-1; i++) {
                
                this.uc[i] = this.uc[i+1];
            }
            
            this.uc[count-1] = null;
            count--;
        }
    }
    
    /**
     * Método que lista todas as uc's que o aluno se encontra inscrito
     */
    public void listAllUc() {
        
        if (count > 0) {
            
            for (int i = 0; i < count; i++) {
                
                if (i == 0) {
                    System.out.println("\tUnidades curriculares");
                }
                
                System.out.println(uc[i].toString());
            }
        
        } else {
            System.out.println("Aluno não se encontra inscrito em nenhuma unidade curricular");
        }
    }

    /**
     * Método toString da classe Aluno
     * Imprime os valores atribuídos nas variáveis de instâncias
     * @return String que contém os valores atribuídos nas variáveis de 
     * instâncias e as suas referências
     */
    @Override
    public String toString() {
        return "Aluno {" + " codigo=" + codigo + '}';
    }
}