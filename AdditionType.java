import java.util.Scanner;

public class AdditionType {
public static void addi() {
	Scanner sc=new Scanner(System.in);
	int result=0;
	System.out.println("enter number 1:-");
	int n1=sc.nextInt();
	System.out.println("enter number 2:-");
	int n2=sc.nextInt();
	result=n1+n2;
	System.out.println("sume of number is =" + result );
}
public static void addi(int num1,int num2) {
	int result=num1+num2;
	System.out.println("sum of number is =" + result);
}
public static double addi(double num1,int num) {
	double result=num1+num;
	return result;
}
public static int addi(int num1,int num2,int num3) {
	int result=num1+num2+num3;
	return result;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
addi();
addi(15,17);
double c=addi(12.76,18);
System.out.println("sum is= " + c);
int a=addi(6,12,9);
System.out.println("sum is= " + a);
	}

}
