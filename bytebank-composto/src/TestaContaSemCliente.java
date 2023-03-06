
public class TestaContaSemCliente {
	public static void main(String[] args) {
		Conta contaDoRenato = new Conta();
		
//		System.out.println(contaDoRenato);
		
		contaDoRenato.titular = new Cliente();
		
		System.out.println(contaDoRenato.titular);
		contaDoRenato.titular.nome = "Renato";
		System.out.println(contaDoRenato.titular.nome);
	}
	
}
