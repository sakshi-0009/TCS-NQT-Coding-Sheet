import java.io.*;

class Sum {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Range: ");
        int Range = Integer.parseInt(br.readLine());

        int sum = 0;
        for(int i=0; i<=Range; i++){
            sum = sum+i;
        }
        System.out.println("Sum is: "+sum);
    }
}
