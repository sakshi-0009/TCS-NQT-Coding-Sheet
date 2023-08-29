package String;

import java.io.*;

class RemoveChar {
    public static String solve(String str, int n) {
        StringBuffer ans = new StringBuffer();

        for (int i = 0; i < n; i++) {
            int ascii = (int) str.charAt(i);

            if ((ascii >= 65 && ascii <= 90) || (ascii >= 97 && ascii <= 122)) {
                ans.append(str.charAt(i));
            }

        }
        return ans.toString();
    }

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter String: ");
        String str = br.readLine();

        int n = str.length();
        System.out.println("Resultant string:");
        System.out.println(solve(str, n));
    }
}
