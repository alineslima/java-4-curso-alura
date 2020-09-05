//a classe gerente é um funcionario e assina o autenticavel/ ou é o autenticavel
public class Gerente extends Funcionario implements Autenticavel{

	private AutenticacaoUtil autenticador;

	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
		
	}
	
	 public double getBonificacao() {
		 System.out.println("chamando o método de bonificacao do gerente");
		 return super.getSalario();
	}
	 
	 @Override
		public void setSenha(int senha) {
			this.autenticador.setSenha(senha);
			
		}

		@Override
		public boolean autentica(int senha) {
			return this.autenticador.autentica(senha);
		}
	
	
}
