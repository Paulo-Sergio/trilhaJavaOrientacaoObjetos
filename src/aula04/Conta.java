package aula04;

abstract public class Conta {
	protected double saldo;
	
	public void deposita(double valor){
		this.saldo = this.saldo + valor;
	}
	
	public void saca(double valor){
		this.saldo = this.saldo - valor;
	}
	
	abstract public void atualiza(double taxa);
	
	public double getSaldo(){
		return this.saldo;
	}
}
