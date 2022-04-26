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
		
		
	
	