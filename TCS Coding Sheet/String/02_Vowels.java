package String;
import java.io.*;
class Vowels {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter String : ");
        String str = br.readLine();
        int length = str.length();
        int vowels = 0;
        int consonants = 0;
        int whitespaces = 0;
        str = str.toLowerCase();
        for(int i=0; i<length; i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowels++;
            }else if(ch >='a' && ch<='z'){
                consonants++;
            }else if(ch == ' '){
                whitespaces++;
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("White spaces: " + whitespaces);
    }
}
