### FindMissingDuplicate_01
    Given a array of 1 to N, find the missing N

    IP: arr  {1, 4, 3, 4, 5}
    OP: 2 (Missing/ 4 Duplciate)

    Here we can solve it using map. 
    Map {1, 1} {4, 2} {3, 1} {5, 1}
    then we will traverse the map with index i(0 , 1 2, .. N). then if the key is not present then its missing
    if the value is more than one, its duplicate.

