package Solution;

import java.util.Scanner;

class EmployDetail
{
    private String name;
    private String father_name;
    private String email;
    private String position;
    private String employ_id;
    private String employ_salary;
    private String employ_contact;
    
    public void getInfo()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Employee's name --------: ");
        setName(sc.nextLine());
        System.out.print("Enter Employee's Father name -: ");
        setFather_name(sc.nextLine());
        System.out.print("Enter Employee's ID ----------: ");
        setEmploy_id(sc.nextLine());
        System.out.print("Enter Employee's Email ID ----: ");
        setEmail(sc.nextLine());
        System.out.print("Enter Employee's Position ----: ");
        setPosition(sc.nextLine());
        System.out.print("Enter Employee contact Info --: ");
        setEmploy_contact(sc.nextLine());
        System.out.print("Enter Employee's Salary ------: ");
        setEmploy_salary(sc.nextLine());
        sc.close();
    }
    
    public String toFormattedString() {
        return "Employee ID:" + getEmploy_id() + "\n"
             + "Employee Name     :" + getName() + "\n"
             + "Father's Name     :" + getFather_name() + "\n"
             + "Employee Contact  :" + getEmploy_contact() + "\n"
             + "Email Information :" + getEmail()+ "\n"
             + "Employee position :" + getPosition() + "\n"
             + "Employee Salary   :" + getEmploy_salary();
    }

	public String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	public String getFather_name() {
		return father_name;
	}

	private void setFather_name(String father_name) {
		this.father_name = father_name;
	}

	public String getEmail() {
		return email;
	}

	private void setEmail(String email) {
		this.email = email;
	}

	public String getPosition() {
		return position;
	}

	private void setPosition(String position) {
		this.position = position;
	}

	public String getEmploy_id() {
		return employ_id;
	}

	private void setEmploy_id(String employ_id) {
		this.employ_id = employ_id;
	}

	public String getEmploy_salary() {
		return employ_salary;
	}

	private void setEmploy_salary(String employ_salary) {
		this.employ_salary = employ_salary;
	}

	public String getEmploy_contact() {
		return employ_contact;
	}

	private void setEmploy_contact(String employ_contact) {
		this.employ_contact = employ_contact;
	}
    
    
}