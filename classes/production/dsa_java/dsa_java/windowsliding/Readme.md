## Introduction Identification Types:

	Given an array find the sub array of size.
	In this technique, w are given an array or string , we need to identify 
	sub array or substring and we have to find the largest/maximum/longest/
	minimum in a range of k consecutive elements.
	
	This technique can be divided in to two types 
		a. Fix Size window (K given)
		b. Variable size window ( We need to find k)
	## General Format ##
		
		int i = 0;
		int j = 0;
		int windowSize = (j-i+1);
		
		while(j < k) {
			calculations
			if(windowsize < k) {
				j++;
			} else if(windowsize == k) {
				ans == calucation;
				j++;
			} else if(windowsize > k) {
				while(windowsize > k) {
					reverse calculation for i;
					i++;
				}
				j++;
			}
			return ans;
		}
		
### MaximumSumSubArrayOfSizeK_01
	Given a array of size n, find the sub array of size k, where sum is 	maximum
	IP: 	arr: {2, 3, 5, 3, 6, 8}
			k = 3;
	
	OP: 17
	
### FirstNegativeNumberInWindowSizeK_02
	Given a array of size n, find the first minimum in the sub array of size 	k.
	IP: 	arr: {12, -1, -7, 8, -15, 30, 28}
			k = 3
	OP:		{-1, -1, -7, -15, -15, 0}	

### CountOfOccurrenceOfAnagram_03
	Given a String and a pattern find all the anagram of the pattern is 	present in the string
	
	IP: String str = "fxoraxofxo";
		 String pattern = "fox";
	OP: 4	 

### MaximumOfAllSubArrayOfSizeK_04		
	Given an array, we have to find all the elements in the subarray of size 	k.
	IP: arr = [1, 3, -1, -3, 5, 3, 6 7];
		 k = 3;
	OP: {3, 3, 5, 5, 6, 7}	  
	
	Concepts:
	Here we can compare the consecutive elemens and we can update the max eleemnt.
	But once we delete the max element then we should have max eleemnt in remainin k-1 window.
	
### LargestSubArrayOfSumK_05
    Given an array, find the maximum subarray length whose sum is equal to a given sum.
    IP: arr = {4, 1, 1, 1, 2, 3, 5};
        sum = 5
    OP: 4 (1+1+1+2)

### LargestSubStringWithKRepeatingChars_06
    Given a String find the largest substring with k repeated charcaters 

### LargestSubStringWithNoRepeatingCharacters_07
    Given a String find the largest substring with unique charcaters 
	