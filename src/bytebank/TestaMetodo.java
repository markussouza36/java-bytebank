package bytebank;

public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.saldo = 300;
		contaDoPaulo.deposita(50);
		System.out.println(contaDoPaulo.saldo);
		
		boolean conseguiuRetirar = contaDoPaulo.saca(80);
		System.out.println(contaDoPaulo.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaDoNico = new Conta ();
		contaDoNico.deposita(5000);
		boolean sucessoTransferencia = 
				contaDoNico.transfere(6000, contaDoPaulo);
		if(sucessoTransferencia) {
			System.out.println("transferencia com sucesso!!");
		} else {
			System.out.println("faltou dinheiro!!");
		}
		System.out.println(contaDoNico.saldo);
		System.out.println(contaDoPaulo.saldo);
		
		contaDoPaulo.titular = "Paulo Silveira";
		System.out.println(contaDoPaulo.titular);
	}
	
}
