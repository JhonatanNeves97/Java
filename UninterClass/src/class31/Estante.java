package class31;

import java.util.ArrayList;

public class Estante {
	ArrayList<Livro> estante1 = new ArrayList<>();
	
	
	public void adicionar (Livro livro) {
		estante1.add(livro);
	}
	
	public void listar() {
		for(Livro livro : estante1) {
			System.out.println(livro.getTitulo());
		}
	}
	
	public int totalPaginas() {
		int totalPaginas = 0;
		for(int i = 0; i < estante1.size(); i++) {
			totalPaginas += estante1.get(i).getPaginas();
		}
	return totalPaginas;
		
	}
	
	public Livro livroMaior () {
		if (estante1.isEmpty()) {
			return null;
		}
		 Livro livroMaior = estante1.get(0);
		 for (Livro livro : estante1){
			 if (livro.getPaginas() > livroMaior.getPaginas()) {
				 livroMaior = livro;
			 }
		 }
		return livroMaior;
	}

}
