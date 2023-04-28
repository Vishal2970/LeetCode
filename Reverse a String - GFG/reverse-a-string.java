//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Driver
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- >0)
        {
            String str = read.readLine();
            System.out.println(new Reverse().reverseWord(str));
        }
    }
}
// } Driver Code Ends


//User function Template for Java


class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        // Reverse the string str
        StringBuilder sb=new StringBuilder(str);
        
        for(int i=0;i<str.length()/2;i++){
            char f=sb.charAt(i);
        char l=sb.charAt(str.length()-1-i);
            sb.setCharAt(i,l);
            sb.setCharAt(sb.length()-1-i,f);
        }
        return sb.toString();
        
    }
    // static String reverse(String s){
    //     StringBuilder sb=new StringBuilder(s);
    //     for (int i = 0; i <sb.length()/2; i++) {
    //         char first=sb.charAt(i);
    //         char last=sb.charAt(sb.length()-1-i);
    //         sb.setCharAt(i,last);
    //         sb.setCharAt(sb.length()-1-i,first);
    //     }
    //     return sb.toString();
    // }
}