package dev;

import java.util.Scanner;
public class HelloWorld 
{

	public static void main(String[] args) 
	{
		
		int i;
		float cal, suma = 0;
		int m [] = new int[10];
		float media;
		double v=0.0;
		double d=0.0;
		double rango;
		
		System.out.println("Hello world");
		Scanner cold = new Scanner(System.in);
		
		System.out.println("");
		System.out.println("Media aritmética");
		System.out.println("Deme el numero de calificaciones a recibir");
		int n=cold.nextInt();
		
		
		for (i = 0;i < n ; i++)
		{
			System.out.println("Deme la calificación " +(i+1));
			cal = cold.nextInt();
			suma=suma + cal;
			
		}
		
		media=suma/n;
		
		System.out.println("La media aritmética es: " + media);
		
		
		for(i = 1 ; i<=6; i++)
		{
			rango = Math.pow(m[i] - media,2f);
			v = v + rango;
		}
			  v = v / 6f;
		
		d = Math.sqrt(v);
		System.out.println("La media es: " + media);
		System.out.println("La varianza es: " + v);
		System.out.println("La desvianción estándar es: " + d);
		
	}
	
}