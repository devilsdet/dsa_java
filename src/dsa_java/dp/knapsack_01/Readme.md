Knapsack problems are of three types.
    1. 0/1 knapsack (We can take the item once and we can take it as a whole or we cant)
    2. Unbounded Knapsack (We can take the item as a whole and can take it unlimited times)
    3. Fractional Knapsack (We can take items partially)

## 0/1 Knapsack (6)
    1. Subset sum
    2. Equal Sum partition
    3. Count of subset sum
    4. Minimal subset sum difference
    5. Target Sum
    6. Number of subsets with given difference

Given weight array, value array and capacity of bag as 7 kg. we need to find out the items that we
can pick so that we can maximize the profit.
    wt[]  = {1, 3, 4, 5}
    val[] = {1, 4, 5, 7}
    W     =  7 kg
Find out the maximum profitable items we can take

Analysis
    Here we have a choice to take an item and optimal is asked. So we can use DP.
    We can take the item or we can leave the item.

First we have to build a choice diagram
           
            Item1(w1)
            /\
          /    \
        /       \
    -----------   ----------------
    w1 <= W       w1 > W
    -----------   ------------------
(Take it) (Dont)     (dont)

Knapsack function:
    Return type: (int)
     {
        Base Condition
        Choice Diagram 
     }

Base Condition:
    Think of the smallest valid input
    If number of items available or the weight of the knapsack is zero, we cant take any input
        if(n==0 || W==0) {
            return 0;
        }
Recursive function:
    Function will call to self with smaller input.

Code:
    
        knapsack(int[] wt, int[] val, int W, int size)
            if(size==0 || W==0) {
                return 0;
            }
            if(wt[size-1] <= W) {
                return Math.max((val[n-1] + knapsack(wt, val, W-wt[size-1], size-1)),
                        knapsack(wt, val, W, size-1));
            } else if() {
                return knapsack(wt, val, W, size-1);
            }

### 
            

        