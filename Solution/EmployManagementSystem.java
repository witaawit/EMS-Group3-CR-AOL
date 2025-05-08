package Solution;

import java.io.*;
import java.util.*;


class MainMenu
{
  public void menu()
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
}

class Employee_Add
{
    public void createFile()
    {
        Scanner sc=new Scanner(System.in);

        EmployDetail emp=new EmployDetail();
        emp.getInfo();
        try{
            File f1=new File("file"+emp.employ_id+".txt");
            if(f1.createNewFile()){
                FileWriter myWriter = new FileWriter("file"+emp.employ_id+".txt");
                myWriter.write("Employee ID:"+emp.employ_id+"\n"+"Employee Name     :"+emp.name+"\n"+
                "Father's Name     :"+emp.father_name+"\n"+"Employee Contact  :"+emp.employ_contact+"\n"+
                "Email Information :"+emp.email+"\n"+"Employee position :"+emp.position+"\n"+
                "Employee Salary   :"+emp.employ_salary);
                myWriter.close();
                System.out.println("\nEmployee has been Added :)\n");

                System.out.print("\nPress Enter to Continue...");
                sc.nextLine();
            }
            else {
                System.out.println("\nEmployee already exists :(");
                System.out.print("\nPress Enter to Continue...");
                sc.nextLine();
            }
        }
        catch(Exception e){System.out.println(e);}
    }
}

/*buat public class terus pindahin ke file baru ya nin*/
class Employee {
    private String id;
    private String name;
    private String fatherName;
    private Email email;
    private String position;
    private Salary salary;
    private PhoneNumber contact;

    public Employee(String id, String name, String fatherName, Email email,
                    String position, Salary salary, PhoneNumber contact) {
        this.id = id;
        this.name = name;
        this.fatherName = fatherName;
        this.email = email;
        this.position = position;
        this.salary = salary;
        this.contact = contact;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public Email getEmail() { return email; }
    public Salary getSalary() { return salary; }
    public PhoneNumber getContact() { return contact; }

    public String toFileString() {
        return "Employee ID:" + id + "\n" +
               "Employee Name     :" + name + "\n" +
               "Father's Name     :" + fatherName + "\n" +
               "Employee Contact  :" + contact + "\n" +
               "Email Information :" + email + "\n" +
               "Employee Position :" + position + "\n" +
               "Employee Salary   :" + salary;
    }
}


class EmployeeInput
{
    String name;
    String father_name;
    String email;
    String position;
    String employ_id;
    String employ_salary;
    String employ_contact;
    public void getInfo()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Employee's name --------: ");
        name=sc.nextLine();
        System.out.print("Enter Employee's Father name -: ");
        father_name=sc.nextLine();
        System.out.print("Enter Employee's ID ----------: ");
        employ_id=sc.nextLine();
        System.out.print("Enter Employee's Email ID ----: ");
        email=sc.nextLine();
        System.out.print("Enter Employee's Position ----: ");
        position=sc.nextLine();
        System.out.print("Enter Employee contact Info --: ");
        employ_contact=sc.nextLine();
        System.out.print("Enter Employee's Salary ------: ");
        employ_salary=sc.nextLine();
    }
}


class Employee_Show
{
  public void viewFile(String s) throws Exception
  {
    File file = new File("file"+s+".txt");
    Scanner sc = new Scanner(file);

    while (sc.hasNextLine())
     {
       System.out.println(sc.nextLine());
     }
   }
}


class Employee_Remove
{
    public void removeFile(String ID)
    {

    File file = new File("file"+ID+".txt");
      if(file.exists())
       {
         if(file.delete());
         {
           System.out.println("\nEmployee has been removed Successfully");
         }
       }
      else
       {
            System.out.println("\nEmployee does not exists :( ");
       }
     }
}


class Employee_Update
{
  public void updateFile(String s,String o,String n) throws IOException
  {
   File file = new File("file"+s+".txt");
   Scanner sc = new Scanner(file);
   String fileContext="";
   while (sc.hasNextLine())
       {
         fileContext =fileContext+"\n"+sc.nextLine();
       }
   FileWriter myWriter = new FileWriter("file"+s+".txt");
   fileContext = fileContext.replaceAll(o,n);
   myWriter.write(fileContext);
   myWriter.close();

  }
}



class CodeExit
{
  public void out()
  {
    System.out.println("\n*****************************************");
    System.out.println("$ cat Thank You For Using my Software :) ");
    System.out.println("*****************************************");
    System.out.println("\t\t/~ <0d3d by Abhinav Dubey\n");
    System.exit(0);
  }
}


class EmployManagementSystem
{
  static Scanner sc=new Scanner(System.in);
  
  public static void clearScreen(){
    System.out.print("\033[H\033[2J");
  }

  public static void pressEnter(){
    System.out.print("\nPress Enter to Continue...");
    sc.nextLine();
  }

  public static String getEmployeeID(){
    System.out.print("\nPlease Enter Employee's ID :");
    return sc.nextLine();
  }

  public static void showUpdateInstructions(){
    System.out.print("Please Enter the detail you want to Update :");
    System.out.print("\nFor Example :\n");
    System.out.println("If you want to Change the Name, then Enter Current Name and Press Enter. Then write the new Name then Press Enter. It will Update the Name.\n");
  }
  
  public static void main(String arv[])
  {
    Employee_Show epv =new Employee_Show();
    int choice=0;
    MainMenu obj1 = new MainMenu();
    while(choice<6)
    {
      clearScreen();
      obj1.menu();
      System.out.print("\nPlease Enter choice :");
      choice=Integer.parseInt(sc.nextLine());

      switch(choice)
      {
        case 1:
        {
          Employee_Add ep =new Employee_Add();
          ep.createFile();
          break;
        }
        case 2:
        {
          String employeeID=getEmployeeID();
          try
          {
            epv.viewFile(employeeID);}
            catch(Exception e){System.out.println(e);}
            pressEnter();
            break;
          }

        case 3:
        {
          String employeeID=getEmployeeID();
          Employee_Remove epr =new Employee_Remove();
          epr.removeFile(employeeID);

          pressEnter();
          break;
        }
        case 4:
        {
          String employeeID=getEmployeeID();
          try
          {
            epv.viewFile(employeeID);
          }
          catch(Exception e)
          {
            System.out.println(e);
          }
          Employee_Update epu = new Employee_Update();
          showUpdateInstructions();
          String oldinfo=sc.nextLine();
          System.out.print("Please Enter the Updated Info :");
          String newInfo=sc.nextLine();
          try
          {
            epu.updateFile(employeeID,oldinfo,newInfo);
            pressEnter();
            break;
          }
          catch(IOException e)
          {
            System.out.println(e);
          }
        }
        case 5:
        {
          CodeExit obj = new CodeExit();
          obj.out();
        }
      }
    }
  }
}
