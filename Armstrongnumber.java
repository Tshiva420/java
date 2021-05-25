import java.util.Scanner;

public class Armstrongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b,c;
Scanner sc=new Scanner(System.in);
System.out.println("Armstrong number is a number that is equal to the sum of cubes of its digits.");
System.out.println("enter the number:-");
int n=sc.nextInt();
b=n;
 while(n!=0) {
	c=n%10;
	n=n/10;
	a=a+(c*c*c);
 }
 if(b==a) {
	 System.out.println("number is armstrong number");
 }else {
	 System.out.println("number is not armstrong number");
 }
	 
	}

}
