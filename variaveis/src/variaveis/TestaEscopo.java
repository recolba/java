package variaveis;

public class TestaEscopo {

	public static void main(String[] args) {
		System.out.println("Testando condicionais");

		int quantidadePessoas = 3;
		int idade = 20;
//		boolean acompanhado = quantidadePessoas >= 2;
		boolean acompanhado;

		if (quantidadePessoas >= 2) {
			acompanhado = true;

		} else {
			acompanhado = false;
		}

		System.out.println("Valor de acompanhado = " + acompanhado);

		if (idade >= 18 && acompanhado) {
			System.out.println("Seja bem vindo");
		} else {
			System.out.println("Infelizmente você " + "não pode entrar");
		}

	}
}
