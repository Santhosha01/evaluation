import java.util.ArrayList;
import java.util.Scanner;

public class eve4 {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter the length");
		        int len=sc.nextInt();
				int arr[]=new int[len]; 
		System.out.println("Enter the array Elements");
		        for(int i=0;i<arr.length;i++) {
			    	arr[i]=sc.nextInt();
			 }
		            int sum=0,max=0;
		            int count=0,first=0,last=0;
		            for (int i=0;i<arr.length;i++){
		                if(arr[i]<0){
		                    sum=0;
		                    count=0;
		                }else {
		                    sum+=arr[i];
		                    count++;
		                }
		                if(sum>max){
		                    max=sum;
		                    first=i-count+1;
		                    last=i;
		                }
		            }
		            System.out.println("Sum "+max);
		            System.out.println("Elements : ");
		            while (first<=last){
		                if(first==last){
		                    System.out.print(arr[first]);
		                }else {
		                    System.out.print(arr[first]+",");
		                }
		                last++;
		            }
		        }
}
