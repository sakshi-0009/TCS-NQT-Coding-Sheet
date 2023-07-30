import java.io.*;

class EvenOrOdd {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number : ");
        int N = Integer.parseInt(br.readLine());

        if(N%2 == 0){
            System.out.println(N+" is an even number");
        }else if(N%2 != 0){
            System.out.println(N+" is an odd number");
        }else{
            throw new NumberFormatException("Please enter valid Integer number");
        }

    }
}
