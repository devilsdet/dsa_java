## Stack:

Most of the stacks questions are on array. If we approach any problem and we find there is a chance to use two for loops . And suppose the inner loop is dependent on outer loop, then there is 100% chance that we should use stack.

	for(int i=0; i<n; i++) {
	| j = 0 to i; j++
	| j = i to 0; j--
	| j = i to n; j++
	| j = n to 0; j--
	} 
	
	Here j is a fucntion of I and second loop is dependent on i. So we should            	think of stack
	
### NearestGreaterToRight_01
Given an array, find the largest element which is near to the element

	IP: {1, 3, 2, 4}
	OP: {3, 4, 4, -1}
	
	IP: {1, 3, 0, 0, 1, 2, 4}
	OP: {3, 4, 1, 1, 2, 4, -1}

	Here we can follow bruteforce approach and as we notice the value of inner loop is dependent on j. hence we should think of stack
	
	for(int i = 0; i< arr.length; i++) {
		for(int j = i+1; j<arr.length; j++) {
			if(arr[j] > arr[i]) {
				break;
			}
		}
	}	
	
	In stack implementation we should start i from end of the arr length;

### NearestGreaterToLeft_02
    Given a array, find the first largest element which is present on the left side of the element
    IP: arr = {1, 3, 2, 4}
    OP: arr = {-1, -1, 3, -1}