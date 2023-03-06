
public class TestaBanco {

	public static void main(String[] args) {
		Cliente renato = new Cliente();
		renato.nome = "Renato Barbosa";
		renato.cpf = "222.222.222-22";
		renato.profissao = "programador";
		
		Conta contaDoRenato = new Conta();
		contaDoRenato.deposita(400);
		
		System.out.println(contaDoRenato.getSaldo());
	
		contaDoRenato.titular = renato;
		System.out.println(contaDoRenato.titular.nome);
						
	}
	

}
