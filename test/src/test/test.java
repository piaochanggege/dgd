package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String s = "1175701448@qq.com";
		String regEx = "^[0-9]*@{1}\\w*.\\w*$";
		Pattern p = Pattern.compile(regEx);
		Matcher m = p.matcher(s);
		System.out.println(m.find());*/
		
		/*
		int row = 10,i,j;
		int[][] a = new int[row][row];
		for(i=0;i<row;i++)
			for(j=0;j<=i;j++)
			{
				if(j==0||i==j)
				{
					a[i][j] = 1;
					//System.out.println(a[i][j]);
				}
				else
				{
					a[i][j] = a[i-1][j-1]+a[i-1][j];
					//System.out.println(a[i][j]);
				}
			}
		
		for(i=0;i<row;i++)
		{
			int k = 0;
			for(;k<row-i-1;k++)
				System.out.print(" ");
			for(j=0;j<=i;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("*******************************************8");*/
		/*int u = 10,i,j,k;
		int[][] a = new int[10][];
		for(i=0;i<u;i++)
		{
			a[i] = new int[i+1];
			a[i][0] = 1;
			for(j=1;j<=i;j++)
			{
				if(i==j)
				{
					a[i][j] = 1;
				}
				else
				{
					a[i][j] = a[i-1][j-1]+a[i-1][j];
				}
			}
		}
		for(i=0;i<u;i++)
		{
			for(k=0;k<u-1-i;k++)
				System.out.print(" ");
			for(j=0;j<=i;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}*/
		System.out.println("第一种*******************************************8");
		String s = "1232dfhjxbfcj3489hewfc39的方法和飞机返回的金凤凰";
		HashMap<Character,Integer> m = new HashMap<Character,Integer>();
		int i ;
		for(i=0;i<s.length();i++)
		{
			if(m.containsKey(s.charAt(i)))
				m.put(s.charAt(i), m.get(s.charAt(i))+1);
			else
				m.put(s.charAt(i),1);
		}
		Iterator<Map.Entry<Character,Integer>> it = m.entrySet().iterator();
		while(it.hasNext())
		{
			Map.Entry<Character,Integer> me = it.next();
			System.out.println(me.getKey()+"出现:"+me.getValue()+"次");
		}
		System.out.println("第二种*******************************************8");
		Set<Character> ss = m.keySet();
		for(Character ss1 : ss)
		{
			System.out.println(ss1+"出现:"+m.get(ss1)+"次");
		}
		System.out.println("第三种*******************************************8");
		for(Map.Entry<Character, Integer> a : m.entrySet())
		{
			System.out.println(a.getKey()+"出现:"+a.getValue()+"次");
		}
	}

}
