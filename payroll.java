import java.util.Scanner;

public class payroll {
private int empID;
private String name;
private double salary;
private double medical;
private double hra;
private double pf;
private double pt;
private double netSalary;
private double grossSalary;
public void acceptInfo() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter employ id :-");
	empID=sc.nextInt();
	System.out.println("enter employ name :-");
	name=sc.next();
	System.out.println("enter basic salary of employ :-");
	salary=sc.nextDouble();
	System.out.println("enter madical allowences :-");
	medical=sc.nextDouble();
	hra=(salary*50)/100;
	pf=(12*salary)/100;
	pt=200;
	grossSalary=salary+hra+medical;
	netSalary=grossSalary-(pt+pf);
}
public void display() {
   System.out.println("employ ID is :-" + empID );
   System.out.println("employ name is :-" + name + " with Basic salary of :-" + salary);
   System.out.println("Graoss salary of employ is :-" + grossSalary);
   System.out.println("Net salary of employ is :-" + netSalary);
}
}
