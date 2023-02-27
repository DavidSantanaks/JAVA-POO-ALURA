package bytebank;

public class TestaMetodo {
	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.depositar(50);
		
		
		
		conta.sacar(151);
		
		Conta conta2 = new Conta();
		
		conta2.depositar(1000);
		
		conta2.transfere(300, conta);
		
		
	}
}
