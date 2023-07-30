import java.io.*;

class PositiveOrNegative {
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number: ");
        int N = Integer.parseInt(br.readLine());

        if(N < 0){
            System.out.println(N+" is negative number");
        }else if(N > 0){
            System.out.println(N+" is positive number");
        }else if(N == 0){
            System.out.println(N+" is Zero");
        }else{
            System.out.println("please enter valid number");
        }
    }
}
