package com.kk.learning.Problems;
import java.util.HashSet;

public class StringUniqueChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "abcdefghABCs";
		System.out.println(uniqueCheckHashset(str));
		System.out.println(uniqueCheckLoop(str));

	}
	
	public static boolean uniqueCheckHashset(String checkString)
	{
		HashSet<Character> uniqueStringSet = new HashSet<>();
		for(int i=0;i<checkString.length();i++)
		{
			if(!uniqueStringSet.add(checkString.charAt(i)))
			{
				return false;
			}
		}
		return true;
	}
	
	public static boolean uniqueCheckLoop(String checkString)
	{
		char charToCheck;
		for(int i=0;i<checkString.length();i++)
		{
			charToCheck = checkString.charAt(i);
			for(int j=i+1;j<checkString.length();j++)
			{
				if(checkString.charAt(j)==charToCheck)
				{
					System.out.println(checkString.charAt(j) + " "+charToCheck);
					return false;
				}
			}
		}
		
		return true;
	}

}
