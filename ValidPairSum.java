problem link:https://practice.geeksforgeeks.org/problems/3b76f77c1b2107f809b1875aa9fe929ce320be97/0

//User function Template for Java

class Solution 
{ 
    static long ValidPair(int a[], int n) 
	{ 
	    // Your code goes here
	    int temp=0;
	    int left=0;
	    int right=a.length-1;
	    long count=0;
	    Arrays.sort(a);
	    while(left<right)
	    {
	        temp=a[left]+a[right];
	        if(temp>0)
	        {
	            count+=right-left;
	            right--;
	        }
	        else
	        {
	            left++;
	        }
	    }
	    return count;
	}
} 
