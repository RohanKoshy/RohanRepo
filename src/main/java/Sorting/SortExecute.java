package Sorting;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;


public class SortExecute {
    public static void main(String[] args)
    {
            boolean runner=true;
            while(runner=true)
            {
                    System.out.println("Press 1 for Bubble Sort");
                    System.out.println("Press 2 for Merge Sort");
                    System.out.println("Press 3 for Selection Sort");
                    System.out.println("Press 4 for Insertion Sort");
                    Scanner input=new Scanner(System.in);
                    int x=input.nextInt();
                    if(x==1)
                    {
                            int time = 0;
                            final Duration timeElapsed;
                            Sortparent firstsort=new BubbleSort();
                            firstsort.initiate();
                            Instant start = Instant.now();
                            firstsort.sort();
                            Instant end = Instant.now();    // time capture -- end
                            timeElapsed = Duration.between(start, end);
                            firstsort.print();
                            System.out.println();
                            System.out.println("Nanoseconds: " + timeElapsed.getNano());
                            time += timeElapsed.getNano();
                            System.out.println("Total Nanoseconds: " + time );
                            System.out.println("Total Seconds: " + time /1000000000.0);
                    }
                    if(x==2)
                    {
                            int time = 0;
                            final Duration timeElapsed;
                            MergeSort secondsort=new MergeSort();
                            secondsort.initiate();
                            Instant start = Instant.now();
                            secondsort.sortGivenArray();
                            Instant end = Instant.now();    // time capture -- end
                            timeElapsed = Duration.between(start, end);
                            secondsort.print();
                            System.out.println();
                            System.out.println("Nanoseconds: " + timeElapsed.getNano());
                            time += timeElapsed.getNano();
                            System.out.println("Total Nanoseconds: " + time );
                            System.out.println("Total Seconds: " + time /1000000000.0);
                    }
                    if(x==3)
                    {
                            int time = 0;
                            final Duration timeElapsed;
                            SelectionSort thirdsort = new SelectionSort();
                            thirdsort.initiate();
                            Instant start = Instant.now();  // time capture -- start
                            thirdsort.sort();
                            Instant end = Instant.now();    // time capture -- end
                            timeElapsed = Duration.between(start, end);
                            thirdsort.print();
                            System.out.println();
                            System.out.println("Nanoseconds: " + timeElapsed.getNano());
                            time += timeElapsed.getNano();
                            System.out.println("Total Nanoseconds: " + time );
                            System.out.println("Total Seconds: " + time /1000000000.0);
                    }
                    if(x==4)
                    {
                            int time = 0;
                            final Duration timeElapsed;
                            InsertionSort forthsort = new InsertionSort();
                            forthsort.initiate();
                            Instant start = Instant.now();  // time capture -- start
                            forthsort.sort();
                            Instant end = Instant.now();    // time capture -- end
                            timeElapsed = Duration.between(start, end);
                            forthsort.print();
                            System.out.println();
                            System.out.println("Nanoseconds: " + timeElapsed.getNano());
                            time += timeElapsed.getNano();
                            System.out.println("Total Nanoseconds: " + time );
                            System.out.println("Total Seconds: " + time /1000000000.0);
                    }
            }

    }
}
