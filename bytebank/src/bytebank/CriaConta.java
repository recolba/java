package bytebank;

public class CriaConta {

	public static void main(String[] args) {
//		Declaração da primeira conta
		Conta primeiraConta = new Conta();
		
		primeiraConta.saldo = 200;
		primeiraConta.titular = "Renato";
		System.out.println("O saldo da conta do Titular "  
				+ primeiraConta.titular + " é " 
				+ primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);
		
//		declaração da segunda conta
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		
		System.out.println("Segunda conta possui " + segundaConta.saldo);
		
		System.out.println(primeiraConta.numero);
	}
}
