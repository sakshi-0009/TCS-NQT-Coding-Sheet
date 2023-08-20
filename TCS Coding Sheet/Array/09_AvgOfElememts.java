import java.io.*;

class AvgOfElememts {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter array size : ");
        int size = Integer.parseInt(br.readLine());

        int[] arr = new int[size];
        System.out.println("Enter Array elements :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
        sum += (double) arr[i];
        }
        double average = sum / arr.length;
        System.out.println("Average of all the elements in the array is : "+average);
    }
}
