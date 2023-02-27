package bytebank;

public class TestaValores {
	public static void main(String[] args) {
		Conta conta = new Conta();
		Conta conta2 = new Conta(1337, 2);
		
		System.out.println(conta2.getAgencia()); 
		System.out.println(conta2.getNumero());
		
		
		Conta conta3 = new Conta();
		System.out.println(Conta.getTotal());
	}
}
