### BinarySearch_01
Given a sorted array find the index of the element. If the element is not found return -1

### BinarySearchInDescendingSortedArray_02
Given a descending sorted array find the index of the element. If the element is not found return -1

### OrderAgnosticSearch_03
Given a sorted array (But we are not sure about the sorted order), we have to find a particular
element.

### FirstOccurrenceOfAnElemntSortedArray_04
Given a sorted array, find the first occurrence of an element.
IP: arr[] = {2, 4, 10, 10, 10, 18, 20}
OP: First Occurrence Index = 2

### LastOccurrenceOfAnElemntSortedArray_05
Given a sorted array, find the Last occurrence of an element.
IP: arr[] = {2, 4, 10, 10, 10, 18, 20}
OP: Last Occurrence Index = 4

### CountOfAnElementInSortedArrat_06
Given a sorted array, print the number of times one given element is present.
IP: arr[] = {2, 4, 10, 10, 10, 18, 20}
OP: Number of element = 3

Theory:
    Count of Element = (Last occurrence of element - First Occurrence of element) + 1;

### NumberOfTimesASortedArrayIsRotated_07

Given a sorted rotated array, find the number of times it is rotated.
IP: arr[] = {11, 12, 15, 18, 2, 5, 6, 8}
OP: 4

Theory:
    The number of times the array is roated is the index of the smallest element in
the array. To fin dthe smallest element, we know it should be smaller than the both of the 
neighbours.
