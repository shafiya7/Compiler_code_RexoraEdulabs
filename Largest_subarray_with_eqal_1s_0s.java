




import java.util.*;
import java.lang.*;
import java.io.*;


/*When we encounter a cumulative sum value which we have already encountered before, which means that sub-array from the previous index+1 till the present index has equal number of 0’s and 1’s as they give a cumulative sum of 0 .*/



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
