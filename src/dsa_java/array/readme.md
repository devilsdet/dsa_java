## Array Problems

### Maximum_SubArray_01 (LeetCode 53) (Kadanes' Algo)

    Given an integer array nums, find the contigious subarray which has the 
    largest sum and return its sum.
    IP: arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4}
    OP: 6
    Explanation: [4, -1, 2, 1] has the largest sum and is equal to 6

    Theory:

### MaximumSubArrayAllNegative_02 (LeetCode 53) (Kadanes' Algo)

    Given an integer array nums, find the contigious subarray which has the 
    largest sum and return its sum.
    IP: arr = {-49, -48, -1, -5}
    OP: 6
    Explanation: [-1] has the largest sum and is equal to 6

    Theory:

### FindAllDuplicatesInArray_03

    Given an integer array nums of length n where all the integers of nums are in the range 
    [1, n] and each integer appears once or twice, 
    return an array of all the integers that appears twice.

    Input: nums = [4,3,2,7,8,2,3,1]
    Output: [2,3]

    Concept:
        in the array find the index by geting nums[i];Then masrk the nums[i] as negative.
        if again the number comes, that means we visted it. hence mark it as output.