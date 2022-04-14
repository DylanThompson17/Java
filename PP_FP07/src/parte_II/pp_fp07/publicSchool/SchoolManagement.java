package parte_II.pp_fp07.publicSchool;

/**
 * Classe que permite a gestão da instituição
 * Ex 2
 */
public class SchoolManagement {
    
    /**
     * @param MAX_TEACHER máximo de professores da instituição
     * @param MAX_STUDENTS máximo de estudantes da instituição
     * @param MAX_FUNCIONARIOS máximo de funcionários da instituição
     */
    private final int MAX_TEACHER = 6, MAX_STUDENTS = 5, MAX_FUNCIONARIOS = 13;
    
    /**
     * @param countTeachers número atual de professores na instituição
     * @param countStudents número atual de estudantes na instituição
     * @param countFuncionarios número atual de funcionários na instituição
     */
    private int countTeachers = 0, countStudents = 0, countFuncionarios = 0;
    
    /**
     * @param alunos array dos alunos da instituição
     */
    private Aluno[] alunos = new Aluno[MAX_STUDENTS];
    
    /**
     * @param professores array dos professores da instituição
     */
    private Professor[] teachers = new Professor[MAX_TEACHER];
    
    /**
     * @param funcionarios array dos funcionários da instituição
     */
    private Funcionario[] funcionarios = new Funcionario[MAX_FUNCIONARIOS];
    
    /**
     * Método que verifica se pode ou não adicionar um aluno
     * @param aluno aluno a ser verificado
     * @return true se possível, false caso contrário
     */
    private boolean verifyAddStudent(Aluno aluno) {
        
        // verifica se o aluno é nulo
        if (aluno == null) {
            System.out.println("Aluno nulo «Aluno não adicionado!»");
            return false;
        }
        
        // verifica se há espaço no array
        if (countStudents == MAX_STUDENTS) {
            System.out.println("Não há espaço para mais alunos «Aluno não adicionado!»");
            return false;
        }
        
        // verifica se não existe
        for (int i = 0; i < countStudents; i++) {
            
            if (this.alunos[i] == aluno) {
                System.out.printf("Aluno código: %d existente «Aluno não adicionado!»\n", aluno.getCodigo());
                return false;
            }
        }
        
        System.out.printf("Aluno código: %d adicionado com sucesso\n", aluno.getCodigo());
        // return true se possível
        return true;
    }
    
    /**
     * Método que adiciona um aluno à instituição
     * @param aluno aluno a ser adicionado
     */
    public void addStudent(Aluno aluno) {
        
        if (verifyAddStudent(aluno) == true) {
            alunos[countStudents] = aluno;
            countStudents++;
        }
    }
    
    /**
     * Método que encontra um aluno no array dos alunos
     * @param aluno aluno a ser procurado
     * @return posição do aluno no array se encontrado ou -1 caso não encontrado
     */
    private int findAluno(Aluno aluno) {
        
        for (int i = 0; i < countStudents; i++) {
            
            if (alunos[i] == aluno) {
                return i;
            }
        }
        
        return -1;
    }
    
    /**
     * Método que remove um aluno da instituição
     * @param aluno aluno a ser removido
     */
    public void removeAluno(Aluno aluno) {
        
        if (findAluno(aluno) != -1) {
            
            System.out.printf("Aluno código: %d removido com sucesso", aluno.getCodigo());
            for (int i = findAluno(aluno); i < countStudents-1; i++) {
                alunos[i] = alunos[i+1];
            }
            
            alunos[countStudents-1] = null;
            countStudents--;
        
        } else {
            System.out.printf("Aluno código: %d não encontrado «Aluno não removido!»\n", aluno.getCodigo());
        }
    }
    
