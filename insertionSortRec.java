public class Sort
{
    // Recursive function to sort an array using insertion sort
    static void insertionSort(int arr[], int n)
    {
       
        if (n <= 1)
            return;
      
 
        insertionSort( arr, n-1 );
    
        int last = arr[n-1];
        int j = n-2;
      
        while (j >= 0 && arr[j] > last)
        {
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = last;
    }
     

    public static void main(String[] args)
    {
        int arr[] = {15, 10, 16, 2, 3};
      
        insertionSort(arr, arr.length);
         
        System.out.println(Arrays.toString(arr));
    }
}
