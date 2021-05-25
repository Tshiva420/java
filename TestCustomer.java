
public class TestCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Customer c=new Customer();
c.acceptInfo();
c.showDetails();

System.out.println(".........................................................");


Customer c1=new Customer();
c1.acceptInfo();
c1.setcreditLimit(2000);
c1.getcreditLimit();
c1.showDetails();

	}

}
