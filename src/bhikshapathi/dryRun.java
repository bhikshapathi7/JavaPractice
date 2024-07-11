package bhikshapathi;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class dryRun {
	
	@Test
	public void dryran()
	{
		//factorial
		/*int i;
		int fact=1;
		for(i=1;i<=7;i++)
		{
			fact=fact*i;
		}
		System.out.println("The result factorial value is "+ fact);*/
		//fibanocci
		
	/*int n1=0,n2=1,n3;
	int n=12;
	for(int i=2;i<=n;i++)
	{
		n3=n1+n2;
		System.out.println(n3);
		n1=n2;
		n2=n3;
	}*/
	//palindrome and Reverse of a no
	/*	int n=1478741;
		int temp=n;
		int rm=0;
		int Sum=0;
		while(n>0)
		{
			rm=n%10;
			System.out.println(rm);
			Sum=(Sum*10)+rm;
			System.out.println(Sum);
			n=n/10;
		}
		System.out.println("The Reverse of no is "+Sum);
		if(temp==Sum) {
			System.out.println("The given no is polindrome");
		}else {
			System.out.println("The given no is not polindrome");
		}*/
		
		//Bubble sort
		/*int a[]= {96,45,6,2,3,35,1};
		int swap;
		int x=a.length;
		
		for(int i=0;i<x;i++)
		{
			for(int j=i+1;j<x;j++)
			{
				if(a[i]>a[j])
				{
					swap=a[i];
					a[i]=a[j];
					a[j]=swap;
				}
			}
		}
			for(int k=0;k<x;k++)
			{
				System.out.print(a[k]+",");
			}*/
	
	//Remove duplicates letters from String
	//Print prime nos between 1-100
	/*int n=17;
	for(int i=1;i<=n;i++)
	{
	//	for(int j=i;j>=i;j--)
		//{
			int count=0;
			if(n%i==0)
			{
				count=count+1;
			}
			
			if(count==2) {
				System.out.println("it is prime number");
			}
			else {
				System.out.println("it is prime not number");	
			}
		
		String S="mississippi";
		char[] charArray=S.toCharArray();
		
		int count=S.length()-S.replace("s", "").length();
		System.out.println(count);
		for(int i=charArray.length-1;i>=0;i--)
		{
			System.out.print(charArray[i]);
		}
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<charArray.length;i++)
		{
			set.add(charArray[i]);
		}
		for(char c:set)
		{
			sb.append(c);
			
		}
		String res=sb.toString();
		System.out.println(res);
		for(char i='a';i<='z';i++)
		{
			int count=0;
			for(char c:charArray) {
				if(c==i)
				{
					count=count+1;
				}
			}
			if(count>0) {
				System.out.println("The count of occurence of "+i+" is "+ count);
				count=0;
			}
		}*/
		
		String s="mississippi is malayalam";
		char[] charArray=s.toCharArray();
		HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
		for(char c:charArray)
		{
			if(hm.containsKey(c))
			{
				hm.put(c, hm.get(c)+1);
			}
			else {
				hm.put(c, 1);
			}
		}
		
		System.out.println(hm);
		
		
		String[] s1=s.split("");
		
		for(int i=s1.length-1;i>0;i--)
		{
			System.out.print(s1[i]);
		}
		
	}
		
}
