|[Home](.)| [ReviewTickets](../reviewtickets) | [TechTalk Notes ](.)| [Problem solutions (commit/links) ](../problemsolutions)| [Ap exam plan ](../testprepplan)|
  
# Tech Talk notes
**- Tech Talk 0:**

- **Overarching concept/notes**:
- Data structures are methods for organizing data.
- Two types of paradigms(methodology for approaching problem with Data Structures)
-  Imperitive Paradigm
-  Object Oriented Paradigm
-  Algorithims go hand-in-hand with Data Structures for sorting, searching etc.
 

- **Questions**:
-How do the data structures we worked with in second trimester such as LinkedLists and arrays, compare to the features of Hashmaps?

**- Tech Talk 1:**

- **Overarching concept/notes**:
* Linked Lists are dynamic, compared to arrays or Hashmaps. 
* Question: Why are Linked Lists used and what advantage do they have compared to other forms of Data Structures?
* Question: How do you iterate through a for loop? Does it have an index?
* A Queue is another data structure related to linked lists designed to have values inputted at the end of the structure, and deleted at the beginning of the structure.
* Queues need their beginning(head node), ending(tail node), and current(the current node) tracked for all its functions.

Generic T
It can be used for any type and represents a generic type class.

- **Questions**
- Question: How are Linkedlists crucial for a Queue?
Questions: What is Push entry and pop extraction?

**- Tech Talk 2:**

- **Overarching concept/notes**:
- Calculator
Uses stacks to individualize each element of a calculator equation, then seperate between numbers and operations, then ogranize between order of operations. Then bring two numbers from the numbers stack and use the selected operator to solve individualized equations.
# Calculator Code Snippets
```
public class Calculator {

    private final String expression;
    private ArrayList<String> tokens;
    private ArrayList<String> reverse_polish;
    private Double result;

    private final Map<String, Integer> OPERATORS = new HashMap<>();
    {
        // Map<"token", precedence>
        OPERATORS.put("*", 3);
        OPERATORS.put("/", 3);
        OPERATORS.put("%", 3);
        OPERATORS.put("+", 4);
        OPERATORS.put("-", 4);
        OPERATORS.put("^", 2);
        OPERATORS.put("sqrt", 2);
    }

    private final Map<String, Integer> SEPARATORS = new HashMap<>();
    {
        SEPARATORS.put(" ", 0);
        SEPARATORS.put("(", 0);
        SEPARATORS.put(")", 0);
    }

```
* Key instance variables
* Map<"separator", not_used>
```
    public String toString() {
        return ("Original expression: " + this.expression + "\n" +
                "Tokenized expression: " + this.tokens.toString() + "\n" +
                "Reverse Polish Notation: " +this.reverse_polish.toString() + "\n" +
                "Final result: " + String.format("%.2f", this.result));
    }

    public static boolean isNumeric(String n){
        try {
            double d = Double.parseDouble(n);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
```
* Print the expression, terms, and result
```
    private void rpnToResult()
    {
   
        Stack calculation = new Stack();

        
        for(int i = 0; i < this.reverse_polish.size(); i++)
        {
            
            if (isNumeric(this.reverse_polish.get(i))){
                calculation.push(this.reverse_polish.get(i));

                
            }
          
            else{

                if(this.reverse_polish.get(i).equals("sqrt")){
                    calculation.push(Math.pow(Double.parseDouble(calculation.pop().toString()),0.5));
                }
                else{
                    Double first = Double.parseDouble(calculation.pop().toString());
                    Double second = Double.parseDouble(calculation.pop().toString());
                    switch(this.reverse_polish.get(i)){
                        case "+":
                            calculation.push(second + first);
                            break;
                        case "-":
                            calculation.push(second - first);
                            break;
                        case "*":
                            calculation.push(second * first);
                            break;
                        case "/":
                            calculation.push(second / first);
                            break;
                        case "%":
                            calculation.push(second % first);
                            break;
                        case "^" :
                            calculation.push(Math.pow(second, first));

                    }
                }
            }
        }
```
* Takes RPN and produces a final result
* Stack used to hold calculation while process RPN
* for loop to process RPN
* Push number to stack
* Setting up sqrt function as an exponent to the 0.5 power.
* Pop the two top entries
* Based off of Token operator calculate result
* Push result back onto the stack


- **Questions**: 
- Why did the first calculators have to have their equations inputted in reverse-polish notation rather than reformatting the symbols?

**- Tech Talk 3:**


- **Overarching concept/notes**:
- Sorts
- Four sorts we are learning; Bubble Sort, Insertion Sort, Merge Sort, and Selection Sort.

- **Bubble Sort**:
- Bubble sorts compare each value to the next term and if the value is greater, a swap method is called to swap the elements in the array
- It is called a bubble sort, becuase by repeatedly switching values using comparisons to neighboring data points, the highest values "bubble" to the end 
of the sort in ascending order.
```
for(int i=0; i<myarr.size()-1; i++)
        {
            for(int j=0;j<myarr.size()-i-1; j++)
            {
                if(myarr.get(j)>myarr.get(j+1))
                {
                    int temp=myarr.get(j+1);
                    myarr.set(j+1, myarr.get(j));
                    myarr.set(j, temp);
                }
                else
                {

                }
            }
        }
```
- **Merge Sort**:
- Merge sorts take a data structure and divide it into individual elements
- Then, it will begin recombining to form two arraylists, and sort between these uncompleted arraylists while incorperating the elements back together
- Much faster, because sorting two arraylists of half the size is much quicker than the entire arraylist
```
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
```
- **Insertion Sort**:
- Insertion Sort works by taking each individual element in a data structure and comparing it's value to it's adjacent values. If a swap is required,
then, the entire data structure is shifted to the right to allocate space for the element, and it is inserted into the correct spot.
- This occurs several times for each element to be placed in the correct placement.
```
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
```
- **Selection Sort**:
- Selection Sort is about taking the smallest element in the data structure and bringing it to the front.
- Then, once the smallest value is found, it replaces the current head of the data structure and the process is repeating
- For loop incrementally looks at less and less data points because each loop solidifies smallest data point read in it's appropriate position.
```
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
```

- **Analysis of Sorts**: 


- **Big O Complexity**: 
- Big O Complexity is a combination of the time it take for a program to run(Basically the efficiency of the program)
- In relation to sorts, the expressions for Big O complexity for each sort determines for a data structure of n length, the runtime scales based on the Big O complexity


- - **Data**: 


| Sorting Algorithm        | Big O complexity          | Time(Seconds)       |
| :----------------------- |:-------------------------:| -------------------:|
| Insertion                | (Worst) O(n²) (Best) O(n) | 0.09334066666666667 |
| Selection                | O(n²)                     |   0.13025025        |
| Merge                    | O(nlogn)                  |    0.0244405        |
| Bubble                   | O(n²)                     |    0.114628752      |



- **Questions**: 
- How does Quick Sorting compare to the efficiency of these other four sorting algorithms?



**- Tech Talk 4:**

- **Overarching concept/notes**:


- **Questions**:


**- Tech Talk 5:**

- **Overarching concept/notes**:


- **Questions**:


**- Tech Talk 6:**

- **Overarching concept/notes**:



- **Questions**:


**- Tech Talk 7:**

- **Overarching concept/notes**:


- **Questions**:


**- Tech Talk 8:**

- **Overarching concept/notes**:


- **Questions**:


**- Tech Talk 9:**

- **Overarching concept/notes**:


- **Questions**:



**- Tech Talk 10:**
- **Overarching concept/notes**:


- **Questions**:
