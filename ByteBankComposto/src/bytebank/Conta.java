package bytebank;

public class Conta {
	
	private double saldo;
	int agencia;
	int numero;
	Cliente titular;
	
	
	//Metodos
	void depositar(double valor){
		this.saldo += valor;
	}
	////////////////////////////////////
	public boolean sacar(double valor) {
		
		if(this.saldo == valor || this.saldo > valor){
			this.saldo -= valor;
			System.out.println("Valor sacado:" + valor);
			System.out.println("Valor atualmente na conta:" + this.saldo);
			return true;
		}else {
			System.out.println("Não pode sacar o valor de R$" + valor);
			return false;
		}
	}
	
	//////////////////////////////////
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.sacar(valor);
			destino.depositar(valor);
			return true;
		}
		
		return false;
	}
	//////////////////////////////////
	
	//Metodo que devolve saldo
	
	public double getSaldo(){
		return this.saldo;
	}
	
	///////////////////////////////////
	
}


