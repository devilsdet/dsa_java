## Recursion
	Base Induction Hypothesis
	Here we need to find the base condition (Like smaller valid input)
	Then we need to assume something
	Then we need to induce the program;
### Print1ToN_01
	Given an integer 23, we need to print 1 to 23 recursively
	BC: i == 1
			print 1;
	hypothesis : 
			number will loop for n-1;
	Induction:
			number will be printed				
	
### PrintNto1_02
	Given an integer 23, we need to print from 23 to 1 recursively
	
	BC: i == 1
			print 1;
	hypothesis : 
			number will be printed
	Induction:
			number will loop for n-1;
	
### SortAnArrayRecursively_03		
	Given an integer array, sort the array recursively
	BC: if array has one element it is sorted
	Hypothesis:
		remove the last element, call the sort function (which is assumed to 		give you a sorted array)
	Induction: Insert the removed element at right position	

### SortAStackUsinRecursion_04		
	Given a stack, sort the stack recursively.

### DeleteMiddleEleemntInStack_06
	Given a stack, delete the middle element(k) in the stack. The formula to 	find k is 
	k = (size/2) + 1;
	
	Approach:
	Given the input, we need to delete the middle element. That means we need to pop and traverse till kth element from top , then we found kth eleemnt. we pop it. the we insert the earlier popped ones in to the stack.
	
	Hypothesis:
		solve(s, k);
		s.pop();
		solve(s, k-1);
	BC:
		value of k that can be minimum will be one as that will be the top element in stack.
	
	Induction:
		solve(s, k) => store top element => we need to push top element
							solve (s, k-1)
		
		
### TriangularNumber_07	

### ReverseAStackUsingRecursion_09

    Reverse a stack without using extra space.
    Hypothesis:
            Store the top element of the stack. and 
            there is a function that will reverse the stack.
    Induction: 
            We will insert the elemnt at the end of the stack
        Insert Function:
            Hypothesis:
                we wiil remove the top eleemnt of the stack and will put the elemnt in the end of the
                stack. then we will insert at the end.

### KthSymbolOfGrammar_10

We build a table of n rows (1-indexed). We start by writing 0 in the 1st row. 
Now in every subsequent row, we look at the previous row and replace each occurrence of 0 with 01, 
and each occurrence of 1 with 10.

For example, for n = 3, the 1st row is 0, the 2nd row is 01, and the 3rd row is 0110.
Given two integer n and k, return the kth (1-indexed) symbol in the nth row of a table of n rows.

        N=0   0
        N=1   0 1
        N=2   0 1 1 0
        N=3   0 1 1 0 1 0 0 1

Input: n = 2, k = 2
Output: 1
Explanation:
row 1: 0
row 2: 01  

### TowerOfHanoi_11
    IP: number of plates N
        Plates 1 , 2 , 3
    
    void solve(int s, int d, int h, int n){
        if(n == 1) {
            print()
        }
        solve(s, h, d, n-1);
        print(moving n from s to d);
        solve(h, d, s, n-1);
        return;
    }

### AllPermutationOfString_11

We can solve this method by input output method.
Lets consider the following input "ab".

                        output ip
                           ""  "ab"
                        ""    "b"  "ab"
                    ""    ""  "b"   "a" "ab"

so as we can see we are having two output after each iteration (One without the char and other with 
character). When the length of input is zero, we are getting the output.


### PrintUniqueSubsets_12

    Same for 
    Print All Subset (Order is not maintained)
    Print All Subsequence (Order is maintained)
    Print all powerset

    abc = "" a b c ab ac bc abc (Subsequence)
    abc = subsequence + not maintained order

### PermutationWithSpaces_13

Given a string you need to print all possible strings 
that can be made by placing spaces (zero or one) in between them. 
Output should be printed in sorted increasing order of strings.

Input:  str[] = "ABC"
Output: (A B C)(A BC)(AB C)(ABC) . 

This is recursive problem as we have choices and decissions. about space.
So it is basd on IP-OP method approach in solving the problem.

                    OP IP
                ""     "ABC"
            ""     

### LetterCasePermutation_14
Given a string as a1b2, we need to print all the combinatation with both cases .

IP: a1b2
OP: a1b2, A1b2, a1B2, A1B2

### PermutationWithCaseChange_15

IP : ab
OP: AB aB Ab ab

### GenerateAllBalancedParanthesis_16