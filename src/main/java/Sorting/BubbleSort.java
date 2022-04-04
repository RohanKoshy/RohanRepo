package Sorting;
import java.lang.Math;

public class BubbleSort extends Sortparent{

    public void initiate()
    {
        for(int x=0;x<5000; x++)
        {
            myarr.add(x, (int)(Math.random()*10000));
        }
    }
    public void sort()
    {
        for(int i=0; i<myarr.size()-1; i++)
        {
            for(int j=0;j<myarr.size()-i-1; j++)
            {
                if(myarr.get(j+1)>myarr.get(j))
                {
                    int temp=myarr.get(j);
                    myarr.set(j, myarr.get(j+1));
                    myarr.set(j+1, temp);
                }
                else
                {

                }
            }
        }
    }
    public void print()
    {
        for(int n=0; n<myarr.size();n++)
        {
            System.out.print(myarr.get(n)+", ");
        }
        System.out.println();
    }
}
