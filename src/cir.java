import processing.core.PApplet;

public class cir extends Figura {

	private PApplet app;

	public cir(int posX, int posY, int tam, PApplet app) {
		super(posX, posY, tam, app);
		this.app = app;

		// TODO Auto-generated constructor stub
	}

	@Override
	public void pintar() {
		// TODO Auto-generated method stub
		super.pintar();
		app.ellipse(posX, posY, tam, tam);
	}

}
