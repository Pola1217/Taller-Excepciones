
import processing.core.PApplet;
import processing.core.PImage;

public class Main extends PApplet {

	public static void main(String[] args) {
		PApplet.main(Main.class.getName());
	}
int u;
	Figura A;
	Figura B;
	PImage F;

	public void settings() {
		size(800, 800);

	}

	public void setup() {
		A = new cir(200, 300, 200, this);
		B = new cub(600, 300, 200, this);
		u=0;
		F = loadImage("fondo.png");
	}

	public void draw() {
		//System.out.println(mouseX+" "+"@"+" "+mouseY);
		background(255);
		imageMode(CENTER);
		image(F, 400, 400);
		A.pintar();
		B.pintar();
		modificando();

	}


	
	private void modificando() {
	switch (u) {
	case 1:
		
	
		
		break;
	case 2:
		
		break;

	default:
		break;
	}

	}

	public void mousePressed() {
		selecF();
		selecC();
	}

	private void selecF() {
if(mouseX>100&&mouseX<300&&mouseY>200&&mouseY<400) {
	System.out.println("hey");
}
if(mouseX>500&&mouseX<700&&mouseY>200&&mouseY<400) {
	System.out.println("no");
}
	}
	
	private void selecC() {
		if(mouseX>266&&mouseX<309&&mouseY>612&&mouseY<655) {
			System.out.println("c1");
		}
		if(mouseX>322&&mouseX<365&&mouseY>612&&mouseY<655) {
			System.out.println("c2");
		}
		if(mouseX>378&&mouseX<421&&mouseY>612&&mouseY<655) {
			System.out.println("c3");
		}
		if(mouseX>434&&mouseX<478&&mouseY>612&&mouseY<655) {
			System.out.println("c4");
		}
		if(mouseX>490&&mouseX<534&&mouseY>612&&mouseY<655) {
			System.out.println("c5");
		}
		if(mouseX>266&&mouseX<309&&mouseY>669&&mouseY<713) {
			System.out.println("c6");
		}
		if(mouseX>322&&mouseX<365&&mouseY>669&&mouseY<713) {
			System.out.println("c7");
		}
		if(mouseX>378&&mouseX<421&&mouseY>669&&mouseY<713) {
			System.out.println("c8");
		}
		if(mouseX>434&&mouseX<478&&mouseY>669&&mouseY<713) {
			System.out.println("c9");
		}
		if(mouseX>490&&mouseX<534&&mouseY>669&&mouseY<713) {
			System.out.println("c10");
		}
	}
}
