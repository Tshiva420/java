import java.util.Scanner;

public class maximumno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter first number");
int a=sc.nextInt();
System.out.println("enter second number");
int b=sc.nextInt();
System.out.println("enter third number");
int c=sc.nextInt();
if(a>b&&a>c) {
	System.out.println(a + "is largest number in three");
}else if(b>a && b>c) {
	System.out.println(b+"is largest number in three");
}else {
	System.out.println(c + "is largest number in three");
}
	}

}
