package biblioteca;

public class Livro {
	private int id;
	private String nome;
	private String autor;
	private int ano;
	private boolean disponivel;
	
	public Livro () {
	}
	
	public Livro(int id, String nome, String autor, int ano, boolean disponivel) {
		this.id = id;
		this.nome = nome;
		this.autor = autor;
		this.ano = ano;
		this.disponivel = true;
	}

	public int getId () {
		return id;
	}
	
	public void setId (int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public boolean isDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}

	@Override
	public String toString() {
		return "Livro [id=" + id + 
				", nome=" + nome + 
				", autor=" + autor + 
				", ano=" + ano + 
				", disponivel=" + disponivel
				+ "]";
	}
	
}
