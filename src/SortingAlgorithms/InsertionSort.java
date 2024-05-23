package SortingAlgorithms;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {

        int inI = 0;
        int inJ = 0;
        int NoOfSwap = 0;
        int[] arr = {800, 20, 60, 9, 900, 1, 2, 3, 3, 77, 92, 22,90,2,87,6, 0};

        System.out.println("**********************************************************************");
        System.out.println("Insertion Sort O(n2)" + Arrays.toString(arr));
        System.out.println("**********************************************************************");
        System.out.println();

        for (int i = 1; i < arr.length; i++) {
            inI++;

            int val = arr[i];
            int j = i - 1;
            while (j >= 0 && val < arr[j]) {
                inJ++;
                arr[j + 1] = arr[j];
                NoOfSwap++;
                j--;
            }
            arr[j + 1] = val;
            NoOfSwap++;
        }

        System.out.println("Insertion sort O(n2) PROF V");
        System.out.println("sorted " + Arrays.toString(arr));
        System.out.println("Outer L = " + inI);
        System.out.println("Inner L = " + inJ);

        System.out.println("Swaps = " + NoOfSwap);
        System.out.println();

         inI = 0;
         inJ = 0;
         NoOfSwap = 0;
        int[] arr1 = {800, 20, 60, 9, 900, 1, 2, 3, 3, 77, 92, 22,90,2,87,6, 0};

        System.out.println("**********************************************************************");
        System.out.println("Insertion Sort O(n2)" + Arrays.toString(arr1));
        System.out.println("**********************************************************************");
        System.out.println();

        for(int i = 1; i < arr1.length; i++)
        {
            inI++;
//            [3, 2, 1, 80, 10]
            int value = arr1[i];
            int j = i - 1;

            int num = i;

            while(j >= 0 && value < arr1[j])
            {
                int temp = arr1[j];
                arr1[j] = value;
                arr1[num] = temp;

                inJ++;
                NoOfSwap++;
                j--;
                num--;
            }
        }

        System.out.println("Insertion sort O(n2) Sifiso V");
        System.out.println("sorted " + Arrays.toString(arr1));
        System.out.println("Outer L = " + inI);
        System.out.println("Inner L = " + inJ);

        System.out.println("Swaps = " + NoOfSwap);
        System.out.println();

        inI = 0;
        inJ = 0;
        NoOfSwap = 0;
        int[] arr3 = {800, 20, 60, 9, 900, 1, 2, 3, 3, 77, 92, 22,90,2,87,6, 0};

        System.out.println("**********************************************************************");
        System.out.println("Insertion Sort O(n2)" + Arrays.toString(arr3));
        System.out.println("**********************************************************************");
        System.out.println();

        for(int i = 1; i < arr3.length; i++)
        {
            inI++;

            int value = arr3[i];
            int hole = i;

            while(hole > 0 && arr3[hole - 1] > value)
            {
                arr3[hole] = arr3[hole -1];
                hole--;
                inJ++;
                NoOfSwap++;
            }

            arr3[hole] = value;
        }

        System.out.println("Insertion sort O(n2) Sifiso V2");
        System.out.println("sorted " + Arrays.toString(arr3));
        System.out.println("Outer L = " + inI);
        System.out.println("Inner L = " + inJ);

        System.out.println("Swaps = " + NoOfSwap);
        System.out.println();

    }
}
