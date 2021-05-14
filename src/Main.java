
import excp.valiColor;
import processing.core.PApplet;
import processing.core.PImage;

public class Main extends PApplet {

	public static void main(String[] args) {
		PApplet.main(Main.class.getName());
	}

	int u, u2;
	Figura A;
	Figura B;
	PImage F;

	public void settings() {
		size(800, 800);

	}

	public void setup() {
		A = new cir(200, 300, 200, this);
		B = new cub(600, 300, 200, this);
		u = 0;
		u2 = 0;
		F = loadImage("fondo.png");
	}

	public void draw() {
		// System.out.println(mouseX+" "+"@"+" "+mouseY);
		background(255);
		imageMode(CENTER);
		image(F, 400, 400);
		A.pintar();
		B.pintar();
		modificando();
		try {
			MasClasesDeNombreRaro();
		} catch (Exception e) {

		System.out.println(e.getMessage());
		textAlign(CENTER);
		textSize(40);
		text(e.getMessage(), 400, 500);
		}

	}

	private void MasClasesDeNombreRaro() throws valiColor {

		if (true==(A.getR() != B.getR() && A.getG() != B.getG() && A.getB() != B.getB())) {
throw new valiColor("son diferentes");
		}

	}

	private void modificando() {
		switch (u) {
		case 1:
			u2 = 1;
			break;
		case 2:
			u2 = 2;
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
		if (mouseX > 100 && mouseX < 300 && mouseY > 200 && mouseY < 400) {
			System.out.println("hey");
			u = 1;
		}
		if (mouseX > 500 && mouseX < 700 && mouseY > 200 && mouseY < 400) {
			System.out.println("ho");
			u = 2;
		}
	}

	private void selecC() {
		if (mouseX > 266 && mouseX < 309 && mouseY > 612 && mouseY < 655) {
			System.out.println("c1");
			if (u2 == 1) {
				System.out.println("exito del circulo");
				// 179,110,51
				A.setR(179);
				A.setG(110);
				A.setB(51);
			}
			if (u2 == 2) {
				System.out.println("exito del cuadrado");
				B.setR(179);
				B.setG(110);
				B.setB(51);
			}
		}
		if (mouseX > 322 && mouseX < 365 && mouseY > 612 && mouseY < 655) {
			System.out.println("c2");
			if (u2 == 1) {
				System.out.println("exito del circulo");
				// 166,98,75
				A.setR(166);
				A.setG(98);
				A.setB(75);
			}
			if (u2 == 2) {
				System.out.println("exito del cuadrado");
				B.setR(166);
				B.setG(98);
				B.setB(75);
			}
		}
		if (mouseX > 378 && mouseX < 421 && mouseY > 612 && mouseY < 655) {
			System.out.println("c3");
			if (u2 == 1) {
				System.out.println("exito del circulo");
				// 70,51,57
				A.setR(70);
				A.setG(51);
				A.setB(57);
			}
			if (u2 == 2) {
				System.out.println("exito del cuadrado");
				B.setR(70);
				B.setG(51);
				B.setB(57);
			}
		}
		if (mouseX > 434 && mouseX < 478 && mouseY > 612 && mouseY < 655) {
			System.out.println("c4");
			if (u2 == 1) {
				System.out.println("exito del circulo");
				// 108,82,91
				A.setR(108);
				A.setG(82);
				A.setB(91);
			}
			if (u2 == 2) {
				System.out.println("exito del cuadrado");
				B.setR(108);
				B.setG(82);
				B.setB(91);
			}
		}
		if (mouseX > 490 && mouseX < 534 && mouseY > 612 && mouseY < 655) {
			System.out.println("c5");
			if (u2 == 1) {
				System.out.println("exito del circulo");
				// 169,133,135
				A.setR(169);
				A.setG(133);
				A.setB(135);
			}
			if (u2 == 2) {
				System.out.println("exito del cuadrado");
				B.setR(169);
				B.setG(133);
				B.setB(135);
			}
		}
		if (mouseX > 266 && mouseX < 309 && mouseY > 669 && mouseY < 713) {
			System.out.println("c6");
			if (u2 == 1) {
				System.out.println("exito del circulo");
				// 204,171,214
				A.setR(204);
				A.setG(171);
				A.setB(214);
			}
			if (u2 == 2) {
				System.out.println("exito del cuadrado");
				B.setR(204);
				B.setG(171);
				B.setB(214);
			}
		}
		if (mouseX > 322 && mouseX < 365 && mouseY > 669 && mouseY < 713) {
			System.out.println("c7");
			if (u2 == 1) {
				System.out.println("exito del circulo");
				// 118,75,146
				A.setR(118);
				A.setG(75);
				A.setB(146);
			}
			if (u2 == 2) {
				System.out.println("exito del cuadrado");
				B.setR(118);
				B.setG(75);
				B.setB(146);
			}
		}
		if (mouseX > 378 && mouseX < 421 && mouseY > 669 && mouseY < 713) {
			System.out.println("c8");
			if (u2 == 1) {
				System.out.println("exito del circulo");
				// 96,137,183
				A.setR(96);
				A.setG(137);
				A.setB(183);
			}
			if (u2 == 2) {
				System.out.println("exito del cuadrado");
				B.setR(96);
				B.setG(137);
				B.setB(183);
			}
		}
		if (mouseX > 434 && mouseX < 478 && mouseY > 669 && mouseY < 713) {
			System.out.println("c9");
			if (u2 == 1) {
				System.out.println("exito del circulo");
				// 0,140,153
				A.setR(0);
				A.setG(140);
				A.setB(153);
			}
			if (u2 == 2) {
				System.out.println("exito del cuadrado");
				B.setR(0);
				B.setG(140);
				B.setB(153);
			}
		}
		if (mouseX > 490 && mouseX < 534 && mouseY > 669 && mouseY < 713) {
			System.out.println("c10");
			if (u2 == 1) {
				System.out.println("exito del circulo");
				// 0,78,78
				A.setR(1);
				A.setG(78);
				A.setB(78);
			}
			if (u2 == 2) {
				System.out.println("exito del cuadrado");
				B.setR(1);
				B.setG(78);
				B.setB(78);
			}
		}
	}
}
