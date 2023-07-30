import java.io.*;

class PerfectNumber {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number: ");
        int N = Integer.parseInt(br.readLine());

        int sum = 0;
        for(int i=1; i<N; i++){
            if(N%i == 0){
                sum = sum+i;
            }
        }
        if(N==sum){
            System.out.println(N+" is a perfect number");
        }else{
            System.out.println(N+" is not a perfect number");
        }
    }
}
