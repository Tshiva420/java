import java.util.Scanner;

public class ArreyAccept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr=new int[5];
Scanner sc=new Scanner(System.in);
System.out.println("enter elements of arrey :=");
for(int i=0;i<arr.length;i++) {
	arr[i]=sc.nextInt();
}
for(int i=0;i<arr.length;i++) {
	System.out.println("index : " +i + " element :" + arr[i]);
	System.out.println();
}
	}

}
