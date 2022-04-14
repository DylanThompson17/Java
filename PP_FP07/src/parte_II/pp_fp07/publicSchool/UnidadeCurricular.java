package parte_II.pp_fp07.publicSchool;

import parte_II.pp_fp07.enums.Ano;
import parte_II.pp_fp07.enums.Semestre;

/**
 * Classe que contém a estrutura de uma unidade curricular
 */
public class UnidadeCurricular {
    
    /**
     * @param name nome da unidade curricular
     */
    private String name;
    
    /**
     * @param sigla sigla da unidade curricular
     */
    private String sigla;
    
    /**
     * @param courseName nome do curso
     */
    private String courseName;
    
    /**
     * @param year ano letivo
     */
    private Ano year;
    
    /**
     * @param semestre semestre do ano letivo
     */
    private Semestre semestre;

    public UnidadeCurricular(String name, String sigla, String courseName, Ano year, Semestre semestre) {
        this.name = name;
        this.sigla = sigla;
        this.courseName = courseName;
        this.year = year;
        this.semestre = semestre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Ano getYear() {
        return year;
    }

    public void setYear(Ano year) {
        this.year = year;
    }

    public Semestre getSemestre() {
        return semestre;
    }

    public void setSemestre(Semestre semestre) {
        this.semestre = semestre;
    }

    /**
     * Método toString da classe UnidadeCurricular
     * Imprime os valores atribuídos nas variáveis de instâncias
     * @return String que contém os valores atribuídos nas variáveis de 
     * instâncias e as suas referências
     */
    @Override
    public String toString() {
        return "{" + "name: " + name + ", sigla: " + sigla + ", nome do curso: " + courseName + ", year: " + year + ", semestre: " + semestre + '}';
    }
}