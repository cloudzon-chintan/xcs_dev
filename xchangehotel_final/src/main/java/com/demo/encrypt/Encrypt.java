package com.demo.encrypt;

import java.math.BigInteger;
import java.security.MessageDigest;

public class Encrypt 
{
	public static String md5(String input)
	{
		
		String md5=null;
		
			if(null == input)
				return null;
			
			try
			{
				
				MessageDigest digest = MessageDigest.getInstance("MD5");
				System.out.println("Come into md5 method");
				digest.update(input.getBytes(),0,input.length());
				md5 = new BigInteger(1,digest.digest()).toString(16);
			
			}
			catch(Exception e)
			{
				System.out.println("Error:MD5");
			}
			return md5;
	}
}
