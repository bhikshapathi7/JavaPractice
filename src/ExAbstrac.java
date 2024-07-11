 abstract class ExAbstrac {
	
	public abstract int sum(int a, int b);
	public abstract int sum(int a, int b, int c);
	public void display()
	{
		System.out.println("testing of abstraction");
	}
}
class demo extends ExAbstrac{
	public int sum(int s1,int s2) 
	{
		return s1+s2;
		
	}
	public int sum(int a1,int a2,int a3) 
	{
		return a1+a2+a3;
		
	}
	public static void main(String[] args) {
		ExAbstrac e= new demo();
		e.display();
		System.out.println(e.sum(22, 89));
		System.out.println(e.sum(22, 89,11));
		
	}

}

