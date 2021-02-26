
interface sample{
	void Name();
	void address();
	void salary();
}
 class test implements sample
 {
	 
	 public void Name()
	 {
		 String Name="bk";
		 System.out.println("The name is :" + Name);
	 }
	 
	 public void address()
	 {
		 String address="Hyderabad";
		 System.out.println("Addrress  is: " + address);
	 }
	 
	 public void salary()
	 {
		 double salary=850000.00;
		 System.out.println("Salary is: " + salary);
	 }
 }

public class interfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 test t=new test();
 t.Name();
 t.address();
 t.salary();
	}

}
