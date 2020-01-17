package JavaCore13.task_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public final class SupremeCouncil {
	
	private static SupremeCouncil instance = new SupremeCouncil();
	
	private SupremeCouncil() {
	}
    
	public static SupremeCouncil getInstance() {
		if (instance == null) {
			instance = new SupremeCouncil();
		}
		return instance;
	}
	
	ArrayList<DeputyGroup> supremeCouncilArray = new ArrayList<DeputyGroup>();
	
	public void addDeputyGroup() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ ����� �������:");
		String deputyGroupName = scanner.next();
		
		DeputyGroup deputyGroup = new DeputyGroup(deputyGroupName);
		
		supremeCouncilArray.add(deputyGroup);
		System.out.println(deputyGroup.toString() + " ������ ������ � �������� ����!");
	}
	
	public void removeDeputyGroup() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ ����� �������:");
		String deputyGroupName = scanner.next();
		
		boolean typeCorrect = isDeputyGroupExists(supremeCouncilArray, deputyGroupName);
		
		if (typeCorrect) {
			Iterator<DeputyGroup> iterator = supremeCouncilArray.iterator();
			
			while (iterator.hasNext()) {
				DeputyGroup nextDeputyGroup = iterator.next();
				
				if(nextDeputyGroup.getdeputyGroupName().equalsIgnoreCase(deputyGroupName)) {
					iterator.remove();
					System.out.println(nextDeputyGroup.toString() + " ������ ��������� � �������� ����!");
				}
			}
		} else {
			System.out.println("������� ������� � �������� ��� ����!");
		}
	}
	
	public void getAllDeputyGroups() {
		System.out.println("������� ������ � �������� ����:");
		for (DeputyGroup deputyGroup : supremeCouncilArray) {
			System.out.println(deputyGroup.toString());
		}		
	}
	
	public void clearDeputyGroup() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ ����� �������:");
		String deputyGroupName = scanner.next();
		
        boolean typeCorrect = isDeputyGroupExists(supremeCouncilArray, deputyGroupName);
		
		if (typeCorrect) {
			for (DeputyGroup deputyGroup : supremeCouncilArray) {
				if (deputyGroup.getdeputyGroupName().equalsIgnoreCase(deputyGroupName)) {
					deputyGroup.clearDeputyGroup();
				}
			}
	
		} else {
			System.out.println("������� ������� ���� � �������� ���!");
		}
	}
	
	public void getDeputyGroup() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ ����� �������:");
		String deputyGroupName = scanner.next();
		
		for (DeputyGroup deputyGroup : supremeCouncilArray) {
			if (deputyGroup.getdeputyGroupName().equalsIgnoreCase(deputyGroupName)) {
				System.out.println(deputyGroup.toString());
				deputyGroup.getAllDeputies();
			}
		}
	}
	
	public void addDeputyToDeputyGroup() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ ����� �������:");
		String deputyGroupName = scanner.next();
		
        boolean typeCorrect = isDeputyGroupExists(supremeCouncilArray, deputyGroupName);
		
		if (typeCorrect) {
			for (DeputyGroup deputyGroup : supremeCouncilArray) {
				if (deputyGroup.getdeputyGroupName().equalsIgnoreCase(deputyGroupName)) {
					deputyGroup.addDeputy();
				}
			}
	
		} else {
			System.out.println("������� ������� ���� � �������� ���!");
		}
	}
	
	public void removeDeputyFromDeputyGroup() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ ����� �������:");
		String deputyGroupName = scanner.next();

		boolean typeCorrect = isDeputyGroupExists(supremeCouncilArray, deputyGroupName);

		if (typeCorrect) {
			for (DeputyGroup deputyGroup : supremeCouncilArray) {
				if (deputyGroup.getdeputyGroupName().equalsIgnoreCase(deputyGroupName)) {
					deputyGroup.removeDeputy();
				}
			}

		} else {
			System.out.println("������� ������� ���� � �������� ���!");
		}
	}
	
	public void getBribeTakersFromDeputyGroup() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ ����� �������:");
		String deputyGroupName = scanner.next();
		
        boolean typeCorrect = isDeputyGroupExists(supremeCouncilArray, deputyGroupName);
		
		if (typeCorrect) {
			for (DeputyGroup deputyGroup : supremeCouncilArray) {
				if (deputyGroup.getdeputyGroupName().equalsIgnoreCase(deputyGroupName)) {
					deputyGroup.getBribeTakers();
				}
			}
	
		} else {
			System.out.println("������� ������� ���� � �������� ���!");
		}
	}
	
	public void getLargestBribeTakerFromDeputyGroup() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ ����� �������:");
		String deputyGroupName = scanner.next();
		
        boolean typeCorrect = isDeputyGroupExists(supremeCouncilArray, deputyGroupName);
		
		if (typeCorrect) {
			for (DeputyGroup deputyGroup : supremeCouncilArray) {
				if (deputyGroup.getdeputyGroupName().equalsIgnoreCase(deputyGroupName)) {
					deputyGroup.getLargestBribeTaker();
				}
			}
	
		} else {
			System.out.println("������� ������� ���� � �������� ���!");
		}
	}
	
	public void getAllDeputiesFromDeputyGroup() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ ����� �������:");
		String deputyGroupName = scanner.next();
		
        boolean typeCorrect = isDeputyGroupExists(supremeCouncilArray, deputyGroupName);
		
		if (typeCorrect) {
			for (DeputyGroup deputyGroup : supremeCouncilArray) {
				if (deputyGroup.getdeputyGroupName().equalsIgnoreCase(deputyGroupName)) {
					deputyGroup.getAllDeputies();
				}
			}
	
		} else {
			System.out.println("������� ������� ���� � �������� ���!");
		}
	}
	
	private boolean isDeputyGroupExists(ArrayList<DeputyGroup> supremeCouncilArray, String deputyGroupName) {
	    boolean flag = false;
	    
	    for (DeputyGroup deputyGroup : supremeCouncilArray) {
	    	if (deputyGroup.getdeputyGroupName().equalsIgnoreCase(deputyGroupName)) {
	    		flag = true;
	    	}
	    }
		return flag;
	}
}
