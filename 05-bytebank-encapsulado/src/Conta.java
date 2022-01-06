
public class Conta {

	// atributos
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;

	private static int total;
	
	
	//construtor padão
	public Conta(int agencia, int numero) {
		Conta.total++;
		//System.out.println("0 total de conta é " + Conta.total);
		
		this.agencia = agencia;
		this.numero = numero;
		
		//System.out.println("estou criando uma conta " + this.numero);
		
	}
	
	
	public void deposita(double valor) {
		this.saldo += valor;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}

	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}
		return false;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {

		if (numero <= 0) {
			System.out.println("não pode valor menor iqual a 0");
			return;
		}

		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {

		if (agencia <= 0) {
			System.out.println("não pode valor menor iqual a 0");
			return;
		}

		this.agencia = agencia;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return titular;
	}
	public static int getTotal() {
		
		//System.out.println(this.saldo); erro
		
		return Conta.total;
	}
}
