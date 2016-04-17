package aula04;

public class ContaCorrente extends Conta{

	@Override
	public void atualiza(double taxa) {
        double valor = this.saldo * taxa * 2;
		this.saldo = this.saldo + valor;
    }
}
