import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class eve2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length");
		int len=sc.nextInt();
		int arr[]=new int[len]; 
		Set<Integer> s=new HashSet<>(); 
		System.out.println("Enter the array Elements");
		for(int i=0;i<arr.length;i++) {
		    	arr[i]=sc.nextInt();
		    	s.add(arr[i]);
		 }
		List<Integer> l=new ArrayList<>(s);
		List<Integer> l1=new ArrayList<>();
		int count;		
        for(int i=0;i<l.size();i++) {
        	count=0;
        	for(int j=0;j<arr.length;j++) {
        	if(l.get(i)==arr[j]) {
        		count++;
        	}
        	}
        	l1.add(count);
        }
        int max=0;
        int len1=l.size();
        for(int i=0;i<len1;i++) {
        	max=Collections.max(l1);
        	int ind=l1.indexOf(max);
        	while(max>0) {
        		System.out.println(l.get(ind));
        		max--;
        	}
        	l1.remove(ind);
        	l.remove(ind);
        }
	}

}
