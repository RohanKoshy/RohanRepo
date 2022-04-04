package Sorting;

public class SortExecute {
    public static void main(String[] args)
    {
        /*Sortparent firstsort=new BubbleSort();
        firstsort.initiate();
        firstsort.sort();
        firstsort.print();
        */
        MergeSort secondsort=new MergeSort();
        secondsort.initiate();
        secondsort.sortGivenArray();
        secondsort.print();
    }
}
