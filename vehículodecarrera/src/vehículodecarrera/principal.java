package vehículodecarrera;

import java.util.Scanner;
public class principal {
	
	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		
		int op,seguir=1;
		double T, vue,velo,promedio;

		System.out.print("Ingrese una opcion ");
		System.out.print("1.Calcular la velocidad promedio de un vehículo de carreras ");
		System.out.print("2. Salir");
		op=input.nextInt();
		
		
			
		 
		while(seguir==1) {
		switch(op){
		case 1:
	

		System.out.print("Ingrese la distancia: ");
		double d=input.nextDouble();
		System.out.print("Ingrese el tiempo: ");
		double t=input.nextDouble();
		System.out.print("Ingrese la cantidad de vueltas: ");
		vue=input.nextDouble();
		T= t * vue;
		System.out.print("En total de vueltas por tiempo es : "+T);
		velo = d/T;
		System.out.print("la velocidad es : "+velo);
		promedio= velo*1*3600/1*1000*1;
		System.out.print("el promedio de la velocidad es : "+ promedio +"Km/h");
		
		System.out.print("Ingrese 1 para repetir: ");
		System.out.print("Ingrese 0 para salir: ");
		seguir=input.nextInt();
		
 		break;
		

		case 2:
			
			
			default:
		

		}	
		}

		

	}
}
