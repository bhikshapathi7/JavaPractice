
class overload{
 int add(int a, int b)
	{
		int c=a+b;
		return c;
	}
 int add(int a, int b, int c)
	{
		int d=a+b+c;
		return d;
	}
}
public class methodOverLoading {

	public static void main(String[] args) {
		overload o= new overload();
		System.out.println(o.add(4050, 5655));
		System.out.println(o.add(4050, 5655,47855));

	}

}
