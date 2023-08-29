package String;
import java.io.*;
class RemoveSpace {
  static int removeSpaces(char[] str) {
    int count = 0;
    for (int i = 0; i < str.length; i++)
      if (str[i] != ' ') {
        str[count] = str[i];
        count++;
      }
    return count;
  }
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter String: ");
    char[] str = br.readLine().toCharArray();
    int count = removeSpaces(str);
    System.out.println(String.valueOf(str).subSequence(0, count));
  }
}
