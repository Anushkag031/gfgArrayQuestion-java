class Solution{
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        func(0,0,arr,N,ans);
        Collections.sort(ans);
        return ans;
    }
    void func(int ind, int sum,  ArrayList<Integer> arr,int N, ArrayList<Integer> ans)
    {
        if(ind==N)
        {
            ans.add(sum);
            return;
        }
        //picking up the ele
        func(ind+1, sum + arr.get(ind), arr,N,ans);
        //not picking up
        func(ind+1, sum, arr,N,ans);
    }
    
}
