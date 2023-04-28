//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine().trim());
            String arr[] = read.readLine().trim().split(" ");

            Solution ob = new Solution();
            System.out.println(ob.longestCommonPrefix(arr, n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    String longestCommonPrefix(String arr[], int n){
        // code here
        Arrays.sort(arr);
        String ans="";
        String s1=arr[0];
        String s2=arr[arr.length-1];
        int l=Math.min(s1.length(),s2.length());
        for(int i=0;i<l;i++){
            if(s1.charAt(0)!=s2.charAt(0)){
                return "-1";
            }
            if(s1.charAt(i)==s2.charAt(i)){
                ans+=s1.charAt(i);
            }
        }
        return ans;
    }
}