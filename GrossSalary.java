import java.util.Scanner;

public class GrossSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int basic;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the amount of basic salary :=");
basic=sc.nextInt();
int hra=0;
int da=0;
if(basic<=10000) {
	hra+=(20*basic)/100;
	da+=(80*basic)/100;
}else if(basic<=20000 && basic>10000) {
	hra+=(25*basic)/100;
	da+=(90*basic)/100;
}else if(basic>20000) {
	hra+=(30*basic)/100;
	da+=(95*basic)/100;
}
int grossSalary= basic+hra+da;
System.out.println("Gross salary of employ is :=" + grossSalary);
	}

}
