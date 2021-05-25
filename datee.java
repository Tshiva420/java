import java.util.Scanner;

public class datee {
private int day;
private String month;
private int year;
public void acceptdata() {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter day");
	day=sc.nextInt();
	System.out.println("enter month");
	month=sc.next();
	System.out.println("enter year:-");
	year=sc.nextInt();
}
public void display() {
	System.out.println("Displaying the enter date:-...... day :"+day+"    month :"+month+"    year :-"+ year);
	
}
}
