import java.util.Scanner;

public class Evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int sumeven=0;
 int sumodd=0;
 Scanner sc=new Scanner(System.in);
 System.out.println("enter number ");
 int n=sc.nextInt();
 for(int i=1;i<=n;i++) {
	 if(i%2==0) {
		 sumeven=sumeven+i;
	 }else {
		 sumodd=sumodd+i;
	 }
 }
 System.out.println("sum of even no is:-" + sumeven);
 System.out.println("sum of odd no :-" + sumodd);
	}

}
