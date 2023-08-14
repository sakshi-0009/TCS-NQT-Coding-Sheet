package String;

import java.io.*;

class Palindrome {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter String : ");
		String str = br.readLine();
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		if (str.equals(rev)) {
			System.out.println(str+" is palindrome string");
		}else{
			System.out.println(str+" is not palindrome string");
		}
	}
}
