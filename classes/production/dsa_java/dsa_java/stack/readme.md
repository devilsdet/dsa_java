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

### NearestSmallerToLeft_03
    Given a array, find the first smaller element which is present on the left side of the element.
    IP: {4, 5, 2, 10, 8}
    OP: {-1, 4, -1, 2, 2}

### NearestSmallerToRight_04
    Given an array, find the first smaller element which is present on the right side of the element.
    IP: {4, 5, 2, 10, 8}
    OP: {2, 2, -1, 8, -1}

### StockSpanProblem_05
    Given stocks for a week, we need to findout all the amount which is consectively smaller
    or equal to that amount in previous days.
    arr: 100 80 60 70 60 75 85
    OP:  1    1  1  2  1  4  6

### MaximumAreaHistogram_07
    Given an array representing height of buildings, find the maximum area of histogram.
    arr[] = {6, 2, 5, 4, 5, 1, 6}
    OP = 12

    A building can be extended if the neighbouring building height are more than smaller building.
    A building can be extended in to building only when other building is greater to the uilding element

    here we need to the following steps: (assumptions -1 as index before starting index and 0 as index last to left)
    1. First calculate NSR
    2. Then calculate NSL
    3. Then caluclate Width[i] = NSR[i] - NSL[i]-1
    4. Then calculate Height[i] = arr[i]
    5. Then calculate Area[i] = Height[i] * Width[i]
    6. Then find the maximum