import java.util.Scanner;

public class PerformFunctionArrey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of element  you want to enter := ");
		 n=sc.nextInt();
		 int[] arr=new int[n];
		System.out.println("enter elements of arrey :=");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int max=0;
		int min;
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		System.out.println("maximum is = " + max);
		min=max;
		for(int i=0;i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		System.out.println("minimum is = " + min);
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		System.out.println("sum of all element of arreey is :=" + sum);
		int average= sum/arr.length;
		System.out.println("average of all element is :=" + average);
		
		
	}

}
