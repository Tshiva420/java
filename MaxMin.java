
public class MaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] arr= {12,5,35,17,18,1,9};
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
	}

}
