

class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        
        // Your code here
        long maxsum=arr[0];
        long cursum=arr[0];
        for(int i=1; i<arr.length; i++)
        {
             if(cursum<0)
            {
                cursum=0;
            }
            cursum+=arr[i];
            maxsum=Math.max(maxsum,cursum);
           
           
        }
        return maxsum;
        
    }
    
}
