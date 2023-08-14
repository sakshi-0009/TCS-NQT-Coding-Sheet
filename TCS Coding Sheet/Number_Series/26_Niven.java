import java.io.*;

class Niven{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number : ");
        int num = Integer.parseInt(br.readLine());
        int sum=0;
        int temp = num;
        while(num!=0){
            int rem = num%10;
            sum = sum+rem;
            num = num/10;
        }
        if(temp%sum==0){
            System.out.println(temp+" is a Niven number.");
        }else{
            System.out.println(temp+" is not Niven number.");
        }
    }
}