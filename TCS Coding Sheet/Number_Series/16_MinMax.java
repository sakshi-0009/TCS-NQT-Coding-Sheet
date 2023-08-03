import java.io.*;

class MinMax {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number : ");
        int n = Integer.parseInt(br.readLine());

        int d;
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;

        while(n!=0){
            d = n%10;
            mini = Math.min(mini, d);
            maxi = Math.max(maxi, d);
            n = n/10;
        }
        System.out.println("Minimum number is : "+mini);
        System.out.println("maximum number is : "+maxi);
    }
}
