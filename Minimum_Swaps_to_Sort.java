



class Solution
{
    //Function to find the minimum number of swaps required to sort the array.
    public int minSwaps(int nums[])
    {
        // Code here
        int ans=0;
        int n=nums.length;
        int a[]=new int[n];  //creating copy array
        for(int i=0; i<n; i++)
        a[i]=nums[i]; //adding ele
        Arrays.sort(a);
        
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0; i<n; i++)
        {
            map.put(nums[i],i);  //putting ele with correct index
        }
        for(int i=0; i<n; i++)
        {
            if(nums[i]!=a[i])
            {
                int In =map.get(a[i]);
                map.put(nums[i],In);
                
                int temp=nums[In];
                nums[In]=nums[i];
                nums[i]=nums[In];
                ans++;
            }
        }
        return ans;
        
    }
}
