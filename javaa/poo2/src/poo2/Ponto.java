package poo;

public class Ponto {
	
	private float x;
	private float x1;
	private float y;
	private float y1;
	
	
	
	public float getX() {
		return x;
	}



	public void setX(float x) {
		this.x = x;
	}



	public float getX1() {
		return x1;
	}



	public void setX1(float x1) {
		this.x1 = x1;
	}



	public float getY() {
		return y;
	}



	public void setY(float y) {
		this.y = y;
	}



	public float getY1() {
		return y1;
	}



	public void setY1(float y1) {
		this.y1 = y1;
	}



	public float dist() {
		return (float) Math.sqrt(Math.pow(x1 - x, 2) + Math.pow(y1 - y, 2));
	}
}
