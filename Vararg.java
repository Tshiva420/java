
public class Vararg {
public static int sum(int...a) {
	int sum=0;
	for(int i=0;i<a.length;i++) {
		sum=sum+a[i];
	}
	return sum;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int c=sum(1,2,5,4,6,7,8,9,4,8);
System.out.println("sum of variabl numbers is :=" + c);
	}

}
