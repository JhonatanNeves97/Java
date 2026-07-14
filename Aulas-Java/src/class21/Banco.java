package class21;

public class Banco {

	public static void main(String[] args) {
		Conta c1 = new Conta(111,"mario", 2000, 500);
		Conta c2 = new Conta(222,"luigi", 3000, 500);
		
		c1.info();
		c2.info();
		
		/*if(!c1.sacar(2000)) {
			System.out.println("Problema ao Sacar!");
		};
		if(!c1.depositar(-500)) {
			System.out.println("Problema ao Depositar!");
		};*/
		if(!c1.transferir(c2,300)) {
			System.out.println("Problema ao Transferir!");
		}
		System.out.println();
		c1.info();
		c2.info();

	}

}
