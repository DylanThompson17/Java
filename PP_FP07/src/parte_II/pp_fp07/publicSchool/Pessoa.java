package parte_II.pp_fp07.publicSchool;

/**
 * Classe que contém a estrutura de uma pessoa
 */
public class Pessoa {
    
    /**
     * @param name nome de uma pessoa
     */
    private String name;
    
    /**
     * @param birthday data de nascimento de uma pessoa
     */
    private String birthday;
    
    /**
     * @param address morada de uma pessoa
     */
    private String address;
    
    /**
     * @param cartaoCidadao número de cartão de cidadão de uma pessoa
     */
    private String cartaoCidadao;
    
    /**
     * @param nif número de nif de uma pessoa
     */
    private int nif;

    public Pessoa(String name, String birthday, String address, String cartaoCidadao, int nif) {
        this.name = name;
        this.birthday = birthday;
        this.address = address;
        this.cartaoCidadao = cartaoCidadao;
        this.nif = nif;
    }

    public String getName() {
        return name;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCartaoCidadao() {
        return cartaoCidadao;
    }

    public int getNif() {
        return nif;
    }

    /**
     * Método toString da classe Pessoa
     * Imprime os valores atribuídos nas variáveis de instâncias
     * @return String que contém os valores atribuídos nas variáveis de 
     * instâncias e as suas referências
     */
    @Override
    public String toString() {
        return "Pessoa{" + "name=" + name + ", birthday=" + birthday + ", address=" + address + ", cartaoCidadao=" + cartaoCidadao + ", nif=" + nif + '}';
    }
}