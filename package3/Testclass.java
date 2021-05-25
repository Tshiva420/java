package package3;

import package1.Student;
import package2.Batch;

public class Testclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student s1=new Student();
Batch b1=new Batch();
s1.accept();
s1.display();
b1.acceptinfo();
b1.displayInfo();
// hence another package can also access public data member of different class in different package
	}

}
