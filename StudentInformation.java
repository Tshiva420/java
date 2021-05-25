
import java.util.Scanner;

public class StudentInformation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rollNo;
		String name;
		int[] marks=new int[5];
Scanner sc=new Scanner(System.in);
System.out.println("enter your rollNumber:-");
rollNo=sc.nextInt();
System.out.println("enter your name:-");
name=sc.next();
System.out.println("enter your 5 subject marks");
for(int i=0;i<marks.length;i++) {
	marks[i]=sc.nextInt();
}
int total=0;
for(int i=0;i<marks.length;i++) {
	total=total+marks[i];
}
int percent=total/5;

char grade='0';
if(percent>75) {
	 grade='A';
	
}else if(percent<74 && percent>60) {
	grade='B';
}else if(percent<59){
	grade='c';
}else
	System.out.println("you have fill wrong data");
System.out.println("student name "+ name + " with rollNumber " + rollNo + " got "+ percent + "% with grade " +grade );



}

}
