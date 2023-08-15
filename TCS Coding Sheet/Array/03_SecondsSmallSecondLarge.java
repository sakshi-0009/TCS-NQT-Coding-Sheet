import java.io.*;

class SecondsSmallSecondLarge {
static private int secondSmallest(int[] arr, int n){
	if (n < 2){
		return -1;
	}
	int small = Integer.MAX_VALUE;
	int second_small = Integer.MAX_VALUE;
	int i;
	for (i = 0; i < n; i++){
	   if (arr[i] < small){
		  second_small = small;
		  small = arr[i];
	   }
	   else if (arr[i] < second_small && arr[i] != small){
		  second_small = arr[i];
	   }
	}
   return second_small;
}

static private int secondLargest(int[] arr, int n){
	if(n<2){
        return -1;
    }
	int large = Integer.MIN_VALUE;
	int second_large = Integer.MIN_VALUE;
	int i;
	for (i = 0; i < n; i++){
		if (arr[i] > large){
			second_large = large;
			large = arr[i];
		}

		else if (arr[i] > second_large && arr[i] != large){
			second_large = arr[i];
		}
	}
	return second_large;
}

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Array size : ");
        int size = Integer.parseInt(br.readLine());

        int[] arr = new int[size];
        System.out.println("Enter Array elements :");
        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        int n = arr.length;
        int sS = secondSmallest(arr, n);
        int sL = secondLargest(arr, n);
        System.out.println("Second smallest is "+sS);
        System.out.println("Second largest is "+sL);
    }
}

