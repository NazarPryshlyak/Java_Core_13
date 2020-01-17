package JavaCore13.task_1;

import java.util.Scanner;

public class Main {

	static void menu() {
		System.out.println();
		System.out.println("������ 1, ��� ������ ������� � �������� ����");
		System.out.println("������ 2, ��� �������� ������� � �������� ����");
		System.out.println("������ 3, ��� ������� �� ������� � �������� ���");
		System.out.println("������ 4, ��� �������� ������� �������");
		System.out.println("������ 5, ��� ������� ������� �������");
		System.out.println("������ 6, ��� ������ �������� � �������");
		System.out.println("������ 7, ��� �������� �������� � �������");
		System.out.println("������ 8, ��� ������� ������ ���������");
		System.out.println("������ 9, ��� ������� ���������� ���������");
		
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
				System.out.println("������ ����� �� 1 �� 9!");
				break;
			}
			}
		}
	}
}
