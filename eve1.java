import java.util.Scanner;

public class eve1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Character ");
		char c=sc.next().charAt(0);
		char first='A';
		int nooftimes=(c-first)*2+1,space1=(c-first),space2=-1;
        for(int i=0;i<nooftimes;i++){
            if(i==0 || i==nooftimes-1){
                System.out.println(" ".repeat(space1)+first);
            }else{
                System.out.println(" ".repeat(space1)+first+" ".repeat(space2)+first);
            }
            if(i>=(c-'A')){
                first--;
                space1++;
                space2-=2;
            }else {
                first++;
                space1--;
                space2+=2;
            }
        }
	}

}
