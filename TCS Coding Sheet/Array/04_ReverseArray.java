import java.io.*;

class ReverseArray {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter array size: ");
        int size = Integer.parseInt(br.readLine());

        int[] arr = new int[size];
        System.out.println("Enter Array elements :");
        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        int[] ans = new int[size];
        for (int i = size - 1; i >= 0; i--) {
         ans[size - i - 1] = arr[i];
        }
        System.out.print("Reversed array is : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
