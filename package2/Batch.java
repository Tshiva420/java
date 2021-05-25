package package2;

import java.util.Scanner;

import package1.Student;

public class Batch {
	
	public int batchNo;
	private String batchName;
	Scanner sc=new Scanner(System.in);
	public void acceptinfo() {
		System.out.println("enter Batch number :=");
		batchNo=sc.nextInt();
		System.out.println("enter Batch name :=");
		batchName=sc.next();
		}
	public void displayInfo() {
		System.out.println("Studen is from batch no " + batchNo + " has batch name " + batchName);
		Student st=new Student();
		st.name="shreya"; // by use object of student class we can access public member of that class
	// st.grade="gg";	// we can not access private class in another package
	//	st.totalMarks=1200; // Default value is also not accessible in another package
		
		
	}
	
	



 
}
