package aula02;

public class Conta {
	protected double saldo;
	
	public void deposita(double valor){
		this.saldo = this.saldo + valor;
	}
	
	public void saca(double valor){
		this.saldo = this.saldo - valor;
	}
	
	public void atualiza(double taxa) {
        double valor = this.saldo * taxa;
		this.saldo = this.saldo + valor;
    }
	
	public double getSaldo(){
		return this.saldo;
	}
}
