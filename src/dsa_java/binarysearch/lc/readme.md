### Median of two sorted arrays

There are two sorted arrays A and B of size m and n respectively. 
Find the median of the two sorted arrays.
https://www.youtube.com/watch?v=yD7wV8SyPrc

Example:
    A = [1, 5, 8, 10, 18, 20]
    B = [2, 3, 6, 7]

Bruteforce:
If we merge these two sorted arrays, the resultant array will be
    [1, 2, 3, 5,| 6, 7,| 8, 10, 18, 20]
Now the median will be (6 + 7)/2 = 13/2 = 6.5

Binary Search:
                  |  
    1, 2, 3, 5, 6 | 7, 8, 10, 18, 20
                  |

