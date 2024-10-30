package Parcial;
import java.lang.Math; 

public class Parcial {
	
	private int a;
	private int b;
	private int c;
	
	public Parcial(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}


public void getRaices() throws Exception {
	if (a == 0) {
		throw new Exception("No se puede dividir entre 0");
	} else if ((b*b) - (4*a*c) < 0) {
		throw new Exception("Hay raizes complejas");
	}else {
		double determinante = (b*b) - (4*a*c);
		double raiz1 = (-b + Math.sqrt(determinante))/(2*a);
		double raiz2 = (-b - Math.sqrt(determinante))/(2*a);
		if (raiz1 == raiz2) {
			System.out.println("Solo hay una raiz en su sistema: ");
			System.out.print(raiz1);
			return;
		} else {
			System.out.println("Hay dos raíces en su sistema: ");
			System.out.println("Raíz 1: ");
			System.out.println(raiz1);
			System.out.println("Raíz 2: " );
			System.out.println(raiz2);
			return;
		}
		
	}
}
}
