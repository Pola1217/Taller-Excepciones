package model;
import processing.core.PApplet;

public class cub extends Figura {

	private PApplet app;

	public cub(int posX, int posY, int tam, PApplet app) {
		super(posX, posY, tam, app);
		this.app = app;

		// TODO Auto-generated constructor stub
	}

	@Override
	public void pintar() {
		// TODO Auto-generated method stub
		super.pintar();
		app.rect(posX, posY, tam, tam);
	}

}
