package poo;

public class Principal2 {

	public static void main(String[] args) {

		
		Ponto p = new Ponto();
		
		p.setX(3.2f);
		p.setX1(5.5f);
		p.setY(1.6f);
		p.setY1(2.56f);
		
		System.out.printf(" \nx: %.2f x1: %.2f\ny = %.2f y1 = %.2f \n", p.getX(),  p.getX1(), p.getY(),p.getY1());
		
		
		System.out.printf("Distância é: %.2f",p.dist());
		
	}

}
