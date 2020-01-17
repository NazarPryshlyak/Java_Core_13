package JavaCore13.task_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class DeputyGroup {
		
		private String deputyGroupName;
		
		public DeputyGroup(String deputyGroupName) {
			this.deputyGroupName = deputyGroupName;
		}
        public  String getdeputyGroupName() {
        	return  deputyGroupName;
        }	
        public void  setDeputyGroupName(String deputyGroupName) {
        	this.deputyGroupName =  deputyGroupName;
        }
        
        ArrayList<Deputy> deputyGroupArray = new ArrayList<Deputy>();
        
        public void addDeputy() {
        	 Scanner scanner = new Scanner(System.in);
        	 System.out.println("������ ������� ��������:");
        	 String surname = scanner.next();
        	 System.out.println("������ ��� ��������:");
        	 String name = scanner.next();
             System.out.println("������ �� ��������:");
             int age = scanner.nextInt();
             System.out.println("������ ��� ��������:");
             int height = scanner.nextInt();
             System.out.println("������ ���� ��������:");
             int weight = scanner.nextInt();
             System.out.println("���� ������� �����:");
             boolean bribeTaker = scanner.nextBoolean();

             Deputy deputy = new Deputy(surname, name, age, height, weight, bribeTaker);
             
             if (deputy.isBribeTaker()) {
            	 deputy.giveBribe();
             }
             
             deputyGroupArray.add(deputy);
             System.out.println("�������" + deputy.toString() + "������ ������� � �������!");
         }
	     public void removeDeputy() {
	    	 Scanner scanner = new Scanner(System.in);
        	 System.out.println("������ ������� ��������:");
        	 String surname = scanner.next();
        	 System.out.println("������ ��� ��������:");
        	 String name = scanner.next();
        	 
        	 boolean typeCorrect = isDeputyExists(deputyGroupArray, surname, name);
        	 
        	 if (typeCorrect) {
        		 
        		 Iterator<Deputy> iterator = deputyGroupArray.iterator();
        		 
        		 while (iterator.hasNext()) {
        			 Deputy nextDeputy = iterator.next();
        			 
        			 if (nextDeputy.getSurname().equalsIgnoreCase(surname) && nextDeputy.getName().equalsIgnoreCase(name)) {
        				 iterator.remove();
        				 System.out.println("������� " + nextDeputy.toString() + " ������ ��������� � �������!");
        			 }
        		 }	 
        	 } else {
        		 System.out.println("��������� �������� ���� � �������!");
        	 }
	     }
		
	     public void getBribeTakers() {
	    	 System.out.println("�������� �������, �� ������ �����:");
	    	 for (Deputy deputy : deputyGroupArray) {
	    		 if (deputy.isBribeTaker()) {
	    			 System.out.println(deputy.toString());
	    		 }
	    	 }
	     }
	     
	     public void getLargestBribeTaker() {
	    	 int bribeSize = 0;
	    	 int deputyIndex = -1;
	    	 
	    	 for (int i =0; i < deputyGroupArray.size(); i++) {
	    		 if (deputyGroupArray.get(i).isBribeTaker()) {
	    			 bribeSize = deputyGroupArray.get(i).getBribeSize();
	    			 deputyIndex = deputyGroupArray.indexOf(deputyGroupArray.get(i));
	    		 }
	    	 }
	     
	         if (deputyIndex >=0) {
	    	     System.out.println("��������� �������� ������� " + deputyGroupArray.get(deputyIndex).toString());
	         } else {
	    	      System.out.println(" � ������� ���� ���������!");
	         }
	     }
	     
	     public void getAllDeputies() {
	    	 System.out.println("�������� �� � � ���� �������:");
	    	 for (Deputy deputy : deputyGroupArray) {
	    		 System.out.println(deputy.toString());
	    	 }
	     }
	     
	     public void clearDeputyGroup() {
	    	 deputyGroupArray.clear();
	    	 System.out.println("�� �������� ���� ������ ������� � �������!");
	     }
	     
	     static private boolean isDeputyExists(ArrayList<Deputy> deputyGroupArray, String surname, String name) {
			boolean flag = false;
			
			for (Deputy deputy : deputyGroupArray) {
				if (deputy.getSurname().equalsIgnoreCase(surname) && deputy.getName().equalsIgnoreCase(name)) {
					flag = true;
				}
			}
			return flag;
		}
	
	     @Override
			public String toString() {
				
				return "������� \" " + deputyGroupName + "\"";
	     }
}
