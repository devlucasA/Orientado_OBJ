package poo;

public class Triangulo {
	
	private float lado1;
	private float lado2;
	private float lado3;
	
	
    public Triangulo(float lado1, float lado2, float lado3) {
        setLado1(lado1);
        setLado2(lado2);
        setLado3(lado3);
    }
	public float getLado1() {
		return lado1;
	}
	public void setLado1(float lado1) {
		if(lado1 < 0) {
			lado1= 1;
		}
		this.lado1 = lado1;
	}
	
	public void setLado2(float lado2) {
		if(lado2 < 0) {
			lado2= 1;
		}
		this.lado2 = lado2;
	}
	
	public void setLado3(float lado3) {
		if(lado3 < 0) {
			lado3= 1;
		}
		this.lado3 = lado3;
	}
	
	public float getLado2() {
		return lado2;
	}

	public float getLado3() {
		return lado3;
	}
	
	public float calculaP() {
		
		return lado1+lado2+lado3;
	}
	
    public String tipoTriangulo() {
        if (lado1 == lado2 && lado2 == lado3) {
            return "Equilátero";
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            return "Isósceles";
        } else {
            return "Escaleno";
        }
    }
	   public boolean verificaTriangulo() {
	        return (lado1 < lado2 + lado3) && (lado2 < lado1 + lado3) && (lado3 < lado1 + lado2);
	    }
	   
	   
	   public void exibirInformacoes() {
	        System.out.println("Lado 1: " + lado1);
	        System.out.println("Lado 2: " + lado2);
	        System.out.println("Lado 3: " + lado3);
	        System.out.println("Perímetro: " + calculaP());
	        System.out.println("Tipo: " + tipoTriangulo());
	    }
}
	

	
