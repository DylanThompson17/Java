package pp_fp04.book;

/**
 * Classe para testes do exercício 4
 */
public class BookDemo {

    //static Book livro;
    
    public static void main(String[] args) {
    
        Book livro = null;
        
        livro.titulo = new char[]{'P','a','r','a','d','i','g','m','a','s',' ',
            'd','e',' ','P','r','o','g','r','a','m','a','ç','ã','o'};
        livro.editor = new char[]{'l','s','i','r','c'};
        livro.autor1.acronimo = new char[]{'t','e','a','c','h','e','r'};
        livro.autor1.nomeAutor = new char[]{'P','r','o','f','e','s','s','o','r'};
        livro.autor1.nacionalidade = new char[]{'P','o','r','t','u','g','a','l'};
        livro.autor2.acronimo = new char[]{'s','t','u','d','e','n','t'};
        livro.autor2.nomeAutor = new char[]{'A','l','u','n','o'};
        livro.autor2.nacionalidade = new char[]{'P','o','r','t','u','g','a','l'};
        livro.ano = new char[]{'2','0','2','2','-','0','3','-','1','6'};
        livro.paginas = 320;
        livro.critico1.nome = new char[]{'P','r','e','s','i','d','e','n','t','e'};
        livro.critico1.pontos = 7;
        livro.critico2.nome = new char[]{'D','i','r','e','t','o','r'};
        livro.critico2.pontos = 8;
        livro.critico3.nome = new char[]{'C','o','o','r','d','e','n','a','d','o','r'};
        livro.critico3.pontos = 9;
        
        System.out.println("\tBook");
        System.out.print("Título do livro: ");
        System.out.println(livro.titulo);
        System.out.print("Editor do livro: ");
        System.out.println(livro.editor);
        System.out.println("\n\tAutores: ");
        System.out.print("Acrónimo do autor: ");
        System.out.println(livro.autor1.acronimo);
        System.out.print("Nome do autor: ");
        System.out.println(livro.autor1.nomeAutor);
        System.out.print("Nacionalidade: ");
        System.out.println(livro.autor1.nacionalidade);
        System.out.print("\nAcrónimo do autor: ");
        System.out.println(livro.autor2.acronimo);
        System.out.print("Nome do autor: ");
        System.out.println(livro.autor2.nomeAutor);
        System.out.print("Nacionalidade: ");
        System.out.println(livro.autor2.nacionalidade);
        System.out.print("\nAno: ");
        System.out.println(livro.ano);
        System.out.println("Páginas: " + livro.paginas);
        System.out.println("\n\tCotação dos críticos");
        System.out.print("Crítico: ");
        System.out.println(livro.critico1.nome);
        System.out.print("Cotação: ");
        System.out.println(livro.critico1.pontos);
        System.out.print("Crítico: ");
        System.out.println(livro.critico2.nome);
        System.out.print("Cotação: ");
        System.out.println(livro.critico2.pontos);
        System.out.print("Crítico: ");
        System.out.println(livro.critico3.nome);
        System.out.print("Cotação: ");
        System.out.println(livro.critico3.pontos);
    }   
}