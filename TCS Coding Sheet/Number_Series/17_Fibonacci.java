import java.io.*;

class Fibonacci{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter range : ");
        int n = Integer.parseInt(br.readLine());
        int a = 1;
        int b = 0;
        int sum = 0;
        for(int i=0; i<n; i++){
            System.out.print(sum+" ");
            sum = a+b;
            a=b;
            b=sum;
        }
    }

}