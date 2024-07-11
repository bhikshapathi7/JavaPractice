final class constructorOverloading {
    private  int id;
    private  String name;
	private constructorOverloading()
	{
		System.out.println("This is the default constructor");
	}
	protected constructorOverloading(int i, String s)
	{
		id=i;
		name=s;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constructorOverloading c= new constructorOverloading();
		constructorOverloading co= new constructorOverloading(18,"Virat");
		System.out.println("name is: "+ c.name+ " and id is :"+c.id);
		System.out.println("name is: "+ co.name+ " and id is :"+co.id);
	}

}
