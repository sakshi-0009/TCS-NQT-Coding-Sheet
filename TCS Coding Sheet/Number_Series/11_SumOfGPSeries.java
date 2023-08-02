import java.io.*;

class SumOFGPSeries{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter first term : ");
        double a = Double.parseDouble(br.readLine());
        System.out.println("Enter common ratio : ");
        double r = Double.parseDouble(br.readLine());
        System.out.println("Enter number of terms : ");
        double n = Double.parseDouble(br.readLine());

        double sum = a * ((float) Math.pow(r, n) - 1) / (r - 1);
        System.out.println("Sum of GP Series is : "+sum);
    }
}