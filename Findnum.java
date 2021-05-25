import java.util.Scanner;

public class Findnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter elements of arrey :=");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("enter number :=");
		int n=sc.nextInt();
		if(n<arr.length) {
			System.out.println("element present at position n is:= " + arr[n]);
		}else
			System.out.println("number not exist");
	}

}
