import java.io.*;

class factorial {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number : ");
        int N = Integer.parseInt(br.readLine());
        int mult = 1;
        for(int i=1; i<=N; i++){
            mult = mult*i;
        }
        System.out.println("Factorial of "+N+" are : "+mult);
    }
}
