package class31;

public class Biblioteca {

	public static void main(String[] args) {
		
	Estante estante = new Estante();
	
	estante.adicionar(new Livro("Java",250));
	estante.adicionar(new Livro("Python",300));
	estante.adicionar(new Livro("Banco de Dados",150));
	
	estante.listar();
	
	Livro maior = estante.livroMaior();
	
	System.out.println("Total de Paginas: " + estante.totalPaginas());
	
	System.out.println("LivroMaior: " + maior.getTitulo() + " com " + maior.getPaginas() + " paginas");
	}
}