    /**
     * Método que permite lista todos os alunos da instituição
     */
    public void listAllStudents() {
        
        if (countStudents > 0) {
            
            for (int i = 0; i < countStudents; i++) {
                
                if (i == 0) {
                    System.out.println("\n\tAll students");
                }
                
                System.out.println("Aluno " + (i+1));
                System.out.println("Código: "+ alunos[i].getCodigo());
                System.out.println("Nome: " + alunos[i].getName());
                System.out.println("Morada: " + alunos[i].getAddress());
                System.out.println("Dada de nascimento: " + alunos[i].getBirthday());
                System.out.println("Cartão de cidadão: " + alunos[i].getCartaoCidadao());
                System.out.println("Nif: " + alunos[i].getNif());
                alunos[i].listAllUc();
                System.out.println();
            }
        
        } else {
            System.out.println("Não existem alunos na instituiçao");
        }
    }

    /**
     * Método que verifica se pode ou não adicionar um professor
     * @param teacher professor a ser verificado
     * @return true se possível, false caso contrário
     */
    private boolean verifyAddTeacher(Professor teacher) {
        
        // verifica se o professor é nulo
        if (teacher == null) {
            System.out.println("Professor nulo «professor não adicionado!»");
            return false;
        }
        
        // verifica se há espaço no array
        if (countTeachers == MAX_TEACHER) {
            System.out.println("Não há espaço para mais professores «Professor não adicionado!»");
            return false;
        }
        
        // verifica se não existe
        for (int i = 0; i < countTeachers; i++) {
            
            if (this.teachers[i] == teacher) {
                System.out.printf("Professor sigla: %s existente «Professor não adicionado!»\n", teacher.getSigla());
                return false;
            }
        }
        
        // return true se possível
        System.out.printf("Professor sigla: %s adicionado com sucesso\n", teacher.getSigla());
        return true;
    }
    
    /**
     * Método que adiciona um professor à instituição
     * @param teacher professor a ser adicionado
     */
    public void addTeacher(Professor teacher) {
        
        if (verifyAddTeacher(teacher) == true) {
            teachers[countTeachers] = teacher;
            countTeachers++;
        }
    }
    
    /**
     * Método que encontra um professor no array dos professores
     * @param teacher professor a ser procurado
     * @return posição do professor no array se encontrado ou -1 caso não encontrado
     */
    private int findTeacher(Professor teacher) {
        
        for (int i = 0; i < countTeachers; i++) {
            
            if (teachers[i] == teacher) {
                return i;
            }
        }
        
        return -1;
    }
    
    /**
     * Método que remove um professor da instituição
     * @param teacher professor a ser removido
     */
    public void removeTeacher(Professor teacher) {
        
        if (findTeacher(teacher) != -1) {
            
            System.out.printf("Professor sigla: %s removido com sucesso\n", teacher.getSigla());
            for (int i = findTeacher(teacher); i < countTeachers-1; i++) {
                teachers[i] = teachers[i+1];
            }
            
            teachers[countTeachers-1] = null;
            countTeachers--;
        
        } else {
            System.out.println("Professor não encontrado «Professor não removido!»");
        }
    }
    
    /**
     * Método que lista todos os professores da instituição
     */
    public void listAllTeachers() {
        
        if (countTeachers > 0) {
            
            for (int i = 0; i < countTeachers; i++) {
                
                if (i == 0) {
                    System.out.println("\n\tAll teachers");
                }
                
                System.out.println("Teacher " + (i+1));
                System.out.println("Sigla: "+ teachers[i].getSigla());
                System.out.println("Nome: " + teachers[i].getName());
                System.out.println("Morada: " + teachers[i].getAddress());
                System.out.println("Dada de nascimento: " + teachers[i].getBirthday());
                System.out.println("Cartão de cidadão: " + teachers[i].getCartaoCidadao());
                System.out.println("Contrato: " + teachers[i].getContrato());
                System.out.println("Nif: " + teachers[i].getNif());
                teachers[i].listAllUc();
                System.out.println();
            }
        
        } else {
            System.out.println("Não existem professores na instituiçao");
        }
    }
    
