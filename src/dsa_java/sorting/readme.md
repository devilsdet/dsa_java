### BubbleSort_01

In Bubble sort we compare consecutive elements (i, i+1), If element at i is greater than the element 
at i+1, we will swap the element.
Here after each iteration the element at the end will be the maximum one.
So there is no need to iterate the last element after the first iteration.

### SelectionSort_02

In selection sort we select the index of maximum element and then swap the index with the last one.
Here after first iteration, the maximum will be at the end.
so in next iteration we need to find the maximum element in the range starting from zero to end-1.
In this way we need to find the maximum in shrinking unsorted array window.

### InsertionSort_03

In insertion sort, we select an element from an unsorted array, 
then we insert it in the right position of sorted array.
 sorted \  unsorted
---------\----------------------
|   |   |  |  |  |  |  |  |  |
---------------------------------
we insert the unsorted element in the sorted array by shifting right in the sorted side and putting
the unsorted postion.

### QuickSort_04