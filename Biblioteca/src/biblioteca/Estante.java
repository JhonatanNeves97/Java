package biblioteca;

import java.util.ArrayList;

public class Estante {
	private ArrayList<Livro>livros;
	
	public Estante () {
		this.livros = new ArrayList<Livro>();
	}

	public Estante(ArrayList<Livro> livros) {
		this.livros = livros;
	}
	
	public void cadastrarLivro (Livro livro) {
		livros.add(livro);
	}
	
	public void listarLivros () {
		for (Livro livro : livros) {
			System.out.println(livro);
		}
	}
	
	public Livro buscarLivro (int id) {
		for (int i = 0; i < livros.size(); i++) {
			Livro livro = livros.get(i);
			
			if (livro.getId() == id) {
				return livro;
			}
		}
		return null;
	}
	
	public void emprestarLivro (int Id) {
		for (Livro livro : livros) {
			
			if (livro.getId() == Id && livro.isDisponivel()) {
			livro.setDisponivel(false);
			System.out.println("Livro emprestado com Sucesso");
			break;
			}
			
		}
	}
	
	public void devolverLivro (int Id) {
		for (int i = 0; i < livros.size(); i ++) {
			Livro livro = livros.get(i);
			
			if (livro.getId() == Id && !livro.isDisponivel()) {
				livro.setDisponivel(true);
				System.out.println("Livro Devolvido com Sucesso");
				break;
			}
		}
	}
	
	public void removerLivro (int Id) {
		for (int i = 0; i < livros.size(); i++) {
			Livro livro = livros.get(i);
					
			if (livro.getId() == Id) {
				livros.remove(i);
				System.out.println("Livro Removido com Sucesso");
				break;
			}
		}
	}
}
