### MinimumDistanceBetweenStrings
Given a list of words followed by two words, the task to find the minimum distance between the given two words in the list of words

Input:
S = { "the", "quick", "brown", "fox", 
     "quick"}
word1 = "the"
word2 = "fox"
Output: 3
Explanation: Minimum distance between the 
words "the" and "fox" is 3

Input:
S = {"geeks", "for", "geeks", "contribute", 
     "practice"}
word1 = "geeks"
word2 = "practice"
Output: 2
Explanation: Minimum distance between the
words "geeks" and "practice" is 2

###Panagramchecking

Given a string check if it is Pangram or not. A pangram is a sentence containing every letter in the English Alphabet.

Input:
S = Bawds jog, flick quartz, vex nymph
Output: 1
Explantion: In the given input, there
are all the letters of the English
alphabet. Hence, the output is 1.

Input:
S = sdfs
Output: 0
Explantion: In the given input, there
aren't all the letters present in the
English alphabet. Hence, the output
is 0.

### IsomorphicStrings

Given two strings 'str1' and 'str2', check if these two strings are isomorphic to each other.
Two strings str1 and str2 are called isomorphic if there is a one to one mapping possible for every character of str1 to every character of str2 while preserving the order.
Note: All occurrences of every character in ‘str1’ should map to the same character in ‘str2’

Input:
str1 = aab
str2 = xxy
Output: 1
Explanation: There are two different
charactersin aab and xxy, i.e a and b
with frequency 2and 1 respectively.

Input:
str1 = aab
str2 = xyz
Output: 0
Explanation: There are two different
charactersin aab but there are three
different charactersin xyz. So there
won't be one to one mapping between
str1 and str2.
