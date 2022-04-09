package Rohanschallenges;

import Sorting.*;

import java.util.*;
import java.time.Duration;
import java.time.Instant;
import java.util.LinkedList;
import java.util.Queue;


public class Menu {
    public static void main(String[] args){
        Menu.menu();
    }
    public static void menu() {


        String[] list = new String[] {"Option 1: Week 0 Challenge 1", "Option 2: Week 0 Challenge 2", "Option 3: Week 0 Challenge 3", "Option 4: Week 1 Challenge 1", "Option 5: Week 1 Challenge 2", "Option 6: Week 1 Challenge 3", "Option 7: Calculator", "Option 8: Week 3 Merge sort", "Option 9: Week 3 Bubble Sort", "Option 10: Week 3 Selection Sort", "Option 11: Week 3 Insertion Sort"};
        double firstcounter=0;
        double secondcounter=0;
        double thirdcounter=0;
        double forthcounter=0;
        for(int i = 0; i < list.length; i++){
            System.out.println(list[i]);
            System.out.println("-------------------------\n");
        }

        System.out.println("Enter your choice:");

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        try {
            System.out.println(list[Integer.parseInt(input)-1]);
        } catch (NumberFormatException e) {
            System.out.println("Add choice");
        } catch (ArrayIndexOutOfBoundsException a){
            System.out.println("Enter number between 1 and " + list.length);
        }

        if(input.equals("1")){
            System.out.println("Objective of first hack applied on menu used to run all code currently");
        }

        if(input.equals("2")){
            IntByReference.swapper(21, 16);
            IntByReference.swapper(16, 21);
            IntByReference.swapper(1231234,4324324);
            IntByReference.swapper(16, -1);
        }
        if(input.equals("3")){

            int[][] keypad=new int[][]{ { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, {-1, 0, -1} };
            Matrix m0 = new Matrix(keypad);
            System.out.println("Keypad:");
            System.out.println(m0);
            int[][] numbers=new int[][]{ { 0, 1 },
                    { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 },
                    { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 } };
            Matrix m1 = new Matrix(numbers);
            System.out.println("Numbers Systems:");
            System.out.println(m1);

        }
        if(input.equals("4")){
            Object[] words = new String[]{"seven", "slimy", "snakes", "sallying", "slowly", "slithered", "southward"};
            QueueManager qWords = new QueueManager("Words", words);
        }
        if(input.equals("5"))
        {
            java.util.Queue qNums1 = new PriorityQueue<Integer>();
            qNums1.add(1);
            qNums1.add(4);
            qNums1.add(5);
            qNums1.add(8);
            //printing queue1
            System.out.println("first queue: " + qNums1);

            //creating queue2
            Queue qNums2 = new PriorityQueue<Integer>();
            qNums2.add(2);
            qNums2.add(3);
            qNums2.add(6);
            qNums2.add(7);
            System.out.println("second queue: " + qNums2);

            //Object[] numbers2 = new Integer[]{2, 3, 6, 7};
            //QueueManager qNums2 = new QueueManager("num2", numbers2);

            //merging Queues
            PriorityQueue merged = MergingQueues.merge(qNums1, qNums2);

            //enhanced for loop to print values in the merged Queue
            System.out.print("Merged Queue: ");
            for (Object data : merged)
                System.out.print(data + " -> ");
            System.out.print("nil");

        }
        if(input.equals("6"))
        {
            Queue<Integer> queue1 = new LinkedList<>();
            reverseQueues ob=new reverseQueues();
            queue1.add(1);
            queue1.add(2);
            queue1.add(3);
            System.out.println("Initial Queue: "+ queue1);

            System.out.print("Reverse Queue: ");
            ob.reverse(queue1);
        }
        if(input.equals("7")) {
            Calculator simpleMath = new Calculator("100 + 200  * 3");
            System.out.println("Simple Math\n" + simpleMath);

            Calculator parenthesisMath = new Calculator("(100 + 200)  * 3");
            System.out.println("Parenthesis Math\n" + parenthesisMath);

            Calculator allMath = new Calculator("200 % 300 + 5 + 300 / 200 + 1 * 100");
            System.out.println("All Math\n" + allMath);

            Calculator allMath2 = new Calculator("200 % (300 + 5 + 300) / 200 + 1 * 100");
            System.out.println("All Math2\n" + allMath2);

            Calculator allMath3 = new Calculator("200 % (300 + 5 + 300) / 200 + 1 * 100 + 5 ^ 2");
            System.out.println("All Math3\n" + allMath3);

// Basically just setting up the sqrt function stuffies bc why not try extra credit
            Calculator sqrt = new Calculator("200 % (300 + 5 + 300) / 200 + 1 * 100 + 5 ^ 2 + sqrt (2*12.5) + 2");
            System.out.println("All Math3\n" + sqrt);
        }
        if(input.equals("8")){
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
        if(input.equals("9")){

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
        if(input.equals("10"))
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
        if(input.equals("11")){
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
    }
}
