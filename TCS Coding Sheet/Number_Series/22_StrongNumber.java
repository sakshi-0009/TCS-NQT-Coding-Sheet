import java.io.*;

class StrongNumber {
	
	void isStrongNumber(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			int n = arr[i];
			int sum = 0;
			while(n!=0) {
				int rem = n%10;
				int fact = 1;
				
				for(int j=1;j<=rem;j++) {
					fact = fact*j;
				}
				sum = sum+fact;
				n = n/10;
			}
			if(sum==arr[i]) {
				System.out.println(arr[i]+" is a strong number found at index "+i);
			}
			else {
				System.out.println(arr[i]+" is not a strong number");
			}
		}
	}
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Array size: ");
		int size = Integer.parseInt(br.readLine());
		int arr[] = new int[size];
		
		System.out.println("Enter Array Elements : ");
		for(int i=0;i<arr.length;i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		StrongNumber obj = new StrongNumber();
		obj.isStrongNumber(arr);	
		}
}