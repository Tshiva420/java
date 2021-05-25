import java.util.Scanner;

public class AcceptArreysStr {
public static void acceptStr() {
	Scanner sc=new Scanner(System.in);

	System.out.println("enter no of names you want to enter:=");
	int n=sc.nextInt();
	String[] name = new String[n];
	System.out.println("enter the name you want to show:=");
	for(int i=0;i<n;i++) {
		name[i]=sc.next();
		}
	System.out.println("your list of names are :-");
	for(int i=0;i<name.length;i++) {
		System.out.println(" " + name[i].toUpperCase());
	}
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
acceptStr();
	}

}
