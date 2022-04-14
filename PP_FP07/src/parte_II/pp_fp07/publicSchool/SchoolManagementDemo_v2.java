package parte_II.pp_fp07.publicSchool;

import java.util.Scanner;
import static parte_II.pp_fp07.enums.Ano.*;
import static parte_II.pp_fp07.enums.Contrato.*;
import static parte_II.pp_fp07.enums.Semestre.*;

/**
 * Classe main versão 2 do exercío 2
 */
public class SchoolManagementDemo_v2 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in); // para fazer leitura pelo teclado
        int opcao; // para guardar a opção
        
        // instanceando onze unidades curriculares
        UnidadeCurricular uc1, uc2, uc3, uc4, uc5, uc6, uc7, uc8, uc9, uc10, uc11;
        
        // inicializando as onze unidades curriculares
        uc1 = new UnidadeCurricular("Paradigmas de Programação", "P.P", "LSIRC", ANO_1, SEMESTRE_2);
        uc2 = new UnidadeCurricular("Laboratório de Programação", "L.P", "LSIRC", ANO_1, SEMESTRE_1);
        uc3 = new UnidadeCurricular("Fundamentos de Programação", "F.P", "LSIRC", ANO_1, SEMESTRE_1);
        uc4 = new UnidadeCurricular("Estrutura de Dados", "E.D", "LSIRC", ANO_2, SEMESTRE_1);
        uc5 = new UnidadeCurricular("Segurança Informática", "SI", "LSIRC", ANO_1, SEMESTRE_2);
        uc6 = new UnidadeCurricular("Base de Dados", "BD", "LSIRC", ANO_2, SEMESTRE_2);
        uc7 = new UnidadeCurricular("Sistemas Operativos", "SO", "LSIRC", ANO_2, SEMESTRE_1);
        uc8 = new UnidadeCurricular("Processamento Estruturado de Informação", "PEI", "LSIRC", ANO_2, SEMESTRE_1);
        uc9 = new UnidadeCurricular("Redes de Computadores II", "RC_II", "LSIRC", ANO_2, SEMESTRE_1);
        uc10 = new UnidadeCurricular("Redes de Computadores I", "RC_I", "LSIRC", ANO_1, SEMESTRE_2);
        uc11 = null;
        
        // instanceando oito alunos
        Aluno aluno1, aluno2, aluno3, aluno4, aluno5, aluno6, aluno7, aluno8, aluno9;
        
        // inicializando os oito alunos
        aluno1 = new Aluno(1, "João", "31-10-2000", "Rua tal-tal-tal nº8", "20001031M5R", 426598328);
        aluno2 = new Aluno(2, "Joana", "01-01-2001", "Rua tal-tal-tal nº15", "20010101F8Z", 764927523);
        aluno3 = new Aluno(3, "Rui", "02-09-2001", "Rua tal-tal-tal nº14", "20010902M6J", 734323633);
        aluno4 = new Aluno(4, "Ruiva", "13-04-2002", "Rua tal-tal-tal nº43", "20020413F5G", 724924633);
        aluno5 = new Aluno(5, "Bob", "24-02-2003", "Rua tal-tal-tal nº67", "20030224M4F", 764223623);
        aluno6 = new Aluno(6, "Alice", "01-05-2002", "Rua tal-tal-tal nº87", "20020501F2A", 744627433);
        aluno7 = new Aluno(7, "Marcia", "12-10-2001", "Rua tal-tal-tal nº3", "20011012F9X", 764825323);
        aluno8 = new Aluno(8, "Joice", "23-01-2001", "Rua tal-tal-tal nº201", "20010123F7B", 764927423);
        aluno9 = new Aluno(9, "Maria", "12-03-1999", "Rua tal-tal-tal nº10", "19990312F4L", 875937295);
        
        // adicioanr 10 unidades curriculares ao aluno 1
        aluno1.addUC(uc1);
        aluno1.addUC(uc2);
        aluno1.addUC(uc3);
        aluno1.addUC(uc4);
        aluno1.addUC(uc5);
        aluno1.addUC(uc6);
        aluno1.addUC(uc7);
        aluno1.addUC(uc8);
        aluno1.addUC(uc9);
        aluno1.addUC(uc10);
        
        // adicioanr 5 unidades curriculares ao aluno 2
        aluno7.addUC(uc1);
        aluno7.addUC(uc2);
        aluno7.addUC(uc3);
        aluno7.addUC(uc4);
        aluno7.addUC(uc5);
        
        // adicionar uma unidade curricular ao aluno 2
        aluno2.addUC(uc3);
        
        // Instanceando ShoolManagement
        SchoolManagement institution = new SchoolManagement();
        
        // adicionar os oito alunos na instituição
        institution.addStudent(aluno1);
        institution.addStudent(aluno2);
        institution.addStudent(aluno3);
        institution.addStudent(aluno3);
        institution.addStudent(aluno4);
        institution.addStudent(aluno5);
        institution.addStudent(aluno6);
        institution.addStudent(aluno7);
        institution.addStudent(aluno8);
        
        // instanceando seis professores
        Professor teacher1, teacher2, teacher3, teacher4, teacher5, teacher6;
        
        // inicializando os seis professores
        teacher1 = new Professor("BMO", INTEGRAL, "Bruno", "12-05-1980", "Rua AAA-FFF-DDD nº10", "19800512M6T", 154763298);
        teacher2 = new Professor("AMS", INTEGRAL, "Altino", "31-02-1973", "Rua CCC-DDD-EE nº6", "19730231M4F", 543987654);
        teacher3 = new Professor("APP", PARCIAL, "António", "23-06-1974", "Rua TTT-DDD-EE nº7", "19740623M7G", 324567875);
        teacher4 = new Professor("ANA", PARCIAL, "Ana", "31-02-1973", "Rua CCC-DDD-EE nº6", "19730231F5E", 90539583);
        teacher5 = null;
        //teacher5 = new Professor("AMS", INTEGRAL, "Altino", "31-02-1973", "Rua CCC-DDD-EE nº6", "19730231M4F", 543987654);
        teacher6 = new Professor("MRC", PARCIAL, "Mariana", "20-10-1982", "Rua BBB-FFF-DDD nº14", "19821020F8H", 863054953);
        
        // adicionado quatro uc's ao professor 1, apenas 3 serão adicionados
        teacher1.addUC(uc1);
        teacher1.addUC(uc2);
        teacher1.addUC(uc3);
        teacher1.addUC(uc4);
        
        // adicionado  três uc's ao professor 2
        teacher2.addUC(uc11);
        teacher2.addUC(uc1);
        teacher2.addUC(uc2);
        
        // adicionando 7 uc's ao professor 4
        teacher4.addUC(uc1);
        teacher4.addUC(uc3);
        teacher4.addUC(uc3);
        teacher4.addUC(uc4);
        teacher4.addUC(uc5);
        teacher4.addUC(uc6);
        teacher4.addUC(uc10);
        
        // adicionar os seis professores na instituição
        institution.addTeacher(teacher1);
        institution.addTeacher(teacher2);
        institution.addTeacher(teacher3);
        institution.addTeacher(teacher3);
        institution.addTeacher(teacher4);
        institution.addTeacher(teacher5);
        institution.addTeacher(teacher6);
        
        // instanceando 10 funcionarios
        Funcionario funcionario1, funcionario2, funcionario3, funcionario4, 
                funcionario5, funcionario6, funcionario7, funcionario8, 
                funcionario9, funcionario10;
        
        // inicializando os 10 funcionários
        funcionario1 = new Funcionario(1, INTEGRAL, "Dorabela", "04-11-1972", "Rua MMM-DDD-RRR", "19721104F4W", 359483217);
        funcionario2 = new Funcionario(2, PARCIAL, "Hugo", "23-12-1975", "Rua MMM-DDD-RRR", "19721104F4W", 359483217);
        funcionario3 = new Funcionario(3, INTEGRAL, "Kalifa", "21-06-1984", "Rua MMM-DDD-RRR", "19721104F4W", 359483217);
        funcionario4 = null;
        funcionario5 = new Funcionario(5, INTEGRAL, "Josefa", "20-03-1979", "Rua MMM-DDD-RRR", "19721104F4W", 359483217);
        funcionario6 = new Funcionario(6, PARCIAL, "Mónica", "14-07-1988", "Rua MMM-DDD-RRR", "19721104F4W", 359483217);
        funcionario7 = new Funcionario(7, INTEGRAL, "Litícia", "15-09-1992", "Rua MMM-DDD-RRR", "19721104F4W", 359483217);
        funcionario8 = new Funcionario(65, PARCIAL, "Edna", "29-12-1979", "Rua MMM-DDD-RRR", "19721104F4W", 359483217);
        funcionario9 = new Funcionario(9, INTEGRAL, "Catarina", "28-11-1977", "Rua MMM-DDD-RRR", "19721104F4W", 359483217);
        funcionario10 = new Funcionario(34, PARCIAL, "Rói", "20-05-1990", "Rua DDD-AAA-HHR", "19721104F4W", 359483217);
        
        // adicionando 12 funcionários à instituição
        institution.addFuncionario(funcionario1);
        institution.addFuncionario(funcionario2);
        institution.addFuncionario(funcionario2);
        institution.addFuncionario(funcionario3);
        institution.addFuncionario(funcionario4);
        institution.addFuncionario(funcionario5);
        institution.addFuncionario(funcionario6);
        institution.addFuncionario(funcionario7);
        institution.addFuncionario(funcionario7);
        institution.addFuncionario(funcionario8);
        institution.addFuncionario(funcionario9);
        institution.addFuncionario(funcionario10);
        
        try {
            do {
            
                System.out.println("\nOpções:");
                System.out.println("1 -> Listar todos os professores");
                System.out.println("2 -> Listar todos os alunos e funcionários");
                System.out.println("0 -> Sair");
                System.out.print("Opção: ");
                opcao = ler.nextInt();
        
                if (opcao == 1) {
                    institution.listAllTeachers();
                    
                } else if (opcao == 2) {
                    institution.listAllStudentsAndFunfionarios();
                }
                
                if (opcao < 0 || opcao > 2) {
                    System.out.println("Valor inválido");
                }
                
            } while (opcao < 0 || opcao > 2);

        } catch (Exception ex) {
            System.out.println("Valor inválido");
        }
    }
}