import java.util.Scanner;

public class Sumofseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number to find sum");
int n=sc.nextInt();
for(int i=1;i<=n;i++) {
	a=a+i;
}
System.out.println("sum of series of n number is :-" + "  " + a);
	}

}
