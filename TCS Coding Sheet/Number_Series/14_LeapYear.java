import java.io.*;

class LeapYear {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter year : ");
        int year = Integer.parseInt(br.readLine());

        if(year%4 == 0 || year%400 == 0 && year%100 !=0){
            System.out.println(year+" is leap year!");
        }else{
            System.out.println(year+" is not leap year!");
        }
    }
}
