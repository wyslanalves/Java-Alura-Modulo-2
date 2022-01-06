
public class TestaValores {

	public static void main(String[] args) {
		
		
		Conta conta = new Conta(4667,24226);
		
		
		System.out.println(conta.getAgencia());
		
		conta.setAgencia(1232123);
		
		Conta conta2 = new Conta(1337,16549);
		Conta conta3 = new Conta(3212,14660);
		
		System.out.println(Conta.getTotal());
		
	}

}
