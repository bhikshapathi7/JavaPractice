
public class NpeCreation {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a=null;
		
		try {
			if(a.equals("asdf"))
			{
				System.out.println("same");
			}
			
		}
		catch(NullPointerException ex)
		{
			System.out.println(ex);
		}

	}

}
