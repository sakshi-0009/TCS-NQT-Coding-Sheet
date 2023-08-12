import java.io.*;

class Automorphic {
    public static boolean isAutomorphic(int N) {
    int sq = N * N;

    while (N > 0) {

      if (N % 10 != sq % 10)
        return false;

      N /= 10;
      sq /= 10;
    }

    return true;
  }
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter number : ");
    int n = Integer.parseInt(br.readLine());
    if(isAutomorphic(n)==true)
    System.out.println("Automorphic Number");
    else
    System.out.println("Not Automorphic Number");
  }
}
