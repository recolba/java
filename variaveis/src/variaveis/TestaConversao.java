package variaveis;

public class TestaConversao {
	
	public static void main(String[] args) {
		double salario = 1250.74;
		int valor = (int) salario;
		System.out.println(valor);
		
		float pontoFlutuante = 3.14f;
		System.out.println(pontoFlutuante);
	
		long numeroGrande = 6000045000l;
		System.out.println(numeroGrande);
		
		short valorPequeno = 3;
		System.out.println(valorPequeno);
		
		byte menorQueShort = 127;
		System.out.println(menorQueShort);
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2;
		
		System.out.println(total);
		
	}
}

