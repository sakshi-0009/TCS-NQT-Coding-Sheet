import java.io.*;

class LCM {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter num1 : ");
        int num1 = Integer.parseInt(br.readLine());
        System.out.println("Enter num2 : ");
        int num2 = Integer.parseInt(br.readLine());

        int ans = 1;
        for (int i = 1; i <= Math.min(num1, num2); i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                ans = i;
            }
        }
        int lcm = (num1 * num2) / ans;
        System.out.print("The LCM of the two given numbers is "+lcm);
    }
}
