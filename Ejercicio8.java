import java.util.*;
import java.math.*;
public class Ejercicio8{
	public static void main(String[] args) {
		//declaramos variables e inicializamos scanner
		Scanner scanner = new Scanner(System.in);
		double numRandom;
		String salir;
		salir = "";
		while(!salir.equals("s")){
			do{
				numRandom = 1+Math.floor(Math.random()*100);
			} while(numRandom%5!=0);
			System.out.println("El numero "+numRandom+" es multiplo de 5");
			System.out.println("Desea salir presione s");
			salir = scanner.nextLine();
		}
		
	}
}