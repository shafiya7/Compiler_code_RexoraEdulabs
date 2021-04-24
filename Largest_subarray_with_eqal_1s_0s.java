
import java.util.*;
import java.lang.*;
import java.io.*;


public class Largest_subarray_with_eqal_1s_0s {

	
	 public static void main (String[] args) throws java.lang.Exception
	  {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[] arr = new int[n];
	    for(int i=0;i<n;i++){
	            arr[i]=sc.nextInt();
	        }
	        int ans = max_length(arr,n);
	        System.out.println(ans);
	        
	  }
	  
	  public static int max_length(int[] arr,int n){
	    Map<Integer, Integer> m = new HashMap<>();
	      int mx = 0, cnt = 0;
	      for(int i = 0;i < arr.length;i++) {
	        cnt+=(arr[i] == 1)?1:-1;
	        if(cnt == 0)
	          mx = Math.max(mx, i+1);  
	        
	        
	        
	        if(m.containsKey(cnt)) {
	          mx = Math.max(mx, i - m.get(cnt));
	        } else 
	          m.put(cnt, i);
	      }
	      return mx;
	  }
	
	
	
}

