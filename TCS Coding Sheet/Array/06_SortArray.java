import java.io.*;
import java.util.Arrays;

class SortArray {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter array size : ");
        int size = Integer.parseInt(br.readLine());

        int[] arr = new int[size];
        System.out.println("Enter Array elements :");
        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        int n = arr.length;
        Arrays.sort(arr);
        for (int i = 0; i < n / 2; i++) {
        System.out.print(arr[i] + " ");
        }
        for (int i = n - 1; i >= n / 2; i--) {
        System.out.print(arr[i] + " ");
        }
    }
}
