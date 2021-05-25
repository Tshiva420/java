
public class Testdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Date d1=new Date();
 d1.display();
// Date d2=new Date(03,"march",1996);
Date d2=new Date(12,"march",2012);
d2.display();
d1.setDay(03);
d1.setMonth("march");
d1.setYear(1996);
d1.display();
	}

}
