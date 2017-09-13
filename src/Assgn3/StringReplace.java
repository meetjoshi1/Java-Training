package Assgn3;

public class StringReplace {

	public static void main(String[] args) {
	
		String s="Hello Yellow";
		System.out.println("Old String:- " + s);
		if(s.contains("ello")) {
			System.out.println("New String:- "+s.replace("ello", "abcd"));
		}
	}

}
