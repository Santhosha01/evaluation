import java.util.Scanner;

public class eve5 {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.println("Enter the length:");
		        int size = scanner.nextInt();
		        int ans[][] = new int[size][size];
		        int temp = ans.length/2;
		        int start = 0;
		        int end = ans.length-1;
		        while (start <= temp){
		            if (start%2==0){
		                for (int i = start;i<=end;i++){
		                    ans[start][i] = 1;
		                }
		                for (int i = start;i<=end;i++){
		                    ans[i][end] = 1;
		                }
		                for (int i=end;i>=start;i--){
		                    ans[end][i] = 1;
		                }
		                for (int i = end;i>=start;i--){
		                    ans[i][start] = 1;
		                }
		            }
		            start++;
		            end--;
		        }

		        for (int i=0;i<ans.length;i++){
		            for (int j=0;j<ans[i].length;j++){
		                System.out.print(ans[i][j]+" ");
		            }
		            System.out.println();
		        }
		    }
}
