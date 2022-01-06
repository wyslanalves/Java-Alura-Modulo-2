
public class TesteSistema {

	public static void main(String[] args) {
		

		Gerente g = new Gerente();
		g.setSenha(222);
		
		Administrador adm = new Administrador();
		adm.setSenha(333);
		
		Cliente cliente = new Cliente();
		cliente.autentica(2222);
		
		SitemInterno si = new SitemInterno();
		si.autentica(g);
		si.autentica(adm);
		
	}

}
