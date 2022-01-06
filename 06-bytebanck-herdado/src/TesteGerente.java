
public class TesteGerente {

	public static void main(String[] args) {
		
		Autenticavel referencia = new Cliente();
		
		Gerente g1 = new Gerente();
		g1.setNome("wyslan");
		g1.setCpf("115.198.484-12");
		g1.setSalario(5000);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		
		
		g1.setSenha(123);
		boolean autenticou = g1.autentica(123);
		
		System.out.println(autenticou);
		System.out.println(g1.getBonificacao());
		
	}

}
