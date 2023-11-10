class Solution {
    static String revStr(String S) {
        // code here
        
       //String str="";
       //for(int i=S.length()-1; i>=0; i--)
       //{
       //    str=str+S.charAt(i);
       //}
      // return str;

      
      //return new StringBuffer(S).reverse().toString();

      
        int i=0;
        char[] arr=S.toCharArray();
        int j=arr.length-1;
        while(i<=j)
        {
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
            
        }
        return new String(arr);
    }
}
