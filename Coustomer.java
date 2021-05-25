
public class Coustomer {
private String name;
private int age;
private String email;
private double creditLimit;

public Coustomer() {
	this.name="riya";
	this.email="riya@gmail.com";
	this.age=25;
	this.creditLimit=1000.0;
}

public Coustomer(String name, int age, String email, double creditLimit) {
	this.name = name;
	this.age = age;
	this.email = email;
	this.creditLimit = creditLimit;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public double getCreditLimit() {
	return creditLimit;
}

public void setCreditLimit(double creditLimit) {
	this.creditLimit = creditLimit;
}
public void display() {
	System.out.println("our valuable coustomer " + name + " with gmail account " + email+ " have age " + age +" is provided a credit limit from our bank is " + creditLimit );
}

}
