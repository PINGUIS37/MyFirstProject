package dev;

import java.util.Scanner;
public class HelloWorld 
{

	public static void main(String[] args) 
	{
		
		int i;
		float val, suma = 0;
		int m [] = new int[10];
		float media;
		double v=0.0;
		double d=0.0;
		double rango;
		
		System.out.println("Hello world");
		Scanner cold = new Scanner(System.in);
		
		System.out.println("");
		System.out.println("Media aritmética");
		System.out.println("Deme el numero de valores a recibir");
		int n=cold.nextInt();
		
		
		for (i = 0;i < n ; i++)
		{
			System.out.println("Deme el valor " +(i+1));
			val = cold.nextInt();
			suma=suma + val;
			
		}
		
		media=suma/n;
		
		System.out.println("La media aritmética es: " + media);
		
		
		for(i = 1 ; i<=n; i++)
		{
			rango = Math.pow(m[i] - media,2f);
			v = v + rango;
		}
			  v = v / n;
		
		d = Math.sqrt(v);
		System.out.println("La media es: " + media);
		System.out.println("La varianza es: " + v);
		System.out.println("La desvianción estándar es: " + d);
		
	}
	
}