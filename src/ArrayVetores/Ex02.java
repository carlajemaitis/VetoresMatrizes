package ArrayVetores;

import java.util.Scanner;

public class Ex02
{
	public static void main(String[] args)
	{
		Scanner leia = new Scanner(System.in);
	
		int vetorNum[] = new int[10];
		int soma = 0;
		float media;
		String pares = "";
		String impares = "";
		
		for (int i =0; i < 10; i++)
		{
			System.out.println("Digite um número: ");
			vetorNum[i] = leia.nextInt();
		}
		
		for (int i =0; i < 10; i++)
		{
			soma = soma + vetorNum[i]; // ou soma += vetorNum[i];
			if (vetorNum[i] % 2 == 0)
			{
				pares += vetorNum[i] + " ";
			}
			if (i % 2 > 0)
			{
				impares += i + " ";
			}
		}
		
	media = soma / 10;
	System.out.println("A soma dos números digitados é igual a:  " + soma);
	System.out.println("Os números pares são:  " + pares);
	System.out.println("Os números nos índices ímpares são:  " + impares);
	System.out.println("A média dos números digitados é:  " + media);
	
	leia.close();
	}
}
