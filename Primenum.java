import java.util.Scanner;

public class Primenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m,i,flag=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number:-");
 int a=sc.nextInt();
 m=a/2;
 if(a==0 || a==1) {
	 System.out.println("number is not prime number");
 }else {
	 for(i=2;i<=m;i++) {
		 if(a%i==0) {
			System.out.println("number is not prime");
			flag=1;
			break;
		 }
	 }if(flag==0) {System.out.println("number is prime");
 }
	 
 }
	}

}
