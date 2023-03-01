package variaveis;

public class TestaSomatoria {
	public static void main(String[] args) {

//		declaração de variáveis
		int contador = 0;
		int total = 0;

//		início do laço
		while (contador <= 10) {

			total += contador;

			contador++;
		}
		System.out.println(total);
	}

}
