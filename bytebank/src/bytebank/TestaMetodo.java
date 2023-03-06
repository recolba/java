package bytebank;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDoRenato = new Conta();
		contaDoRenato.saldo = 100;
		contaDoRenato.deposita(50);
		System.out.println(contaDoRenato.saldo);

		boolean conseguiuRetirar = contaDoRenato.saca(20);
		System.out.println(contaDoRenato.saldo);
		System.out.println(conseguiuRetirar);

		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		boolean sucessoTrasnferencia = 
				contaDaMarcela.transfere(300, contaDoRenato);

		if (sucessoTrasnferencia) {
			System.out.println("Transferencia realizada com sucesso!");
		} else {
			System.out.println("Dinheiro insuficiente!");
		}

		System.out.println(contaDaMarcela.saldo);
		
		contaDoRenato.titular = "Renato Colodro Barbosa";
		System.out.println(contaDoRenato.titular);
	}

}
