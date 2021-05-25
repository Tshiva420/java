
public class AddArrey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] [] arr1= {{1,2,4,5},{4,6,7,8},{1,9,8,5},{1,5,6,7}};
int [] [] arr2=	{{3,4,9,8},{1,9,8,2},{2,3,4,5},{6,7,8,9}};
int [][] arr=new int[arr1.length][arr1.length];
for(int i=0;i<arr1.length;i++) {
	for(int j=0;j<arr2.length;j++) {
		arr [i][j]=arr1[i][j]+arr2[i][j];
	}
}
System.out.println("Addition of two arrey arr1 and arr2 are :=");
for(int i=0;i<arr.length;i++) {
	for(int j=0;j<arr.length;j++) {
		System.out.print(" " + arr[i][j]);
	}System.out.println();
}
}

}
