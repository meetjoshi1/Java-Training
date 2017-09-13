package Assgn3;

import java.util.Arrays;

public class StringAnagram { 
	
	public static void main(String args[]) {
		
		String s1="LISTEN";
		String s2="SILENT";
		boolean isAnagram = false;
	    if (s1.length() == s2.length()) {
	        char[] s1AsChar = s1.toCharArray();
	        char[] s2AsChar = s2.toCharArray();
	        Arrays.sort(s1AsChar);
	        Arrays.sort(s2AsChar);
	        isAnagram = Arrays.equals(s1AsChar, s2AsChar);
	        System.out.println("Two Strings are Anagram to each other "+isAnagram);
	    }
	    else 
	    {
	    	System.out.println("Two Strings are not Anagram to each other "+ isAnagram);
	    }
		
	}

}
