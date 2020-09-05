
public class AutenticacaoUtil {

	private int senha;
	
	
	public 	Cliente() {
		AutenticacaoUtil util = new AutenticacaoUtil();
	}
	
	public void setSenha(int senha) {
		this.senha = senha;

	}

	
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}

	}
}
