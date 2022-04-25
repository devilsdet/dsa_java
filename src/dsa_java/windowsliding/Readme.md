#Introduction Identification Types:

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
		
###MaximumSumSubArrayOfSizeK_01
	Given a array of size n, find the sub array of size k, where sum is 	maximum
	IP: arr: {2, 3, 5, 3, 6, 8}
	k = 3;
	
	OP: 17