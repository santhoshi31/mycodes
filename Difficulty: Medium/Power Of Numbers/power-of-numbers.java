//{ Driver Code Starts
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // test cases

        Solution ob = new Solution();

        while (T-- > 0) {
            int n = sc.nextInt(); // input N
            int ans = ob.reverseExponentiation(n);
            System.out.println(ans);
        }

        sc.close();
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int reverseExponentiation(int n) {
        // code here
        int sum = 0;
        int copy = n;
        int remainder=0;
        while(n>0){
            remainder = n % 10;
            sum = ((sum*10)+remainder);
            n = n/10;
        }
        return (int)Math.pow(copy,sum);
    }
}
