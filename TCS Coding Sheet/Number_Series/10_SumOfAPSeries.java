import java.io.*;

class SumOfAPSeries {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter first term : ");
        double a = Double.parseDouble(br.readLine());
        System.out.println("Enter difference : ");
        double d = Double.parseDouble(br.readLine());
        System.out.println("Enter last term : ");
        double n = Double.parseDouble(br.readLine());

        double sum = (n / 2.0) * (2.0 * a + (n - 1) * d);

        System.out.println("Sum of AP series is : "+sum);

    }
}
