# Introduction
    The Fast & Slow pointer approach, also known as the Hare & Tortoise algorithm, 
    is a pointer algorithm that uses two pointers which move through the array (or sequence/LinkedList) 
    at different speeds. 
    This approach is quite useful when dealing with cyclic LinkedLists or arrays.
    By moving at different speeds (say, in a cyclic LinkedList), 
    the algorithm proves that the two pointers are bound to meet. 
    The fast pointer should catch the slow pointer once both the pointers are in a cyclic loop.

## CyclicLinkedList_01
    Given the head of a Singly LinkedList, 
    write a function to determine if the LinkedList has a cycle in it or not.

    EX: head --> 1 --> 2 --> 3 --> 4 --> 5 --> 6 --> 1
    EX: head --> 2 --> 4 --> 6 --> 8 --> 10 --> null