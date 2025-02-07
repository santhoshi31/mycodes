//{ Driver Code Starts
// Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.lang.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine().trim());

        while (t-- > 0) {
            String line1 = read.readLine().trim();
            String[] numsStr1 = line1.split(" ");
            int[] arr1 = new int[numsStr1.length];
            for (int i = 0; i < numsStr1.length; i++) {
                arr1[i] = Integer.parseInt(numsStr1[i]);
            }

            String line2 = read.readLine().trim();
            String[] numsStr2 = line2.split(" ");
            int[] arr2 = new int[numsStr2.length];
            for (int i = 0; i < numsStr2.length; i++) {
                arr2[i] = Integer.parseInt(numsStr2[i]);
            }

            Solution ob = new Solution();
            System.out.println(ob.checkEqual(arr1, arr2) ? "true" : "false");

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public static boolean checkEqual(int[] a, int[] b) {
        // Your code here
        
        if(!(a.length == b.length)){
            return false;
        }
        
        Map<Integer, Integer> check = new HashMap<>();
        
        for(int i = 0; i<a.length; i++){
            check.put(a[i],check.getOrDefault(a[i],0)+1);
        }
        
        for(int i = 0; i<b.length; i++){
            if(!check.containsKey(b[i]) || check.get(b[i]) == 0){
                return false;
            }
            
            check.put(b[i],check.get(b[i])-1);
        }
        
        return true;
        
    }
}