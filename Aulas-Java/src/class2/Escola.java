package class2;

public class Escola {

	public static void main(String[] args) {
		/*
		 Avaliacao mario = new Avaliacao(7,4,10);
		 
		 System.out.println("Média Aritmética do Mário: " + mario.mediaAritmetica());
		 System.out.println("Média Ponderada do Mário: " + mario.mediaPonderada());
		 */
		
		Aluno a1 = new Aluno("Mario", "Encanador", new Avaliacao(9,10,3));
		Aluno a2 = new Aluno("Luigi", "Encanador", new Avaliacao(2,5,10));
		
		a1.info();
		a2.info();
		
	}

}
