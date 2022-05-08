### MergeSort_01

The heart of the mergesort algorithm is the merging of two already-sorted arrays.
Merging two sorted arrays A and B creates a third array, C, that contains all the
elements of A and B, also arranged in sorted order. We’ll examine the merging
process first; later we’ll see how it’s used in sorting.

The idea in the mergesort is to divide an array in half, sort each half, and then use
the merge() method to merge the two halves into a single sorted array

    recursiveMergeSort(arr, low, high);
    merge(arr, low, mid, high)
