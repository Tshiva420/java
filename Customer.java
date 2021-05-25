import java.util.Scanner;

public class Customer {
private String name;
private String email;
private int age;
private double creditLimit;
public void acceptInfo() {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter name of Coustomer:=");
	name=sc.next();
	System.out.println("enter mail account :=");
	email=sc.next();
	System.out.println("enter your age :=");
	age=sc.nextInt();
	System.out.println("enter your credit limit:=");
	creditLimit=sc.nextDouble();
}
public void showDetails() {
	System.out.println("the name of coustomer is :-" + name + " and his credit limit is :-" + creditLimit);
}
public void setcreditLimit(double limt) {
	this.creditLimit=limt;
}
public double getcreditLimit() {
	return creditLimit;
}
}
