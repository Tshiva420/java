import java.util.Scanner;

public class ReverseArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter elements of arrey :=");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("reverse arrey :=   ");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println(arr[i]);
			// System.out.println();
		}
	}

}
