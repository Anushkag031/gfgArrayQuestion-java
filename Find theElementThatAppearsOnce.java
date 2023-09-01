problem link:  https://practice.geeksforgeeks.org/problems/element-appearing-once2552/0

//User function Template for Java

class Sol
{
    public static int search(int A[], int N)
    {
        // your code here
        int ans=0;
        for(int i=0; i<N; i++)
        {
            ans=ans^A[i];  //performing XOR, it cancels same elements
        }
        return ans;
    }
}
