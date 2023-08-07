import java.io.*;

class Factors {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number : ");
        int N = Integer.parseInt(br.readLine());
        System.out.print("Factors of "+N+" are : ");
        for(int i=1; i<=N; i++){
            if(N%i==0){
                System.out.print(i+" ");
            }
        }
    }
}