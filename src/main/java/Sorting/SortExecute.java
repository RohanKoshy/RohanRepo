package Sorting;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;


public class SortExecute {
    public static void main(String[] args)
    {
            boolean runner=true;
            System.out.println("Press 1 for Bubble Sort");
            System.out.println("Press 2 for Merge Sort");
            System.out.println("Press 3 for Selection Sort");
            System.out.println("Press 4 for Insertion Sort");
            double firstcounter=0;
            double secondcounter=0;
            double thirdcounter=0;
            double forthcounter=0;
            while(runner=true)
            {
                    Scanner input=new Scanner(System.in);
                    int x=input.nextInt();
                    if(x==1)
                    {
                            for(int f=0; f<12;f++)
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
                                    firstcounter+=(time /1000000000.0);

                            }
                            firstcounter=firstcounter/12;
                            System.out.println();
                            System.out.println("Overall time to run");
                            System.out.println(firstcounter);

                    }
                    else if(x==2)
                    {
                            for(int r=0;r<12;r++) {
                                    int time = 0;
                                    final Duration timeElapsed;
                                    MergeSort secondsort = new MergeSort();
                                    secondsort.initiate();
                                    Instant start = Instant.now();
                                    secondsort.sortGivenArray();
                                    Instant end = Instant.now();    // time capture -- end
                                    timeElapsed = Duration.between(start, end);
                                    secondsort.print();
                                    System.out.println();
                                    System.out.println("Nanoseconds: " + timeElapsed.getNano());
                                    time += timeElapsed.getNano();
                                    System.out.println("Total Nanoseconds: " + time);
                                    System.out.println("Total Seconds: " + time / 1000000000.0);
                                    secondcounter+=(time /1000000000.0);
                            }
                            secondcounter=secondcounter/12;
                            System.out.println();
                            System.out.println("Overall time to run");
                            System.out.println(secondcounter);
                    }
                    else if(x==3)
                    {
                            for(int k=0;k<12;k++) {
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
                                    System.out.println("Total Nanoseconds: " + time);
                                    System.out.println("Total Seconds: " + time / 1000000000.0);
                                    thirdcounter+=(time /1000000000.0);
                            }
                            thirdcounter=thirdcounter/12;
                            System.out.println();
                            System.out.println("Overall time to run");
                            System.out.println(thirdcounter);
                    }
                    else if(x==4)
                    {
                            for(int l=0;l<12;l++)
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
                                    forthcounter+=(time /1000000000.0);
                            }
                            forthcounter=forthcounter/12;
                            System.out.println();
                            System.out.println("Overall time to run");
                            System.out.println(forthcounter);
                    }
                    else {
                            runner = false;
                    }

                    }
            }


    }


