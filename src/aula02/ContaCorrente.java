package aula02;

public class ContaCorrente extends Conta{

	public void atualiza(double taxa) {
        double valor = this.saldo * taxa * 2;
		this.saldo = this.saldo + valor;
    }
}
