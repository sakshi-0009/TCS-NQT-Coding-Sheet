import java.io.*;

class PrimeNumber_in_given_range {

    static boolean isPrime(int N){   
        int count = 0;
        
        for(int i=1; i<=N; i++){
            if(N%i == 0){
                count++;
            }
        }
            if(count==2)
                return true;
            return false;
        }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Range : ");
        int min = Integer.parseInt(br.readLine());
        int max = Integer.parseInt(br.readLine());

        for(int i=min; i<=max; i++) {
            if(isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
