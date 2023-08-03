import java.io.*;

class ReverseDigit {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number : ");
        int N = Integer.parseInt(br.readLine());
        int reverse = 0;
        while(N!=0){
            int rem = N%10;
            reverse = reverse*10+rem;
            N=N/10;
        }
        System.out.println(reverse);

    }
}
