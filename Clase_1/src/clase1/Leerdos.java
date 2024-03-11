package clase1;

import java.util.Scanner;

public class Leerdos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un entero: ");
		int a = sc.nextInt();
		System.out.println("Ingrese otro entero: ");
		int b = sc.nextInt();
		int suma = a+b;
		System.out.println("La suma es:" + suma  );
	}
}
