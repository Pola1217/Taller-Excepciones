package view;

import excp.valiColor;
import model.Figura;
import model.cir;
import model.cub;
import processing.core.PApplet;
import processing.core.PImage;

public class Main extends PApplet {

	public static void main(String[] args) {
		PApplet.main(Main.class.getName());
	}

	int u, u2;
	boolean comp, click1, click2;
	String color1, color2;
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
		comp = false;
		click1 = false;
		click2 = false;
		color1 = "null";
		color2 = "null";
		F = loadImage("fondo.png");
		losTry();
	}

	public void draw() {
		// System.out.println(mouseX+" "+"@"+" "+mouseY);
		background(255);
		imageMode(CENTER);
		image(F, 400, 400);
		BotonDeComparar();
		A.pintar();
		B.pintar();
		modificando();
		losTry();
		UnaClaseAlAñoNoHaceDaño();

	}

	private void UnaClaseAlAñoNoHaceDaño() {
		if (click1 == true) {
			fill(109, 159, 171, 20);
			ellipse(200, 300, 220, 220);
		}

		if (click2 == true) {
			fill(109, 159, 171, 20);
			rect(600, 300, 220, 220);
		}

	}

	private void MasClasesDeNombreRaro() throws valiColor {

		if (true == (A.getR() != B.getR() && A.getG() != B.getG() && A.getB() != B.getB())) {
			throw new valiColor("son diferentes \n el circulo " + color1 + " y el cuadro " + color2);
		}
		if (true == (A.getR() == 255 && A.getG() == 255 && A.getB() == 255)
				|| B.getR() == 255 && B.getG() == 255 && B.getB() == 255) {
			throw new valiColor("FATAL ERROR, el blanco no existe");
		}
		if (true == (A.getR() == B.getR() && A.getG() == B.getG() && A.getB() == B.getB())) {
			throw new valiColor("los dos son " + color1);
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

	private void BotonDeComparar() {
		rectMode(CENTER);
		fill(181, 188, 211);
		rect(400, 550, 200, 50);
		textAlign(CENTER);
		textSize(40);
		fill(48, 51, 106);
		text("comparar", 400, 560);

	}

	private void losTry() {

		try {

			MasClasesDeNombreRaro();

		} catch (Exception e) {

			// System.out.println(e.getMessage());
			textAlign(CENTER);
			textSize(34);
			fill(255, 0, 0);

			if (comp == true) {
				text(e.getMessage(), 400, 450);
			}
		}
	}

	public void mousePressed() {
		selecF();
		selecC();
	}

	private void selecF() {
		if (mouseX > 100 && mouseX < 300 && mouseY > 200 && mouseY < 400) {
			// System.out.println("hey");
			u = 1;
			click1 = true;
			click2 = false;
		}
		if (mouseX > 500 && mouseX < 700 && mouseY > 200 && mouseY < 400) {
			// System.out.println("ho");
			u = 2;
			click1 = false;
			click2 = true;
		}

		// boton
		if (mouseX > 300 && mouseX < 500 && mouseY > 527 && mouseY < 577) {
			// System.out.println("hua");
			comp = true;

		}
	}

	private void selecC() {
		if (mouseX > 266 && mouseX < 309 && mouseY > 612 && mouseY < 655) {
			// System.out.println("c1");
			if (u2 == 1) {
				// System.out.println("exito del circulo");
				// 179,110,51
				A.setR(179);
				A.setG(110);
				A.setB(51);
				comp = false;
				color1 = "sienna";
			}
			if (u2 == 2) {
				// System.out.println("exito del cuadrado");
				B.setR(179);
				B.setG(110);
				B.setB(51);
				comp = false;
				color2 = "sienna";
			}
		}
		if (mouseX > 322 && mouseX < 365 && mouseY > 612 && mouseY < 655) {
			// System.out.println("c2");
			if (u2 == 1) {
				// System.out.println("exito del circulo");
				// 166,98,75
				A.setR(166);
				A.setG(98);
				A.setB(75);
				comp = false;
				color1 = "siennest";
			}
			if (u2 == 2) {
				// System.out.println("exito del cuadrado");
				B.setR(166);
				B.setG(98);
				B.setB(75);
				comp = false;
				color2 = "siennest";
			}
		}
		if (mouseX > 378 && mouseX < 421 && mouseY > 612 && mouseY < 655) {
			// System.out.println("c3");
			if (u2 == 1) {
				// System.out.println("exito del circulo");
				// 70,51,57
				A.setR(70);
				A.setG(51);
				A.setB(57);
				comp = false;
				color1 = "café";
			}
			if (u2 == 2) {
				// System.out.println("exito del cuadrado");
				B.setR(70);
				B.setG(51);
				B.setB(57);
				comp = false;
				color2 = "café";
			}
		}
		if (mouseX > 434 && mouseX < 478 && mouseY > 612 && mouseY < 655) {
			// System.out.println("c4");
			if (u2 == 1) {
				// System.out.println("exito del circulo");
				// 108,82,91
				A.setR(108);
				A.setG(82);
				A.setB(91);
				comp = false;
				color1 = "dimgray";
			}
			if (u2 == 2) {
				// System.out.println("exito del cuadrado");
				B.setR(108);
				B.setG(82);
				B.setB(91);
				comp = false;
				color2 = "dimgray";
			}
		}
		if (mouseX > 490 && mouseX < 534 && mouseY > 612 && mouseY < 655) {
			// System.out.println("c5");
			if (u2 == 1) {
				// System.out.println("exito del circulo");
				// 169,133,135
				A.setR(169);
				A.setG(133);
				A.setB(135);
				comp = false;
				color1 = "rosybrown";
			}
			if (u2 == 2) {
				// System.out.println("exito del cuadrado");
				B.setR(169);
				B.setG(133);
				B.setB(135);
				comp = false;
				color2 = "rosybrown";
			}
		}
		if (mouseX > 266 && mouseX < 309 && mouseY > 669 && mouseY < 713) {
			// System.out.println("c6");
			if (u2 == 1) {
				// System.out.println("exito del circulo");
				// 204,171,214
				A.setR(204);
				A.setG(171);
				A.setB(214);
				comp = false;
				color1 = "lila";
			}
			if (u2 == 2) {
				// System.out.println("exito del cuadrado");
				B.setR(204);
				B.setG(171);
				B.setB(214);
				comp = false;
				color2 = "lila";
			}
		}
		if (mouseX > 322 && mouseX < 365 && mouseY > 669 && mouseY < 713) {
			// System.out.println("c7");
			if (u2 == 1) {
				// System.out.println("exito del circulo");
				// 118,75,146
				A.setR(118);
				A.setG(75);
				A.setB(146);
				comp = false;
				color1 = "violeta";
			}
			if (u2 == 2) {
				// System.out.println("exito del cuadrado");
				B.setR(118);
				B.setG(75);
				B.setB(146);
				comp = false;
				color2 = "violeta";
			}
		}
		if (mouseX > 378 && mouseX < 421 && mouseY > 669 && mouseY < 713) {
			// System.out.println("c8");
			if (u2 == 1) {
				// System.out.println("exito del circulo");
				// 96,137,183
				A.setR(96);
				A.setG(137);
				A.setB(183);
				comp = false;
				color1 = "AZUL!!!";
			}
			if (u2 == 2) {
				// System.out.println("exito del cuadrado");
				B.setR(96);
				B.setG(137);
				B.setB(183);
				comp = false;
				color2 = "AZUL!!!";
			}
		}
		if (mouseX > 434 && mouseX < 478 && mouseY > 669 && mouseY < 713) {
			// System.out.println("c9");
			if (u2 == 1) {
				// System.out.println("exito del circulo");
				// 0,140,153
				A.setR(0);
				A.setG(140);
				A.setB(153);
				comp = false;
				color1 = "agua marina";
			}
			if (u2 == 2) {
				// System.out.println("exito del cuadrado");
				B.setR(0);
				B.setG(140);
				B.setB(153);
				comp = false;
				color2 = "agua marina";
			}
		}
		if (mouseX > 490 && mouseX < 534 && mouseY > 669 && mouseY < 713) {
			// System.out.println("c10");
			if (u2 == 1) {
				// System.out.println("exito del circulo");
				// 0,78,78
				A.setR(1);
				A.setG(78);
				A.setB(78);
				comp = false;
				color1 = "verde";
			}
			if (u2 == 2) {
				// System.out.println("exito del cuadrado");
				B.setR(1);
				B.setG(78);
				B.setB(78);
				comp = false;
				color2 = "verde";
			}
		}
	}
}
