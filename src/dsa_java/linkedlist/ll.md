### Reverse Linked list

Concept:
    we need to maintain three pointers.
    CurrentNode
    NextNode
    PreviousNode
We will initialize these nodes with head (currentnode and NextNode) and previous as (null)

    we will have a loop untill we have nextnode points to null
    In every iteration.
        First we need to move next to next pointer (so that we can keep track of the next node)
        Second we can disconnect current node from linkedlist and can assign it to previousnode.
        Then our previuos node will become current node with no connection to next node
        Then we need to again assign next node to current node.

    Finally we have answer with previous node.

    Here the catch is disconnect current node from next node and assign it to prev node.
    Then we need to again prev node.