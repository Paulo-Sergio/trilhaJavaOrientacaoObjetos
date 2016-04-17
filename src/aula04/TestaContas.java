package aula04;

public class TestaContas {

	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();
		
		cc.deposita(1000);
		cp.deposita(1000);
				
		AtualizadorDeContas adc = new AtualizadorDeContas(0.01);
		adc.roda(cc);
		adc.roda(cp);
		
		System.out.println("========================");
		System.out.println("Saldo total de todas as contas: " + adc.getSaldoTotal());
	}
}
