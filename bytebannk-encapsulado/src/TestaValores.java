
public class TestaValores {
	
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		

		System.out.println(conta.getAgencia());
		
		conta.setAgencia(123213);
		
		Conta conta2 = new Conta(1337, 13728);
		Conta conta3 = new Conta(1337, 23456);
		
		System.out.println(Conta.getTotal());
		
		
		
		
	}
}
