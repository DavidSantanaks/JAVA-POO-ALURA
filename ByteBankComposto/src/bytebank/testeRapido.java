package bytebank;

public class testeRapido {
	public static void main(String[] args) {
		Conta conta1 = new Conta();
		Conta conta2 = new Conta();
		
		conta1.depositar(100);
		conta2.depositar(300);
		
		conta1.transfere(50, conta2);
		
		
		
		
	}
}
