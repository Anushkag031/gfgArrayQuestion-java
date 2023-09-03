//problem link : https://practice.geeksforgeeks.org/problems/smallest-positive-missing-number-1587115621/0
class Solution
{
    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int arr[], int size)
    {
        // Your code here
        for(int i=0;i<size; i++)
       {
           //current index= arr[i]-1;
           while(arr[i]>0 && arr[i]<=size && arr[i]!=arr[arr[i]-1]){
            //swap(arr[i],arr[C]);
            int temp=arr[arr[i]-1];
            arr[arr[i]-1]=arr[i];
            arr[i]=temp;
           
           }
       }
        for(int i=0;i<size;i++)
        {
           if(arr[i]!=i+1)
           return i+1;
        }
        return size+1;
    }
}
