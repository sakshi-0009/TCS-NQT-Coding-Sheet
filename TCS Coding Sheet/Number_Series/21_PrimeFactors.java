import java.io.*;

class PrimeFactors {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Number : ");
        int n = Integer.parseInt(br.readLine());
        for (int i = 2; n > 1; i++) {

            if ( n % i == 0) {

                while ( n % i == 0) {

                    System.out.print(i + " ");
                    n = n / i;
                }
            }
        }
    }
}
