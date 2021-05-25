
public class Testemploy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employ e1=new Employ();
Employ e2=new Employ();
Employ e3=new Employ();
Employ e4=new Employ();
Employ e5=new Employ();
Employ[] emp=new Employ[5];
emp[0]=e1;
emp[1]=e2;
emp[2]=e3;
emp[3]=e4;
emp[4]=e5;

for(int i=0;i<emp.length;i++) {
	emp[i].acceptInfo();
	
}
e1.setSalary(20000);
 for(int i=0;i<emp.length;i++) {
	 if(emp[i].getSalary()>=20000)
	emp[i].deplay();
	}




	}

}
