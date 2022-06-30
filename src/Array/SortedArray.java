package Array;


import java.util.Arrays;

//Question https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1
public class SortedArray {

//    QuickSort Approach is taking too much time
//
//    static void swap (int a[], int i, int j){
//        int temp = a[i] ;
//        a[i] = a[j];
//        a[j] = temp;
//    }
//
//    static void QuickSort(int a[], int low , int high){
//        if(low<high){
//            int pivot_Place = partition( a,low,high);
//            QuickSort(a, low , pivot_Place-1);
//            QuickSort(a,  pivot_Place+1,high);
//        }
//    }
//
//    static int partition(int a[], int low,int high){
//        int pivot = a[high], leftWall = low-1;
//        for(int i = low ; i <=high-1;i++){
//            if(a[i]<pivot){
//                leftWall++;
//                swap(a,leftWall,i);
//
//            }
//        }
//
//        swap(a,leftWall+1,high);
//        return (leftWall+1);
//
//    }
//
//    static void printArray(int a[],int high){
//        for(int i = 0 ; i <= high;i++){
//            System.out.print(a[i] + " ");
//        }
//        System.out.println();
//    }


    public static void sort012(int a[], int n)
    {
        // code here
//        QuickSort(a,0,n-1);
//        printArray(a,n-1);

         Arrays.sort(a);
    }

    public static void main(String[] args) {
        int N = 5,
        arr[]= {0 ,2, 1, 2, 0};
      sort012(arr,N);
    }
}
