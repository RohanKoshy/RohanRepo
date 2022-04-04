package Sorting;
import java.util.ArrayList;

public class MergeSort extends Sortparent{

    public void initiate()
    {
        for(int x=0;x<5000; x++)
        {
            myarr.add(x, (int)(Math.random()*10000));
        }
    }
    public void sortGivenArray(){
            divide(0, myarr.size()-1);
        }

        public void divide(int startIndex,int endIndex){

            //Divide till you breakdown your list to single element
            if(startIndex<endIndex && (endIndex-startIndex)>=1){
                int mid = (endIndex + startIndex)/2;
                divide(startIndex, mid);
                divide(mid+1, endIndex);

                //merging Sorted array produce above into one sorted array
                merger(startIndex,mid,endIndex);
            }
        }

        public void merger(int startIndex,int midIndex,int endIndex){

            //Below is the mergedarray that will be sorted array Array[i-midIndex] , Array[(midIndex+1)-endIndex]
            ArrayList<Integer> mergedmyarr = new ArrayList<Integer>();

            int leftIndex = startIndex;
            int rightIndex = midIndex+1;

            while(leftIndex<=midIndex && rightIndex<=endIndex){
                if(myarr.get(leftIndex)<=myarr.get(rightIndex)){
                    mergedmyarr.add(myarr.get(leftIndex));
                    leftIndex++;
                }else{
                    mergedmyarr.add(myarr.get(rightIndex));
                    rightIndex++;
                }
            }

            //Either of below while loop will execute
            while(leftIndex<=midIndex){
                mergedmyarr.add(myarr.get(leftIndex));
                leftIndex++;
            }

            while(rightIndex<=endIndex){
                mergedmyarr.add(myarr.get(rightIndex));
                rightIndex++;
            }

            int i = 0;
            int j = startIndex;
            //Setting sorted array to original one
            while(i<mergedmyarr.size()){
                myarr.set(j, mergedmyarr.get(i++));
                j++;
            }
        }
        public void sort(){}
    public void print()
    {
        for(int n=0; n<myarr.size();n++)
        {
            System.out.print(myarr.get(n)+", ");
        }
        System.out.println();
    }
}
