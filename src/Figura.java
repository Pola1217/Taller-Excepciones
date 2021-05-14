import processing.core.PApplet;
import processing.core.PConstants;

public class Figura {

	public int posX, posY, tam, r, g, b;

	private PApplet app;

	public Figura(int posX, int posY, int tam, PApplet app) {
		this.posX = posX;
		this.posY = posY;
		this.tam = tam;
		this.r = 255;
		this.g = 255;
		this.b = 255;

		this.app = app;
	}

	public void pintar() {
		app.rectMode(PConstants.CENTER);
		app.fill(r, g, b);
		app.noStroke();

	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public int getG() {
		return g;
	}

	public void setG(int g) {
		this.g = g;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getPosX() {
		return posX;
	}

	public int getPosY() {
		return posY;
	}

	public int getTam() {
		return tam;
	}

}
