//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            // First array input
            String[] str1 = br.readLine().trim().split(
                " "); // Read the first line and split by spaces
            int n = str1.length;
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str1[i]); // Convert each element to an integer
            }

            // Second array input
            String[] str2 = br.readLine().trim().split(
                " "); // Read the second line and split by spaces
            int m = str2.length;
            int[] b = new int[m];
            for (int i = 0; i < m; i++) {
                b[i] = Integer.parseInt(str2[i]); // Convert each element to an integer
            }

            Solution sln = new Solution();
            System.out.println(sln.numberofElementsInIntersection(a, b));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends

    
class Solution {
    public static int numberofElementsInIntersection(int a[], int b[]) {
        // Your code here
        
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;
        for(int i : a){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        for(int i : b){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            if(entry.getValue()>=2)
            {
                count++;
            }
        }
        
        return count;
        
    }
}