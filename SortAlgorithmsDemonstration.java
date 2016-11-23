package sortalgorithms;

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class SortAlgorithmsDemonstration 
{
    static Scanner s = new Scanner(System.in);
    
    static Random r = new Random();
    static final int MIN = 0; //inclusive
    static final int MAX = 101; //exclusive
    
    static int N = 50;
    
    static Sort sort = new Sort();
    
    public static void main(String[] args) 
    {
        System.out.println("Type in the length N: ");
        N = getInteger();
        int[] a = new int[N];
        for(int i = 0; i < N; i++)  {
            a[i] = r.nextInt(MAX-MIN) + MIN;
        }
        System.out.println("Before sort:    " + Arrays.toString(a));
        
        //Bubble sort
        int[] bubbleSortedArray = sort.bubblesort(a);
        System.out.println("Bubble Sort:    " + Arrays.toString(bubbleSortedArray));
        
        //Sortieren durch Einfügen
        int[] selectionSortedArray = sort.selectionsort(a);
        System.out.println("Selection Sort: " + Arrays.toString(selectionSortedArray));
        
        //Quicksort
        int[] quickSortedArray = sort.quicksort(a, 0, N-1); //left and right boundary to sort
        System.out.println("Quick Sort:     " + Arrays.toString(quickSortedArray));
    }
    
    private static int getInteger ()
    {
        while(true)
        {
            try
            {
                int input = s.nextInt();
                return input;
            }
            catch (Exception ex)
            {
                System.out.println("Please type in an integer: ");
                s.next(); //verhindert infinite loop
            }
        }
    }
}
