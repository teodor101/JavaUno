import java.util.Scanner;
import java.util.Arrays;

public class EjercicioArrays {

		public static void main(String[] args) {
			
		int vector[] =new int[10];
		
		
		int vectorElemento[] =new int[10];
		int suma=0;
		int media=0;
		
		//Ejercicio A
		
		System.out.println(" \n\n\n ******************************* ");
		System.out.println(" *** CREACIÓN VECTOR ALEATORIO * ");
		System.out.println(" *******************************\n\n\n ");
		
		for(int i=0;i<vector.length;i++)
		{
			vector[i]= (int) (Math.random()*31+0);
			System.out.println(" vector["+i+"] = "+ vector[i] + " ");
		}
		
		//Ejercicio B
		
		System.out.println(" \n\n\n ******************************* ");
		System.out.println(" *** SUMA Y MEDIA * ");
		System.out.println(" *******************************\n\n\n ");
		
		for(int i=0;i<vector.length;i++)
		{
			System.out.println(" vector["+i+"] = "+ vector[i] + " ");
			suma = suma + vector[i];
			suma = suma/11;
		}
			System.out.println("La suma es" + suma);
			System.out.println("La media es" + media);
			
			//Ejercicio C
			
			System.out.println("\n\n\n ********************************************** ");
			System.out.println(" *** Ordenar el vector *** ");
			System.out.println(" **********************************************\n\n\n ");
			
			
		}
}
