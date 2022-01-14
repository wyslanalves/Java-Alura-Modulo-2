package br.com.bytebank.banco.modelo;
/**
 * 
 * 
 * 
 * @author wyslan alves
 *
 */
public abstract class Conta {

	// atributos
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;

	private static int total;
	
	/**
	 * Construtor para inicializar o objeto Conta a partir da agencia e n�mero
	 * @param agencia
	 * @param numero
	 */
	
	//construtor pad�o
	public Conta(int agencia, int numero) {
		Conta.total++;
		//System.out.println("0 total de conta � " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		//System.out.println("estou criando uma conta " + this.numero);
		
	}
	
	
	public abstract void deposita(double valor);
	
/**
 * Valor precisa ser maior que o saldo.
 * 
 * @param valor
 * @throws SaldoinsuficienteException
 */
	public void saca(double valor)  throws SaldoinsuficienteException {
		if (this.saldo < valor) {
			//problema
			throw new SaldoinsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
		}
		this.saldo -= valor;
	}

	public void transfere(double valor, Conta destino) throws SaldoinsuficienteException{
		this.saca(valor);
		destino.deposita(valor);
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {

		if (numero <= 0) {
			System.out.println("n�o pode valor menor iqual a 0");
			return;
		}

		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {

		if (agencia <= 0) {
			System.out.println("n�o pode valor menor iqual a 0");
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
	@Override
	public String toString() {
		return "Numero" + this.numero + ", Agencia: " + this.agencia;
	}
}
