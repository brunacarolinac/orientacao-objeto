
public class TestaMetodo {
	
	public static void main(String[] args) {
		Conta contaDaBruna = new Conta();
		contaDaBruna.saldo = 100;
		contaDaBruna.deposita(50);
		System.out.println(contaDaBruna.saldo);
		
		boolean conseguiuRetirar = contaDaBruna .saca(20);
		System.out.println(contaDaBruna.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaDoLucas = new Conta();
		contaDoLucas.deposita(1000);
		
		if(contaDoLucas.transfere(3000, contaDaBruna)) {
			System.out.println("transferencia com sucesso");
		} else {
			System.out.println("faltou dinheiro");
		}
		System.out.println(contaDoLucas.saldo);
		System.out.println(contaDaBruna.saldo);
		
		contaDaBruna.titular = "bruna camargo";
		System.out.println(contaDaBruna.titular);
	}

}
