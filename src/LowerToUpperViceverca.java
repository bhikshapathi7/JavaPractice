
public class LowerToUpperViceverca {
	
	static void convert()
	{
		String S="perSIStEnT SySTeMS";
		
		char[] ch=S.toCharArray();
		for(int j=0;j<ch.length;j++)
		{
			if(Character.isLowerCase(ch[j]))
			{
				System.out.print(Character.toUpperCase(ch[j]));
			}
			else
			{
				System.out.print(Character.toLowerCase(ch[j]));
			}
		}
				
		/*
		 * for(int i=0;i<sb.length();i++) { Character c=sb.charAt(i);
		 * 
		 * if(Character.isLowerCase(c)) { sb.setCharAt(i, Character.toUpperCase(c)); }
		 * else { sb.setCharAt(i, Character.toLowerCase(c)); }
		 * 
		 * } System.out.println(sb);
		 */
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sb=new StringBuffer("bhIkShaPathI");
		convert();

	}

}
