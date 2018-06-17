# LargestNumberFromIntArray

Given a list of non negative integers, arrange them such that they form the 
largest number.

For example, given [3, 30, 34, 5, 9], the largest formed number is 9534330.

Note: The result may be very large, so you need to return a string instead of an 
integer.

# Solution:

1. An integer array is received as parameter in the function. 

2. Convert each element of the array from int to string. String.valueOf(nums[i]);

3. Create a new comparator and override compare function 

4. sort the string array passing in the comparator

5. Array will be sorted in ascending order

6. run a loop and concatenate elements of sorted array 

7. return the result
