import java.io.*;

class ArmstrongNumber {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Number: ");
        int N = Integer.parseInt(br.readLine());

        int temp1 = N;
        int temp2 = N;
        int sum = 0;
        int count = 0;
        while(temp1 != 0){
            count++;
            temp1 = temp1/10;
        }
        while(temp2 != 0){
            int rem = temp2 % 10;
            int mult = 1;
            for(int i=1; i<=count; i++){
                mult = mult*rem;
            }
            sum = sum+mult;
            temp2 = temp2/10;
        }
        if(N==sum){
            System.out.println(N+" is an armstrong number");
        }else{
            System.out.println(N+" is not an armstrong number");
        }
    }
}
