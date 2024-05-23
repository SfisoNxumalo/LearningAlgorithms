package SortingAlgorithms;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

        int inI = 0;
        int inJ = 0;
        int NoOfSwap = 0;
        int[] arr = {800, 20, 60, 9, 900, 1, 2, 3, 3, 77, 92, 22,90,2,87,6, 0};

        System.out.println("**********************************************************************");
        System.out.println("Selection Sort O(n2)" + Arrays.toString(arr));
        System.out.println("**********************************************************************");
        System.out.println();

        for (int i = 0; i < arr.length-1; i++) {
            int smallest = arr[i];
            int pos = i;
            inI++;
            for (int j = i+1; j < arr.length; j++){
                if (arr[j] < smallest) {
                    smallest = arr[j];
                    pos = j;
                }
                inJ++;
            }


            int temp = arr[pos];
            arr[pos] = arr[i];
            arr[i] = temp;
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
         arr = new int[]{800, 20, 60, 9, 900, 1, 2, 3, 3, 77, 92, 22, 90, 2, 87, 6, 0};

        System.out.println("**********************************************************************");
        System.out.println("Selection Sort O(n2)" + Arrays.toString(arr));
        System.out.println("**********************************************************************");
        System.out.println();

        for(int i = 0; i < arr.length; i++){
            inI++;
            int min = arr[i];
            int posi = i;

            for(int j = i+1; j < arr.length; j++){
                inJ++;
                if(min > arr[j]){
                    min=arr[j];
                    posi = j;
                }
            }
            int temp = arr[i];
            arr[i] = min;
            arr[posi] = temp;
            NoOfSwap++;

        }

        System.out.println("Insertion sort O(n2) HIWDI");
        System.out.println("sorted " + Arrays.toString(arr));
        System.out.println("Outer L = " + inI);
        System.out.println("Inner L = " + inJ);

        System.out.println("Swaps = " + NoOfSwap);
        System.out.println();

        inI = 0;
        inJ = 0;
        NoOfSwap = 0;
        arr = new int[]{800, 20, 60, 9, 900, 1, 2, 3, 3, 77, 92, 22,90,2,87,6, 0};
//        int[] arr2 = {0, 1, 2, 2, 3, 3, 6, 9, 20, 22, 60, 77, 87, 90, 92, 800, 900};

        System.out.println("**********************************************************************");
        System.out.println("Selection Sort O(n2)" + Arrays.toString(arr));
        System.out.println("**********************************************************************");
        System.out.println();

        for(int i = 0; i < arr.length; i++){
            inI++;
            int min = arr[i];
            int posi = i;
//            boolean swapped = false;

            for(int j = i+1; j < arr.length; j++){
                inJ++;
                if(arr[j] < min){
//                    System.out.println(min + " " + arr[j]);
                    min = arr[j];
                    posi = j;
//                    swapped = true;
                }
            }
            int temp = arr[i];
            arr[i] = min;
            arr[posi] = temp;
            NoOfSwap++;

//            if(!swapped){
//                break;
//            }

        }

        System.out.println("Insertion sort O(n2) OPT");
        System.out.println("sorted " + Arrays.toString(arr));
        System.out.println("Outer L = " + inI);
        System.out.println("Inner L = " + inJ);

        System.out.println("Swaps = " + NoOfSwap);
        System.out.println();

    }
}
