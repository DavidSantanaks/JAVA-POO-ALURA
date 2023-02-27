package bytebank;

public class Conta {
	
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	public static int total;
	
	//
	public Conta(int agencia, int numero){
		total++;
		this.agencia = agencia;
		this.numero = numero;
	}
	//
	//
	public Conta(){
		total++;
		//Construtor vazio ou construtor padrão
		
	}
	//
	
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
	public int getNumero(){
		return this.numero;
	}
	
	public void setNumero(int numero){
		if(numero <= 0) {
			System.out.println("Não pode valor 0 ou negativo");
		}
		this.numero = numero;
	}
	
	///////////////////////////////////
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("Não pode valor  0  ou negativo");
			return;
		}
		this.agencia = agencia;
	}
	///////////////////////////////////
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() {
		return total;
	}
}


