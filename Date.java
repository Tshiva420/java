
public class Date {
private int day;
private String month;
private int year;
 public Date(){
	this.day=19;
	this.month="july";
	this.year=1997;
}

public Date(int day, String month, int year) {
	this.day = day;
	this.month = month;
	this.year = year;
}

public int getDay() {
	return day;
}
public void setDay(int day) {
	this.day = day;
}
public String getMonth() {
	return month;
}
public void setMonth(String month) {
	this.month = month;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public void display() {
	System.out.println("you have enter the date which is :  " + day + "/" + month + "/"+ year );
}

}
