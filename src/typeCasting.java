
public class typeCasting {

	public static void main(String[] args) {
       // int to String
		int i=66;
		String s=Integer.toString(i);
		System.out.println(s);
		
		//String to Integer
		String d="4455";
		int j=Integer.parseInt(d);
		System.out.println(j);
		//String to char
		
		String name="bhikshapathi";
		
		char[] c=name.toCharArray();
		
		for(int c1=c.length-1;c1>=0;c1--) 
		{
			System.out.print(c[c1]);
		}
		//float to String 
		float f=6.5f;
		
		String h=Float.toString(f);
		System.out.println(h);	
		
		//double to String 
		double d1=850000.00;
		
		String sal=Double.toString(d1);
		System.out.println(sal);
	  
		// String to double
		String sala="71254.12";
		double dd=Double.parseDouble(sala);
		System.out.println(dd);
		
		
		String height="5.6f";
		
		float fh=Float.parseFloat(height);
		System.out.println(fh);
		
		
		int q=Integer.parseInt(sala);
		String b=Integer.toString(q);
		
		long l=Long.parseLong(sala);
		String ls=Long.toString(l);
		
		float ff=Float.parseFloat(ls);
		String lss=Float.toString(ff);
		
		double ddd=Double.parseDouble(lss);
		String df=Double.toString(ddd);
		
		char[] z=d.toCharArray();
		char x='k';
		
		String cs=Character.toString(x);
		
		
				
	}

}
