
public class SitemInterno {
	
	private int senha = 222;
	
	public void autentica(Autenticavel fa) {
		boolean autenticou = fa.autentica(this.senha);
		if(autenticou) {
			System.out.println("Pode entra no sistema!");
		}else {
			System.out.println("N�o pode entrar no sistema!");
		}
	}

}
