problem link: https://practice.geeksforgeeks.org/problems/kth-smallest-element5635/0



class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        //Your code here
        int x=0;
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++)
        {
        x=arr[k-1];
        }
        return x;
    } 
    
}
