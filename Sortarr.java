import java.util.Scanner;

public class Sortarr {
	public static void swap(int a,int b) {
		
		int temp=0;
		temp=a;
		a=b;
		b=temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the number of elements you want to sort :=");
int a=sc.nextInt();
int arr[]=new int[a];
System.out.println("enter the element you want to sort :=");
for(int i=0;i<arr.length;i++) {
	arr[i]=sc.nextInt();
}
for(int i=0;i<arr.length;i++) {
	for(int j=i+1;j<arr.length;j++) {
		if(arr[i]>arr[j]) {
			int temp=0;
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;	
		}
	}System.out.println("sorted elements are :- " + arr[i]);
}

	}

}
