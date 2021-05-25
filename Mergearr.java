
public class Mergearr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr1[]= {1,2,3,4};
int arr2[]= {6,7,8,9,0,4};
int arr[]=new int[arr1.length + arr2.length];	
int a=0;
for(int i:arr1) {
	arr[a]=i;
	a++;
}
System.out.println("size after 1st itiration  :-" +a);
for(int i:arr2) {
	arr[a]=i;
	a++;
}
System.out.println("size after second itiration  :-"+a);
System.out.println("element of merged arrey is :=");
for(int i=0;i<arr.length;i++) {
	System.out.println( arr[i]);
}
	
	}

}
