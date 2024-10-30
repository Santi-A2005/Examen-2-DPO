package Main;
import Pruebas.Pruebas;

public class Main {

	public  Main(String[] args) throws Exception {
		Pruebas prueba = new Pruebas();
		System.out.println("Prueba 1: ");
		prueba.prueba(0, 1, 2);
		System.out.println("Prueba 2: ");
		prueba.prueba(2, 1, 10);
		System.out.println("Prueba 3: ");
		prueba.prueba(4, 10, 4);
		System.out.println("Prueba 4: ");
		prueba.prueba(1, 2, 1);
	}
	
	public static void main(String[] args) throws Exception {
		new Main(args);
}
}

