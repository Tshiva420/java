import java.util.Scanner;

public class TwoDarrey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the size of arrey you want :-");
int i=sc.nextInt();
int j=sc.nextInt();
int [][] ar2d=new int[i][j];
System.out.println("enter elements of arrey");
for(int a=0;a<ar2d.length;a++) {
	for(int b=0;b<ar2d.length;b++) {
		ar2d[a][b]=sc.nextInt();
	}
}
System.out.println("the elements of arrey are:-");
for(int a=0;a<ar2d.length;a++) {
	for(int b=0;b<ar2d.length;b++) {
		System.out.print("  " + ar2d[a][b]);
	}
	System.out.println();
}
	}

}
