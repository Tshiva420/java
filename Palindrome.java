import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n;
int reverse=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter number:-");
n=sc.nextInt();
int a=n;
while(n!=0) {
	int rimander=n%10;
	reverse=reverse*10 + rimander;
	n=n/10;
}

System.out.println("reverse is=" + reverse);
if(a==reverse){
	System.out.println("number is palindrome");
}else {
	System.out.println("number is not palindrome");
}
	}

}
