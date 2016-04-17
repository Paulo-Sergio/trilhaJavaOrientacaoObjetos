package aula05.pt1;

public class Teste {

	public static void main(String[] args) {

		AreaCalculavel a = new Retangulo(3, 2);
		System.out.println(a.calculaArea());
		
		Circulo c = new Circulo(3.356);
		System.out.println(c.calculaArea());
	}

}
