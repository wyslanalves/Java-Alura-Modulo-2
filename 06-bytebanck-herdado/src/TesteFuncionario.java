
public class TesteFuncionario {

	public static void main(String[] args) {

		Cliente cliente = new Cliente();
		
		
		
		Funcionario wyslan = new Gerente();
		
		wyslan.setNome("wysaln");
		wyslan.setCpf("115.198.484-12");
		wyslan.setSalario(1200);
		
		System.out.println(wyslan.getNome());
		System.out.println(wyslan.getCpf());
		System.out.println(wyslan.getBonificacao());
		
		
		
		
	}

}
