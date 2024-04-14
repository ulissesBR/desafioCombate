package application;

import java.util.Scanner;
import java.util.Locale;

import entities.Champion;

public class Main {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Champion champion1;
		Champion champion2;
		
		System.out.println("Digite os dados do primeiro campeão:");
		System.out.print("Nome: ");
		String name = sc.nextLine();
		
		System.out.print("Vida inicial: ");
		int life = sc.nextInt();
		
		System.out.print("Ataque: ");
		int attack = sc.nextInt();
		
		System.out.print("Armadura: ");
		int armor = sc.nextInt();
		
		champion1 = new Champion(name, life, attack, armor);
		sc.nextLine();
		
		System.out.println();
		
		System.out.println("Digite os dados do segundo campeão:");
		System.out.print("Nome: ");
		name = sc.nextLine();
		
		System.out.print("Vida inicial: ");
		life = sc.nextInt();
		
		System.out.print("Ataque: ");
		attack = sc.nextInt();
		
		System.out.print("Armadura: ");
		armor = sc.nextInt();
		
		champion2 = new Champion(name, life, attack, armor);
		sc.nextLine();
		
		System.out.print("Quantos turnos você deseja executar? ");
		int turns = sc.nextInt();
		
		for (int i = 0; i < turns; i++)
		{
			champion1.takeDamage(champion2);
			champion2.takeDamage(champion1);
			
			System.out.println();
			System.out.printf("Resultado do turno %d:%n", i+1);
			System.out.println(champion1);
			System.out.println(champion2);
			
			if (champion1.getLife() == 0 || champion2.getLife() == 0)
			{
				System.out.println();
				System.out.println("FIM DO COMBATE");
				break;
			}
			
		}
		
		sc.close();
	}
}
