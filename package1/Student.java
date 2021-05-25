package package1;

import java.util.Scanner;

public class Student {
public String name;
public int rollNo;
private String grade;
int totalMarks;
public void accept() {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter roll number of student:-");
	 rollNo=sc.nextInt();
	System.out.println("enter name of student:-");
	name=sc.next();
	System.out.println("enter grade obtained:-");
	grade=sc.next();
	System.out.println("Enter total marks:-");
	totalMarks=sc.nextInt();
}
public void display() {
	System.out.println("Student " + name + " with Roll NO- " + rollNo + " obtains "+ grade.toUpperCase()+ " on total marks- " + totalMarks);
}
}
