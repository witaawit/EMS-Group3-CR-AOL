package Solution;

import java.io.IOException;
import java.util.Scanner;

public class MenuController {
	private Scanner sc = new Scanner(System.in);

  public void handle(int choice) {
    switch (choice) {
        case 1 -> addEmployee();
        case 2 -> viewEmployee();
        case 3 -> removeEmployee();
        case 4 -> updateEmployee();
        case 5 -> out();
    }
  }

  private void addEmployee() {
    EmployDetail emp = new EmployDetail();
    FileManager ep =new FileManager();
    emp.getInfo();
    ep.createFile(emp);
  }

  private void viewEmployee() {
    FileManager ep =new FileManager();
    System.out.print("Enter Employee ID: ");
    String id = sc.nextLine();
    try {
      ep.viewFile(id);
    } catch (Exception e) {
      System.out.println(e);
    }
  }
    
  private void removeEmployee() {
    FileManager ep =new FileManager();
    System.out.print("\nPlease Enter Employee's ID :");
    String s=sc.nextLine();
    ep.removeFile(s);
  }
	
	private void updateEmployee() {
		FileManager ep =new FileManager();
    System.out.print("\nPlease Enter Employee's ID :");
    String I=sc.nextLine();
    try {
      ep.viewFile(I);
    }
    catch(Exception e) {
      System.out.println(e);
    }
    System.out.print("Please Enter the detail you want to Update :");
    System.out.print("\nFor Example :\n");
    System.out.println("If you want to Change the Name, then Enter Current Name and Press Enter. Then write the new Name then Press Enter. It will Update the Name.\n");
    String s=sc.nextLine();
    System.out.print("Please Enter the Updated Info :");
    String n=sc.nextLine();
    try {
      ep.updateFile(I,s,n);
    }
    catch(IOException e) {
      System.out.println(e);
    }
	}
	
	private void out()
	{
    System.out.println("\n*****************************************");
    System.out.println("$ cat Thank You For Using my Software :) ");
    System.out.println("*****************************************");
    System.out.println("\t\t/~ <0d3d by Abhinav Dubey\n");
    System.exit(0);
	}
}