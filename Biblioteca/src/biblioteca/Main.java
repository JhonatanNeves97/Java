package biblioteca;

public class Main {

	public static void main(String[] args) {

		Estante estante = new Estante();

		// Cadastro dos livros
		Livro livro1 = new Livro(
				1,
				"Dom Casmurro",
				"Machado de Assis",
				1899,
				true
		);

		Livro livro2 = new Livro(
				2,
				"O Hobbit",
				"J.R.R. Tolkien",
				1937,
				true
		);

		Livro livro3 = new Livro(
				3,
				"Clean Code",
				"Robert C. Martin",
				2008,
				true
		);

		Livro livro4 = new Livro(
				4,
				"Java Como Programar",
				"Deitel",
				2017,
				true
		);

		Livro livro5 = new Livro(
				5,
				"Algoritmos",
				"Thomas Cormen",
				2009,
				true
		);


		// Adicionando livros na estante
		estante.cadastrarLivro(livro1);
		estante.cadastrarLivro(livro2);
		estante.cadastrarLivro(livro3);
		estante.cadastrarLivro(livro4);
		estante.cadastrarLivro(livro5);


		System.out.println("===== LISTA INICIAL =====");
		estante.listarLivros();


		System.out.println("\n===== BUSCAR LIVRO ID 3 =====");
		Livro encontrado = estante.buscarLivro(3);
		System.out.println(encontrado);


		System.out.println("\n===== EMPRESTANDO LIVRO ID 2 =====");
		estante.emprestarLivro(2);


		System.out.println("\n===== LISTA APÓS EMPRÉSTIMO =====");
		estante.listarLivros();


		System.out.println("\n===== DEVOLVENDO LIVRO ID 2 =====");
		estante.devolverLivro(2);


		System.out.println("\n===== LISTA APÓS DEVOLUÇÃO =====");
		estante.listarLivros();


		System.out.println("\n===== REMOVENDO LIVRO ID 4 =====");
		estante.removerLivro(4);


		System.out.println("\n===== LISTA FINAL APÓS REMOÇÃO =====");
		estante.listarLivros();

	}

}