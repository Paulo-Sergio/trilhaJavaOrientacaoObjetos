package aula05.pt1;

public class Retangulo implements AreaCalculavel{

	private int largura;
    private int altura;
    
    public Retangulo(int largura, int altura) {
    	this.altura = altura;
    	this.largura = largura;
	}
	
	@Override
	public double calculaArea() {
		return this.largura * this.altura;
	}
}
