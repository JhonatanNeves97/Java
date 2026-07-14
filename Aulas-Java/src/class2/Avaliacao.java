package class2;

public class Avaliacao {
	
	float nota1,nota2,nota3;
	
	Avaliacao(float nota1,float nota2,float nota3) {
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}
	
	public float mediaAritmetica() {
		float media = (nota1+nota2+nota3)/3;
		return media;
	}
	public float mediaPonderada() {
		float media = (nota1*2 + nota2*3 + nota3*4)/9;
		return media;
	}
	


}
