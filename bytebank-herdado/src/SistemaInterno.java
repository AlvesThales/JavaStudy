
public class SistemaInterno {
	
	private int  senha = 2222;
	
	public void autentica(Autenticavel f) {
		
	boolean autenticou = f.autentica(this.senha);
	if (autenticou) {
		System.out.println("Autenticado com sucesso!");
	} else {
		System.out.println("Senha incorreta");
	}
		
		
		
	
		
	}

}
