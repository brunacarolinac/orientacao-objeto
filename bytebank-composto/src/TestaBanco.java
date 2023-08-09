
public class TestaBanco {
	public static void main(String[] args) {
		Cliente bruna = new Cliente();
		bruna.nome = "Bruna Camargo";
		bruna.cpf = "000.000.000-00";
		bruna.profissao = "programador";
		
		Conta contaDaBruna = new Conta();
		contaDaBruna.deposita(100);
		
		contaDaBruna.titular = bruna;
		System.out.println(contaDaBruna.titular.nome);
	}

}
