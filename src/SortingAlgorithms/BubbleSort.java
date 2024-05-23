package SortingAlgorithms;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int inI = 0;
        int inJ = 0;
         int NoOfSwap = 0;
        int[] arr = {800, 20, 60, 9, 900, 1, 2, 3, 3, 77, 92, 22,90,2,87,6, 0};

        System.out.println("**********************************************************************");
        System.out.println("Bubble Sort O(n2)" + Arrays.toString(arr));
        System.out.println("**********************************************************************");

        for(int i = 1; i < arr.length; i++){
            inI++;
            for(int j = 0; j < arr.length-1; j++){
                inJ++;
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    NoOfSwap++;
                }
            }
        }

        System.out.println("Bubble O(n2)");
        System.out.println("sorted " + Arrays.toString(arr));
        System.out.println("Outer L = " + inI);
        System.out.println("Inner L = " + inJ);

        System.out.println("Swaps = " + NoOfSwap);
        System.out.println();

        inI = 0;
        inJ = 0;
        NoOfSwap = 0;

        int[] arr2 = {800, 20, 60, 9, 900, 1, 2, 3, 3, 77, 92, 22,90,2,87,6,0};
        for(int i = 1; i < arr2.length; i++){
                    inI++;
                    for(int j = 0; j < arr2.length-i; j++){
                        inJ++;
                        if(arr2[j] > arr2[j+1]){
                            int temp = arr2[j];
                            arr2[j] = arr2[j+1];
                            arr2[j+1] = temp;
                            NoOfSwap++;
                        }
                    }
                }
        System.out.println("Bubble Alt1 O(n2)");
        System.out.println("sorted " + Arrays.toString(arr2));
        System.out.println("Outer L = " + inI);
        System.out.println("Inner L = " + inJ);

        System.out.println("Swaps = " + NoOfSwap);
        System.out.println();

        //        Fastest

        inI = 0;
        inJ = 0;
        NoOfSwap = 0;
        boolean swapped = true;
        int[] arr3 = {800, 20, 60, 9, 900, 1, 2, 3, 3, 77, 92, 22,90,2,87,6,0};

        while (swapped){
            inI++;
            swapped = false;
            for(int j = 0; j < arr3.length - inI; j++){
                inJ++;
                if(arr3[j] > arr3[j+1]){
                    swapped = true;
                    int temp = arr3[j];
                    arr3[j] = arr3[j+1];
                    arr3[j+1] = temp;
                    NoOfSwap++;
                }
            }
        }

        System.out.println("Bubble Alt O(n2) (W/ swap check)");
        System.out.println("sorted " + Arrays.toString(arr3));
        System.out.println("Outer L = " + inI);
        System.out.println("Inner L = " + inJ);

        System.out.println("Swaps = " + NoOfSwap);
        System.out.println();
    }
}
