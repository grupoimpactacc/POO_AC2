package ac2;

public class ContaBancaria {
	private static int ultimoNumeroConta = 1000; // Último número de conta utilizado

	private String correntista;
	private int numeroConta; // número da conta
	private double saldo; // saldo da conta

	public ContaBancaria(String correntista, double saldo) {
		ultimoNumeroConta++;
		this.numeroConta = ultimoNumeroConta;
		this.saldo = saldo;
		this.correntista = correntista;
	}

	public void depositar(double valor) {
		this.saldo = this.saldo + valor;
	}

	public void sacar(double valor) {
		this.saldo = this.saldo - valor;
	}

	public void transferir(double valor, ContaBancaria contaDestino) {
		
		this.saldo = this.saldo - valor;
		contaDestino.saldo += valor;		
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumeroConta() {
		return this.numeroConta;
	}

	public String toString() {
		return "Conta de " + this.correntista + " - Saldo de R$ " + this.saldo;
	}
}