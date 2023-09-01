problem link: https://practice.geeksforgeeks.org/problems/majority-element-1587115620/0



class Solution
{
    static int majorityElement(int a[], int size)
    {
        // your code here
        int count=0;
        int element=0;
        for(int i=0; i<size; i++)
        {
            if(count==0)
            {
                element=a[i];
                count=1;
            }
            else if(a[i]==element)
                count++;
            else
                count--;
        }
        int c=0;
        for(int i=0; i<size; i++)
        {
            if(a[i]==element)
            c++;
        }    
            if(c>size/2)
            return element;
            else
            return -1;
        
    }
}
