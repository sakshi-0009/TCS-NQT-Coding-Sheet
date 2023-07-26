import java.io.*;

class palindrome{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Number : ");
        int N = Integer.parseInt(br.readLine());
        int reverse = 0;
        int temp = N;
        while(N!=0){
            int rem = N % 10;
            reverse = reverse * 10 + rem;
            N = N/10;
        }
        if(reverse == temp){
            System.out.println(temp+" is a palindrome number");
        }
        else{
            System.out.println(temp+" is not a palidrome number");
        }
    }
}