import java.util.HashMap;

public class FreaquencyOfCharacter {
	private static void characterCount(String inputString)
	{
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

		char[] ch = inputString.toCharArray();

		for (char c : ch)
		{
			if(hm.containsKey(c))
			{
				hm.put(c, hm.get(c)+1);
			}
			else
			{
				hm.put(c, 1);
			}
		}
		System.out.println(inputString+" : "+hm);
	}
	public static void main(String[] args)
	{
		characterCount("Java J2EE Java JSP J2EE");

		characterCount("All Is Well");

		characterCount("Done And Gone");

	}

}