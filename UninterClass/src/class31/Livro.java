package class31;

public class Livro {
	private String titulo;
	private int paginas;
	
	public Livro () {
		
	}
	
	public Livro(String titulo, int paginas) {
		setTitulo(titulo);
		setPaginas(paginas);
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		if (paginas<0) {
			return;
		}
		this.paginas = paginas;
	}
	
	
	

}
