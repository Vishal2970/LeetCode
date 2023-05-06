//{ Driver Code Starts
//Initial Template for C++

#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
//User function Template for C++

class Solution{
public:
   string stringMirror(string str){
       
       string s="",r="";
       s+=str[0],r+=str[0];
       string prev=s+r;
       
       for(int i=1; i<str.size(); i++){
           
           s+=str[i];
           r=str[i]+r;
           
           if(prev>s+r){
               
               prev=s+r;
           }else{
               
               return prev;
           }
           
        }
       
       return prev;
    }
};

//{ Driver Code Starts.

int main(){
    int t;
    cin>>t;
    while(t--){
        string str;
        cin>>str;
        Solution ob;
        string res=ob.stringMirror(str);
        cout<<res<<endl;
    }
}
// } Driver Code Ends