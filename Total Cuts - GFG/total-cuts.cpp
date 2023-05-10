//{ Driver Code Starts
//Initial Template for C++

#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
//User function Template for C++

class Solution{
public:
    int totalCuts(int n,int k,vector<int> &arr){
        vector<int> l,s(n);
        int curr_min=arr[n-1],curr_max=arr[0];
        for(int i=0,j=n-1;i<n;i++,j--){
            curr_max=max(curr_max,arr[i]);
            l.push_back(curr_max);
            curr_min=min(curr_min,arr[j]);
            s[j]=curr_min;
        }
        int count=0;
        for(int i=0;i<n-1;i++){
            if(l[i]+s[i+1]>=k){
                count++;
            }
        }
        return count;
    }
};

//{ Driver Code Starts.

int main(){
    int t;
    cin>>t;
    while(t--){
        int N,K;
        cin>>N>>K;
        vector<int> A(N);
        for(int i=0;i<N;i++){
            cin>>A[i];
        }
        Solution ob;
        cout<<ob.totalCuts(N,K,A)<<endl;
    }
    return 0;
}
// } Driver Code Ends