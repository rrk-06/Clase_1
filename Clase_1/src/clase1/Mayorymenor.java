package clase1;

public class Mayorymenor {
	
	public static void main(String[] args) {
		
		int a = 150;
		int b = 250;
		int c = 60;
		int mayor = a;
		int menor = 0;
		int medio = 0;
		/*if (a < b) {
			System.out.println("B: " + b + "es mayor a A: "+ a);
		}
		else
		{
			System.out.println("A: " + a + "es mayor a B: "+ b);
		}
		boolean compare = a > b;
		System.out.println("A es mayor a B :" + compare);
		
		*/
		
		if (b > mayor) {
			medio = a; 
			mayor = b; 
			
			
		}
		else {
			
			medio = b; 
		}
		if (c > mayor)
		{
			menor = medio; 
			medio = mayor; 
			mayor = c; 
		}
		if (c > medio) {
			menor = medio;
			medio = c;
		}else {
			menor = c;
		}
		System.out.println("Mayor: " + mayor);
		System.out.println("Medio: " + medio);
		System.out.println("Menor: " + menor);
	}
	
	

	

}
