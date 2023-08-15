package String;
import java.io.*;

class ASCIIValue {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter character : ");
        char ch = (char)br.read();
        
        int ascii = ch;
        System.out.println("The ASCII value of " + ch + " is: " + ascii);
    }
}
