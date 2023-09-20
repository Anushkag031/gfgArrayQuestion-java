public void rotate(int arr[], int n)
    {
        
        int last_el = arr[n - 1], i;
        for (i = arr.length - 1; i > 0; i--)
            arr[i] = arr[i - 1];
            arr[0]=last_el;
        
        
        
    }
