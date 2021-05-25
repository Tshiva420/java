import java.util.Scanner;

public class Compoundint {
public static void main(String[] args) {
	int a=0;
	int p;
	int r;
	int n;
	int time;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter principal");
	p=sc.nextInt();
	System.out.println("enter rate");
	r=sc.nextInt();
	System.out.println("enter period");
	n=sc.nextInt();
	System.out.println("enter time");
	time=sc.nextInt();
	int c=r/n;
	int d=n*time;
	int e=1+c;
	int f=1;
	while(d!=0) {
		f=f*e;
		d--;
	}
	a=p*f;
	System.out.println("compound intrest is :-"+ a);
	
}
}
