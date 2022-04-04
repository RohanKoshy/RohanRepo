package Sorting;

import java.time.Duration;
import java.time.Instant;

public class InsertionSort extends Sortparent{
    public void initiate()
    {
        for(int x=0;x<5000; x++)
        {
            myarr.add(x, (int)(Math.random()*10000));
        }
    }
    public void sort()
    {
        for (int i = 1; i < myarr.size(); ++i) {
            int key = myarr.get(i);
            int j = i - 1;

            /* Move elements around like a good old sorting algorithm */
            while (j >= 0 && myarr.get(j) > key) {
                myarr.set((j+1), myarr.get(j));
                j = j - 1;
            }
            myarr.set((j + 1), key);
        }
    }

    /* print array of size n*/
    public void print()
    {
        for(int n=0; n<myarr.size();n++)
        {
            System.out.print(myarr.get(n)+", ");
        }
        System.out.println();
    }
}
