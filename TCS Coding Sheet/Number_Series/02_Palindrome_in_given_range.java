import java.io.*;

class Palindrome_in_given_range {
    static boolean isPalindrome(int n){   
            int reverse = 0;
            int temp = n;
            while(temp>0) {
                reverse = reverse*10 + temp%10;
                temp = temp/10;
            }
            if(n==reverse)
                return true;
            return false;
        }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Range : ");
        int min = Integer.parseInt(br.readLine());
        int max = Integer.parseInt(br.readLine());

        for(int i=min; i<=max; i++) {
            if(isPalindrome(i)) {
                System.out.print(i + " ");
            }
        }
    }
}

