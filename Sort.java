package sortalgorithms;

public class Sort 
{    
    //Bubble Sort
    public int[] bubblesort(int[] a)
    {
        int n = a.length;
        int temp;
        
        for(int i = 0; i < n; i++)  {
            for(int j = 1; j < (n - i); j++)    {
                if(a[j - 1] > a[j]) {
                    temp = a[j - 1]; //swap
                    a[j - 1] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }
    
    //Selection Sort
    public int[] selectionsort(int[] a)
    {
        for(int i = 0; i < a.length - 1; i++)
        {
            int minIndex = smallestElement(a, i);
            a = swapElements(a, i, minIndex);
        }
        return a;
    }
    
    private static int smallestElement(int[] a, int i)
    {
        int minIndex = i;
        for(int c = minIndex + 1; c < a.length; c++)
        {
            if(a[c] < a[minIndex])
                minIndex = c;
        }
        return minIndex;
    }
    
    private static int[] swapElements(int[] a, int i1, int i2)
    {
        int temp = a[i1];
        a[i1] = a[i2];
        a[i2] = temp;
        return a;
    }
    
    //Quick Sort
    public int[] quicksort(int[] a, int l, int r) //l = left boundary, r = right boundary
    {
        if(r > l)
        {
            int i = l - 1;
            int j = r;
            int v = a[r]; //Pivotelement
            while(i < j) //Zeiger nicht überrundet
            {
                do {
                    i++;
                } while (a[i] < v);
                do {
                    if(j >= 1)
                        j--; 
                } while (a[j] > v);
                if(i < j)
                {
                    a = swapElements(a, i, j);
                }
            }
            a = swapElements(a, i, r);
            quicksort(a, l, i-1);
            quicksort(a, i+1, r);
        }
        return a;
    }
}