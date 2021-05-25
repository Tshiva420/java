import java.util.Scanner;

public class power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int number;
int power;
Scanner sc=new Scanner(System.in);
System.out.println("enter number");
number=sc.nextInt();
System.out.println("enter power");
power=sc.nextInt();
int a=1;
while(power!=0) {
	a=a*number;
	power--;
}
System.out.println("power of number is:-" + a);
	}

}
