package parte_II.pp_fp07.publicSchool;

import static parte_II.pp_fp07.enums.Ano.*;
import static parte_II.pp_fp07.enums.Contrato.*;
import static parte_II.pp_fp07.enums.Semestre.*;

/**
 * Classe main de exercício 1.4
 */
public class SchoolDemo {

    public static void main(String[] args) {
        
        // instanceando duas pessoas
        Pessoa pessoa1, pessoa2;
        
        // inicializando as duas pessoas
        pessoa1 = new Pessoa("António", "19-04-1978", "Rua XXX-XXX-XXX nº6", "19780419M3N", 234653298);
        pessoa2 = new Pessoa("Ana", "07-10-1970", "Rua YYY-YYY-YYY nº3", "19701007F9C", 653297854);
        
        // chamando o método toString
        System.out.println(pessoa1.toString());
        System.out.println(pessoa2.toString());
        
        // instanceando quatro unidades curriculares
        UnidadeCurricular uc1, uc2, uc3, uc4;
        
        // inicializando as quatro unidades curriculares
        uc1 = new UnidadeCurricular("Paradigmas de Programação", "P.P", "LSIRC", ANO_1, SEMESTRE_2);
        uc2 = new UnidadeCurricular("Laboratório de Programação", "L.P", "LSIRC", ANO_1, SEMESTRE_1);
        uc3 = new UnidadeCurricular("Fundamentos de Programação", "F.P", "LSIRC", ANO_1, SEMESTRE_1);
        uc4 = new UnidadeCurricular("Estrutura de Dados", "E.D", "LSIRC", ANO_2, SEMESTRE_1);
        
        // instanceando dois alunos
        Aluno aluno1, aluno2;
        
        // inicializando os dois alunos
        aluno1 = new Aluno(1, "João", "31-10-2000", "Rua tal-tal-tal nº8", "20001031M5R", 426598328);
        aluno2 = new Aluno(2, "Joana", "01-01-2001", "Rua tal-tal-tal nº15", "20010101F8Z", 764927623);
        
        // adicioanr três unidades curriculares ao aluno 1
        aluno1.addUC(uc1);
        aluno1.addUC(uc2);
        aluno1.addUC(uc3);
        
        // adicionar uma unidade curricular ao aluno 2
        aluno2.addUC(uc3);
        
        System.out.println(aluno1.toString()); // chamando o método toString
        aluno1.listAllUc(); // listar todas as uc's do aluno 1
        
        System.out.println(aluno2.toString()); // chamando o método toString
        aluno2.listAllUc(); // listar todas as uc's do aluno 2
        
        aluno2.removeUc(uc2); // remover a uc2 do aluno 2
        aluno2.removeUc(uc3); // remover a uc3 do aluno 3
        aluno2.listAllUc(); // listar todas as uc's do aluno 2
        
        // instanceando dois professores
        Professor teacher1, teacher2;
        
        // inicializando os dois professores
        teacher1 = new Professor("BMO", INTEGRAL, "Bruno", "12-05-1980", "Rua AAA-FFF-DDD nº10", "19800512M6T", 154763298);
        teacher2 = new Professor("MRC", PARCIAL, "Mariana", "20-10-1982", "Rua BBB-FFF-DDD nº14", "19821020F8H", 863054953);
        
        // adicionado quatro uc's ao professor 1, apenas 3 serão adicionados
        teacher1.addUC(uc1);
        teacher1.addUC(uc2);
        teacher1.addUC(uc3);
        teacher1.addUC(uc4);
        
        // adicionado dois uc's ao professor 2
        teacher2.addUC(uc1);
        teacher2.addUC(uc2);
        
        System.out.println(teacher1.toString()); // chamando o método to string
        teacher1.listAllUc(); // listar todas as uc's que o professor 1 leciona
        
        System.out.println(teacher2.toString()); // chamando o método to string
        teacher2.listAllUc(); // listar todas as uc's que o professor 2 leciona
        
        teacher2.removeUc(uc1);
        teacher2.listAllUc(); // listar todas as uc's que o professor 2 leciona
        
        // instanceando e inicializando um funcionário
        Funcionario funcionario = new Funcionario(3, INTEGRAL, "Dorabela", "04-11-1972", "Rua MMM-DDD-RRR", "19721104F4W", 359483217);
        
        System.out.println(funcionario.toString()); // chamando o método to string
    }
}