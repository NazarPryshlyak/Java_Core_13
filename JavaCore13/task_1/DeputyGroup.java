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
        	 System.out.println("Введіть прізвище депутата:");
        	 String surname = scanner.next();
        	 System.out.println("Введіть імя депутата:");
        	 String name = scanner.next();
             System.out.println("Введіть вік депутата:");
             int age = scanner.nextInt();
             System.out.println("Введіть ріст депутата:");
             int height = scanner.nextInt();
             System.out.println("Введіть вагу депутата:");
             int weight = scanner.nextInt();
             System.out.println("Бере депутат хабар:");
             boolean bribeTaker = scanner.nextBoolean();

             Deputy deputy = new Deputy(surname, name, age, height, weight, bribeTaker);
             
             if (deputy.isBribeTaker()) {
            	 deputy.giveBribe();
             }
             
             deputyGroupArray.add(deputy);
             System.out.println("Депутат" + deputy.toString() + "успішно доданий в фракцію!");
         }
	     public void removeDeputy() {
	    	 Scanner scanner = new Scanner(System.in);
        	 System.out.println("Введіть прізвище депутата:");
        	 String surname = scanner.next();
        	 System.out.println("Введіть імя депутата:");
        	 String name = scanner.next();
        	 
        	 boolean typeCorrect = isDeputyExists(deputyGroupArray, surname, name);
        	 
        	 if (typeCorrect) {
        		 
        		 Iterator<Deputy> iterator = deputyGroupArray.iterator();
        		 
        		 while (iterator.hasNext()) {
        			 Deputy nextDeputy = iterator.next();
        			 
        			 if (nextDeputy.getSurname().equalsIgnoreCase(surname) && nextDeputy.getName().equalsIgnoreCase(name)) {
        				 iterator.remove();
        				 System.out.println("Депутат " + nextDeputy.toString() + " успішно видалений з фракції!");
        			 }
        		 }	 
        	 } else {
        		 System.out.println("Введеного депутата немає в фракції!");
        	 }
	     }
		
	     public void getBribeTakers() {
	    	 System.out.println("Депутати фракції, які беруть хабарі:");
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
	    	     System.out.println("Найбільший хабарник фракції " + deputyGroupArray.get(deputyIndex).toString());
	         } else {
	    	      System.out.println(" В фракції нема хабарників!");
	         }
	     }
	     
	     public void getAllDeputies() {
	    	 System.out.println("Депутати які є в даній фракції:");
	    	 for (Deputy deputy : deputyGroupArray) {
	    		 System.out.println(deputy.toString());
	    	 }
	     }
	     
	     public void clearDeputyGroup() {
	    	 deputyGroupArray.clear();
	    	 System.out.println("Всі депутати були успішно видалені з фракції!");
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
				
				return "Фракція \" " + deputyGroupName + "\"";
	     }
}
