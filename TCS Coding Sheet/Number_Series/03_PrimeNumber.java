import java.io.*;

class PrimeNumber {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Number: ");
        int N = Integer.parseInt(br.readLine());

        int count = 0;
        
        for(int i=1; i<=N; i++){
            if(N%i == 0){
                count++;
            }
        }
        if(count==2){
            System.out.println(N+" is a prime number");
        }else{
            System.out.println(N+" is not a Prime number");
        }
    }
}
