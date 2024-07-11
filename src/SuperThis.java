
 class SuperThis {
	
	private int i=20;
	void show()
	{
		System.out.println("This is super class variable "+ i);
	}
}
 class subThis extends SuperThis {
	 private int i=10;
		void show()
		{
			System.out.println("This is sub class variable "+ i);
			super.show();
		}
		
 }
 class demo1{
	public static void main(String[] args) {
		subThis st= new subThis();
		st.show();
	}
}