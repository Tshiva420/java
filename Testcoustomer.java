import java.util.Scanner;

public class Testcoustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Coustomer c1=new Coustomer();
Scanner sc=new Scanner(System.in);
System.out.println("enter name , mail account , age and credit limit of coustomer");
String name=sc.next();
String mail=sc.next();
int age=sc.nextInt();
double limit = sc.nextDouble();
Coustomer c2=new Coustomer(name,age,mail,limit);
c1.display();
c2.display();
c2.setCreditLimit(500000);
c2.display();
	}

}
