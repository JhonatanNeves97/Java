package class21;

public class Conta {
	int numero;
	String titular;
	float saldo;
	float limite;
	
	
	
	
	public Conta(int numero, String titular, float saldo, float limite) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
		this.limite = limite;
	}

	boolean sacar(float valor) {
		if(valor>limite || valor>saldo || valor<=0) {
			return false;
		}
		else {
			saldo -= valor;
			return true;
		}
	}
	
	boolean depositar(double valor) {
		if (valor<=0) {
			return false;
		}
			saldo += valor;
			return true;
		
	}
	
	void info() {
		System.out.println("Nome: " + titular);
		System.out.println("Número: " + numero);
		System.out.println("Saldo: " + saldo);
		System.out.println("Limite: " + limite);
	}
	
	boolean transferir(Conta destino,float valor) {
		if(valor>limite || valor>saldo || valor<=0) {
			return false;
		}
		else {
			this.saldo -= valor;
			destino.saldo += valor;
			return true;
		}
	}
	
}
