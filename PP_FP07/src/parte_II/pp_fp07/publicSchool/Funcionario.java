package parte_II.pp_fp07.publicSchool;

import parte_II.pp_fp07.enums.Contrato;

/**
 * Classe que contém a estrutura de um funcionário
 */
public class Funcionario extends Pessoa {
    
    /**
     * @param codigo código de um funcionário
     */
    private int codigo;
    
    /**
     * @param contrato tipo de contrato de um funcionário
     */
    private Contrato contrato;

    public Funcionario(int codigo, Contrato contrato, String name, String birthday, String address, String cartaoCidadao, int nif) {
        super(name, birthday, address, cartaoCidadao, nif);
        this.codigo = codigo;
        this.contrato = contrato;
    }

    public int getCodigo() {
        return codigo;
    }

    public Contrato getContrato() {
        return contrato;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }

    /**
     * Método toString da classe Funcionario
     * Imprime os valores atribuídos nas variáveis de instâncias
     * @return String que contém os valores atribuídos nas variáveis de 
     * instâncias e as suas referências
     */
    @Override
    public String toString() {
        return "Funcionario{" + "codigo=" + codigo + ", contrato=" + contrato + '}';
    }
}