    /**
     * Método que verifica se pode ou não adicionar um funcionario
     * @param funcionario funcionario a ser verificado
     * @return true se possível, false caso contrário
     */
    private boolean verifyAddFuncionario(Funcionario funcionario) {
        
        // verifica se o funcionario é nulo
        if (funcionario == null) {
            System.out.println("Funcionario nulo «Funcionario não adicionado!»");
            return false;
        }
        
        // verifica se há espaço no array
        if (countFuncionarios == MAX_FUNCIONARIOS) {
            System.out.println("Não há espaço para mais funcionarios «Funcionario não adicionado!»");
            return false;
        }
        
        // verifica se não existe
        for (int i = 0; i < countFuncionarios; i++) {
            
            if (this.funcionarios[i] == funcionario) {
                System.out.printf("Funcionario código: %d existente «Funcionario não adicionado!»\n", funcionario.getCodigo());
                return false;
            }
        }
        
        // return true se possível
        System.out.printf("Funcionario codigo: %d adicionado com sucesso\n", funcionario.getCodigo());
        return true;
    }
    
    /**
     * Método que adiciona um funcionario à instituição
     * @param funcionario funcionario a ser adicionado
     */
    public void addFuncionario(Funcionario funcionario) {
        
        if (verifyAddFuncionario(funcionario) == true) {
            funcionarios[countFuncionarios] = funcionario;
            countFuncionarios++;
        }
    }
    
    /**
     * Método que encontra um funcionario no array dos funcionarios
     * @param funcionario funcionario a ser procurado
     * @return posição do funcionario no array se encontrado ou -1 caso não encontrado
     */
    private int findFuncionario(Funcionario funcionario) {
        
        for (int i = 0; i < countFuncionarios; i++) {
            
            if (funcionarios[i] == funcionario) {
                return i;
            }
        }
        
        return -1;
    }
    
    /**
     * Método que remove um funcionario da instituição
     * @param funcionario funcionario a ser removido
     */
    public void removeFuncionario(Funcionario funcionario) {
        
        if (findFuncionario(funcionario) != -1) {
            
            System.out.printf("Funcionario código: %d removido com sucesso\n", funcionario.getCodigo());
            for (int i = findFuncionario(funcionario); i < countFuncionarios-1; i++) {
                funcionarios[i] = funcionarios[i+1];
            }
            
            funcionarios[countFuncionarios-1] = null;
            countFuncionarios--;
        
        } else {
            System.out.println("Funcionario não encontrado «Funcionario não removido!»");
        }
    }
    
    /**
     * Método que lista todos os funcionarios da instituição
     */
    public void listAllFuncionario() {
        
        if (countFuncionarios > 0) {
            
            for (int i = 0; i < countFuncionarios; i++) {
                
                if (i == 0) {
                    System.out.println("\n\tAll funcionarios");
                }
                
                System.out.println("Funcionario " + (i+1));
                System.out.println("Código: "+ funcionarios[i].getCodigo());
                System.out.println("Nome: " + funcionarios[i].getName());
                System.out.println("Morada: " + funcionarios[i].getAddress());
                System.out.println("Dada de nascimento: " + funcionarios[i].getBirthday());
                System.out.println("Cartão de cidadão: " + funcionarios[i].getCartaoCidadao());
                System.out.println("Contrato: " + funcionarios[i].getContrato());
                System.out.println("Nif: " + funcionarios[i].getNif());
                System.out.println();
            }
        
        } else {
            System.out.println("Não existem funcionarios na instituiçao");
        }
    }
    
    /**
     * Método que lista todos os alunos e funcionários
     * Exercício 2.2
     * OBS: os métodos de listar todos os professores, estudantes e funcionários
     * já foram feitas, é só chamar os métdos listAllStudents e 
     * listAllFuncionarios dentro desse método
     */
    public void listAllStudentsAndFunfionarios() {
        
        listAllFuncionario();
        listAllStudents();
    }
}