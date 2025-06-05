package Solution;

import java.util.Scanner;

public class MenuDisplay {
	public void showMenu()
	{
		System.out.println("\t\t*******************************************");
	    System.out.println("\t\t\t  EMPLOYEE MANAGEMENT SYSTEM");
	    System.out.println("\t\t*******************************************");
	    System.out.println("\t\t\t    --------------------");
	    System.out.println("\t\t\t     ~$ Abhinav Dubey");
	    System.out.println("\t\t\t    --------------------");
	    System.out.println("\n\nPress 1 : To Add an Employee Details");
	    System.out.println("Press 2 : To See an Employee Details ");
	    System.out.println("Press 3 : To Remove an Employee");
	    System.out.println("Press 4 : To Update Employee Details");
	    System.out.println("Press 5 : To Exit the EMS Portal");
	}
	
	public void clearScreen() {
		System.out.print("\033[H\033[2J");
	}
	
	public void pressContinue(Scanner sc) {
		System.out.print("\nPress Enter to Continue...");
		sc.nextLine();
	}
}
