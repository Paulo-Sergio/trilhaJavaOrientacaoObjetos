package aula04;

public class ContaPoupanca extends Conta{

	@Override
	public void atualiza(double taxa) {
        double valor = this.saldo * taxa * 3;
		this.saldo = this.saldo + valor;
    }
	
	@Override
	public void deposita(double valor) {
		this.saldo = this.saldo + valor - 0.10;
	}
}
