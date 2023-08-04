import java.io.*;

class Power {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter base value : ");
        int N = Integer.parseInt(br.readLine());
        System.out.println("Enter power value : ");
        int K = Integer.parseInt(br.readLine());
        int ans = 1;
        for(int i=0; i<K; i++){
            ans = ans*N;
        }
        System.out.println(N+" to the power "+K+" is : "+ans);
    }
}
