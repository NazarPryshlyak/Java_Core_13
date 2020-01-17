package JavaCore13.task_1;

import java.util.Scanner;

public class Main {

	static void menu() {
		System.out.println();
		System.out.println("Введіть 1, Щоб додати фракцію в Верховну Раду");
		System.out.println("Введіть 2, Щоб видалити фракцію з Верховної Ради");
		System.out.println("Введіть 3, Щоб вивести всі фракції у Верховній Раді");
		System.out.println("Введіть 4, Щоб очистити введену фракцію");
		System.out.println("Введіть 5, Щоб вивести введену фракцію");
		System.out.println("Введіть 6, Щоб додати депутата в фракцію");
		System.out.println("Введіть 7, Щоб видалити депутата з фракції");
		System.out.println("Введіть 8, Щоб вивести список хабарників");
		System.out.println("Введіть 9, Щоб вивести найбільшого хабарника");
		
	}
	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			
			menu();
			
			switch (scanner.nextInt()) {
			
			case 1: {
				SupremeCouncil.getInstance().addDeputyGroup();
				break;
			}
			
			case 2: {
				SupremeCouncil.getInstance().removeDeputyFromDeputyGroup();
				break;
			}
			
			case 3: {
				SupremeCouncil.getInstance().getAllDeputyGroups();
				break;
			}
			
			case 4: {
				SupremeCouncil.getInstance().clearDeputyGroup();
				break;
			}
			
			case 5: {
				SupremeCouncil.getInstance().getDeputyGroup();
				break;
			}
			
			case 6: {
				SupremeCouncil.getInstance().getAllDeputiesFromDeputyGroup();
				break;
			}
			
			case 7: {
				SupremeCouncil.getInstance().removeDeputyFromDeputyGroup();
				break;
			}
			
			case 8: {
				SupremeCouncil.getInstance().getBribeTakersFromDeputyGroup();
				break;
			}
			
			case 9: {
				SupremeCouncil.getInstance().getLargestBribeTakerFromDeputyGroup();
				break;
			}
			
			default: {
				System.out.println("Введіть число від 1 до 9!");
				break;
			}
			}
		}
	}
}
