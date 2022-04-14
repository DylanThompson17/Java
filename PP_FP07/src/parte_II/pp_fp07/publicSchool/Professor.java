package parte_II.pp_fp07.publicSchool;

import parte_II.pp_fp07.enums.Contrato;

/**
 * Classe que contém a estrutura de um professor
 */
public class Professor extends Pessoa {
    
    /**
     * @param MAX número máximo de unidades curriculares que um professor leciona
     */
    private final int MAX = 3;
    
    /**
     * @param count número de unidades curriculares que o professor está a lecionar
     */
    private int count = 0;
    
    /**
     * @param sigla sigla de um professor
     */
    private String sigla;
    
    /**
     * @param contrato tipo de contrato de um funcionário
     */
    private Contrato contrato;
    
    /**
     * @param uc conjunto de unidade curriculares que um professor leciona
     */
    private UnidadeCurricular[] uc;

    public Professor(String sigla, Contrato contrato, String name, String birthday, String address, String cartaoCidadao, int nif) {
        super(name, birthday, address, cartaoCidadao, nif);
        this.sigla = sigla;
        this.contrato = contrato;
        this.uc = new UnidadeCurricular[MAX];
    }

    public String getSigla() {
        return sigla;
    }

    public Contrato getContrato() {
        return contrato;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }

    public UnidadeCurricular[] getUc() {
        return uc;
    }

    public void setUc(UnidadeCurricular[] uc) {
        this.uc = uc;
    }
    
    /**
     * Método que verifica se o professor pode ou não lecionar em mais uc's
     * @param uc unidade curricular a ser verificado
     * @return true se possível, false caso contrário
     */
    private boolean verifyAddUc(UnidadeCurricular uc) {
        
        // verifica se é nulo
        if (uc == null) {
            System.out.println("Unidade curricular nulo «Não adicionado!»");
            return false;
        }
        
        // verifica se existe espaço
        if (count == MAX) {
            return false;
        }
        
        // verifica se não existe
        for (int i = 0; i < count; i++) {
            
            if (this.uc[i] == uc) {
                return false;
            }
        }
        
        return true;
    }
    
    /**
     * Método que adiciona uma uc na lista das uc's que o professor leciona
     * @param uc unidade curricular a ser adicionado
     */
    public void addUC(UnidadeCurricular uc) {
        
        if (verifyAddUc(uc) == true) {
            
            this.uc[count] = uc;
            count++;
        }
    }
    
    /**
     * Método que encontra uma unidade curricular que o professor leciona
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
     * Método que elimina uma uc da lista das uc's que o professor leciona
     * @param uc unidade curricular a remover da lista
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
     * Método que lista todas as uc's que o professor leciona
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
            System.out.println("Professor não leciona nenhuma unidade curricular");
        }
    }

    /**
     * Método toString da classe Professor
     * Imprime os valores atribuídos nas variáveis de instâncias
     * @return String que contém os valores atribuídos nas variáveis de 
     * instâncias e as suas referências
     */
    @Override
    public String toString() {
        return "{" + " sigla: " + sigla + ", contrato: " + contrato + '}';
    }
}