import java.util.Scanner;

public class Employ {
private int empid;
private String empName;
private String address;
private int salary;
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
Scanner sc=new Scanner(System.in);
public void acceptInfo() {
	System.out.println("enter employ id :-");
	empid=sc.nextInt();
	System.out.println("enter employ name :-");
	empName=sc.next();
	System.out.println("enter employ address :-");
	address=sc.next();
	System.out.println("enter employ salary :-");
	salary=sc.nextInt();
}
public void deplay() {
	System.out.println("our Employ " + empName + " has a salary of " + salary);
}
}
