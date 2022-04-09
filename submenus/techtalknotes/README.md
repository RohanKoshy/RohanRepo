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


- **Questions**: No questions



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
