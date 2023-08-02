import java.io.*;

class GreatestOfThree {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter first number : ");
        int num1 = Integer.parseInt(br.readLine());
        System.out.println("Enter second number : ");
        int num2 = Integer.parseInt(br.readLine());
        System.out.println("Enter third number : ");
        int num3 = Integer.parseInt(br.readLine());

        if(num1>num2 && num1>num3){
            System.out.println(num1+" is the greatest.");
        }else if(num2>num1 && num2>num3){
            System.out.println(num2+" is the greatest.");
        }else{
            System.out.println(num3+" is the greatest.");
        }
    }
}
