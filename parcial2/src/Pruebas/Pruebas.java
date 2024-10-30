package Pruebas;
import Parcial.Parcial;

public class Pruebas {
	
public void prueba(int a, int b, int c) throws Exception{
	try {
	Parcial prueba1 = new Parcial(a, b, c);
	prueba1.getRaices();
	return;
	} catch (Exception e) {
		System.out.println("Se esta haciendo una operación no permitida: ");
		if (a==0) {
			System.out.println("Se esta dividiendo entre cero.");
		} else {
			System.out.println("Se esta sacando raices de números negativos.");
		}
	}
} }

