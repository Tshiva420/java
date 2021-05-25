import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a;
Scanner sc=new Scanner(System.in);
System.out.println("enter number whose factorial you want:-");
a=sc.nextInt();
int b=1;
while(a!=0) {
	b=b*a;
	a=a-1;
}
System.out.println("factorial of number is" + "  " + b);
	}

}
