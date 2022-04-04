package Sorting;


import java.time.Duration;
import java.time.Instant;

public class SelectionSort extends Sortparent
{
    public void initiate()
    {
        for(int x=0;x<5000; x++)
        {
            myarr.add(x, (int)(Math.random()*10000));
        }
    }
    public void sort()
        {
            int n = myarr.size();
            for (int i = 0; i < myarr.size()-1; i++)
            {
                // Find the minimum element in unsorted array
                int min_idx = i;
                for (int j = i+1; j < myarr.size(); j++)
                    if (myarr.get(j) < myarr.get(min_idx))
                    {
                        min_idx = j;
                    }
                int temp = myarr.get(min_idx);
                myarr.set(min_idx, myarr.get(i));
                myarr.set(i, temp);
            }

    }

    // Prints the array
    public void print()
    {
        for(int n=0; n<myarr.size();n++)
        {
            System.out.print(myarr.get(n)+", ");
        }
        System.out.println();
    }

    // Driver code to test above
}
