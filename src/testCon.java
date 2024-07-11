public class testCon {
	 String name;
	 int age;
	 double sal;
	
	 testCon()
	 {
		 name="bk";
		 age=28;
		 sal=76543.21;
		 
	 }
	 testCon(String s, int a,double sa)
	 {
		 name=s;
		 age=a;
		 sal=sa;
	 }
	 void talk()
	 {
		 System.out.println("i am " + name );
		 System.out.println("my age is  " + age );
		 System.out.println("my salary is " + sal );
	 }
 public static void main(String[] args) {
	 testCon t= new testCon();
	 t.talk();
	 testCon t2= new testCon("kav",21,25254.2);
	 t2.talk();
}
 }
