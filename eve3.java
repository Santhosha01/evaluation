import java.util.Arrays;
import java.util.Scanner;

public class eve3 {            
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int len=sc.nextInt();
		int len1=sc.nextInt();
		int arr1[]=new int[len];
	    for(int i=0;i<arr1.length;i++) {
	    	arr1[i]=sc.nextInt();
	    }
	    int arr2[]=new int[len1];
	    for(int i=0;i<arr2.length;i++) {
	    	arr2[i]=sc.nextInt();
	    } 
	            int ans[];
	            if(arr1.length>arr2.length){
	                ans=add(arr1,arr2);
	            }else {
	                ans=add(arr2,arr1);
	            }
	            System.out.println(Arrays.toString(ans));

	        }
	        public static int[] add(int arr1[],int []arr2){
	            int c=0;
	            int temp=0;
	            int ans[]=new int[arr1.length+1];
	            for(int i=arr1.length-1,j=arr2.length-1,k=ans.length-1;i>=0;i--,j--,k--){
	                if(j>=0){
	                    temp=arr1[i]+arr2[j]+c;
	                }else {
	                    temp=arr1[i]+c;
	                }
	                arr1[i]=temp%10;
	                ans[k]=temp%10;
	                temp/=10;
	                c=temp;
	            }
	            if(c==0){
	                return arr1;
	            }else {
	                ans[0]=c;
	                return ans;
	            }
	        }
}
