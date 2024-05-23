package SortingAlgorithms;

import java.util.Arrays;

public class QuickSort {
    static int inI = 0;
    static int inJ = 0;
    static int NoOfSwap = 0;
    public static void main(String[] args) {


        int[] arr = {800, 20, 60, 9, 900, 1, 2, 3, 3, 77, 92, 22,90,2,87,6, 6};

        System.out.println("**********************************************************************");
        System.out.println("Quick Sort Sort O(n log n)" + Arrays.toString(arr));
        System.out.println("**********************************************************************");
        System.out.println();

        PROFquicksort(arr, 0, arr.length-1);

        System.out.println("Quick sort O(n log n) PROF V");
        System.out.println("sorted " + Arrays.toString(arr));
        System.out.println("Loop Iterations = " + inI);
        System.out.println("Recursive invocation = " + inJ);

        System.out.println("Swaps = " + NoOfSwap);
        System.out.println();

//        GPT QUICK SORT
        inI = 0;
        inJ = 0;
        NoOfSwap = 0;
        arr = new int[]{800, 20, 60, 9, 900, 1, 2, 3, 3, 77, 92, 22,90,2,87,6, 6};
        GPTquickSort(arr, 0, arr.length - 1);

        System.out.println("Quick sort O(n log n) GPT V");
        System.out.println("sorted " + Arrays.toString(arr));
        System.out.println("Loop Iterations = " + inI);
        System.out.println("Recursive invocation = " + inJ);

        System.out.println("Swaps = " + NoOfSwap);
        System.out.println();

        inI = 0;
        inJ = 0;
        NoOfSwap = 0;
        arr = new int[]{800, 20, 60, 9, 900, 1, 2, 3, 3, 77, 92, 22,90,2,87,6, 6};

        quickSort(arr, 0, arr.length - 1);

        System.out.println("Quick sort O(n log n) HIWDI V");
        System.out.println("sorted " + Arrays.toString(arr));
        System.out.println("Loop Iterations = " + inI);
        System.out.println("Recursive invocation = " + inJ);

        System.out.println("Swaps = " + NoOfSwap);
        System.out.println();
    }

    private static void quickSort(int[] arr, int left, int right){

        int index = Partition(arr, left, right);

//        System.out.println(index);
        if(left < index-1){
            inJ++;
            quickSort(arr, left, index-1);
        }
         if (index < right){
             inJ++;
            quickSort(arr, index, right);
        }
    }

    private static int  Partition(int[] arr, int left, int right){

        int pivot = arr[right];
        int l = left-1;
        int r = left;

        while (r <= right){

            inI++;
            if(arr[r] <= pivot){
                l++;
                swap(arr, l, r);
            }

            r++;
//            System.out.println(l);
        }

//        swap(arr, l, right);
//        System.out.println(right);
//        System.out.println(right);
//        int temp = arr[l];
//        arr[l] = pivot;
//        arr[right] = temp;

//        System.out.println(Arrays.toString(arr));
        return l;
    }

    private static void swap(int[] arr, int l, int r){
        NoOfSwap++;
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }

    private static void PROFquicksort(int[] a, int left, int right) {

        int index = PROFpartition(a, left, right);
        if (left < index - 1){
            inJ++;
            PROFquicksort(a, left, index - 1);
        }

        if (index < right){
            inJ++;
            PROFquicksort(a, index, right);
        }

    }

    private static int PROFpartition(int[] a, int left, int right) {
        int i = left;
        int j = right;
        int temp;
        int pivotValue = a[(left + right) / 2];
        while (i <= j) {
            inI++;
            while (a[i] < pivotValue){
                inI++;
                i++;
//                System.out.println("p1");
            }
            while (a[j] > pivotValue){
                inI++;
                j--;
//                System.out.println("p2");
            }
            if (i <= j) {
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
                NoOfSwap++;
            }
        }
//        System.out.println(Arrays.toString(a));
//        System.out.println(">>> " + Arrays.toString(a));
        return i;
    }

    public static void GPTquickSort(int[] arr, int low, int high) {
        if (low < high) {
            // pi is partitioning index, arr[pi] is now at right place
            int pi = GPTpartition(arr, low, high);

            // Recursively sort elements before and after partition
            GPTquickSort(arr, low, pi - 1);
            inJ++;
            GPTquickSort(arr, pi + 1, high);
            inJ++;
        }
    }

    public static int GPTpartition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1); // index of smaller element

        for (int j = low; j < high; j++) {
            inI++;
            // If current element is smaller than or equal to pivot
            if (arr[j] <= pivot) {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                NoOfSwap++;
            }
        }

        // swap arr[i + 1] and arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        NoOfSwap++;

        return i + 1;
    }


}
