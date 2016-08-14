package com.kk.learning.Problems;

public class StringToInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "-1004k343434343434343090";
		System.out.println("The string is "+str);
		try{
			long number = +stringToInt(str);
			System.out.println("The number is "+number);

		}catch(RuntimeException re)
		{
			System.out.println(re.getMessage());
		}
		

	}
	
	public static long stringToInt(String str)
	{
		int i=0;
		long number=0;
		int len = str.length();
		boolean isNegative=false;
		if(str.charAt(0)=='-')
		{
			isNegative=true;
			i=1;
		}
		char currentCharacter;
		while(i<len)
		{
			currentCharacter = str.charAt(i);
			if(currentCharacter>='0'&&currentCharacter<='9'){
				if(number<(Long.MAX_VALUE/10)){
				number*=10;
				number+=(currentCharacter-'0');
				i++;
				}
				else
				{
					throw new RuntimeException("The number is greater than the largest Integer(long) value possible");
				}
				
			}else
			{
				throw new RuntimeException("String cannot be converted as it contains non numeric characters");
			}
			
			
		}
		if(isNegative)
		{
			return -number;
		}
		return number;
	}

}
